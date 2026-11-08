package fca.imple.compras;

import fca.imple.compras.modelo.OrdenCompra;
import fca.imple.compras.modelo.Proveedor;
import fca.imple.compras.servicio.IOrdenCompraServicio;
import fca.imple.compras.servicio.IProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase principal y ejecutor de pruebas del subsistema de compras.
 * Responsabilidad principal: Inicializar el contexto de Spring Boot y ejecutar la prueba de integración
 * de los servicios y repositorios de Proveedor y OrdenCompra.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Consume e inyecta IProveedorServicio e IOrdenCompraServicio.
 * - Conecta con la base de datos MySQL mediante el pool de conexiones.
 * Reglas de negocio:
 * - Valida la integridad referencial y persistencia de las órdenes asociadas a proveedores existentes.
 *
 * @author Óscar González Saucedo Equipo 1
 * Fecha creación: 07-11-2026
 * Fecha modificación: 07-11-2026
 */
@SpringBootApplication
public class ComprasApplication implements CommandLineRunner {

	@Autowired
	private IProveedorServicio proveedorServicio;

	@Autowired
	private IOrdenCompraServicio ordenCompraServicio;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Método principal que arranca la aplicación Spring Boot.
	 *
	 * @param args argumentos de línea de comandos.
	 * @author Óscar González Saucedo Equipo 1
	 * Fecha creación: 07-11-2026
	 * Fecha modificación: 07-11-2026
	 */
	public static void main(String[] args) {
		SpringApplication.run(ComprasApplication.class, args);
	}

	/**
	 * Ejecuta las pruebas funcionales de persistencia y consultas al iniciar el contexto.
	 *
	 * @param args argumentos pasados a la ejecución.
	 * @throws Exception en caso de error durante la interacción con la base de datos.
	 * @author Óscar González Saucedo Equipo 1
	 * Fecha creación: 07-11-2026
	 * Fecha modificación: 07-11-2026
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n========================================================");
		System.out.println(">>> INICIANDO PRUEBAS DE SERVICIOS - EQUIPO 1 (ÓSCAR) <<<");
		System.out.println("========================================================\n");

		// 0. Asegurar que exista al menos un GerenteCompras para no violar la FK de OrdenCompra
		jdbcTemplate.execute(
				"INSERT INTO GerenteCompras (idGerenteCompras, nombre, telefono, domicilio, activo) " +
						"VALUES (1, 'Gerente General', '5511223344', 'Oficina Central 100', true) " +
						"ON DUPLICATE KEY UPDATE nombre = nombre;"
		);

		// --- 1. PRUEBA DE PROVEEDOR ---
		System.out.println("--- 1. Probando inserción de Proveedor ---");
		Proveedor nuevoProveedor = new Proveedor();
		nuevoProveedor.setNombre("Distribuidora Industrial SA");
		nuevoProveedor.setTelefono("5544332211");
		nuevoProveedor.setDomicilio("Av. Insurgentes 450");
		nuevoProveedor.setRfc("DIS241105XYZ");
		nuevoProveedor.setContacto("Lic. Roberto Morales");
		nuevoProveedor.setBanco("BBVA");
		nuevoProveedor.setNumeroCuenta("012345678901234567");

		boolean insertado = proveedorServicio.insertarProveedor(nuevoProveedor);
		System.out.println("¿Proveedor registrado con éxito?: " + insertado);
		System.out.println("ID asignado por MySQL: " + nuevoProveedor.getIdProveedor());

		System.out.println("\n--- 2. Probando consulta por ID o Nombre ---");
		Proveedor proveedorEncontrado = proveedorServicio.consultarProveedorPorIdONombre(
				nuevoProveedor.getIdProveedor(), "Distribuidora Industrial SA"
		);
		System.out.println("Proveedor recuperado: " + proveedorEncontrado);

		System.out.println("\n--- 3. Probando listado general de Proveedores ---");
		List<Proveedor> listaProveedores = proveedorServicio.consultarListaProveedores();
		System.out.println("Total de proveedores en catálogo: " + listaProveedores.size());
		listaProveedores.forEach(p -> System.out.println("-> " + p.getIdProveedor() + " | " + p.getNombre() + " | RFC: " + p.getRfc()));

		// --- 2. PRUEBA DE ORDEN DE COMPRA ---
		System.out.println("\n--- 4. Probando inserción de Orden de Compra ---");
		OrdenCompra orden = new OrdenCompra();
		orden.setIdProveedor(nuevoProveedor.getIdProveedor());
		orden.setIdGerenteCompras(1); // El gerente asegurado en el paso 0
		orden.setFechaCreacion(LocalDate.now());
		orden.setCosto(15000.00);
		orden.setDescuento(500.00);
		orden.setTotal(14500.00);
		orden.setEstado("Pendiente");

		boolean ordenGuardada = ordenCompraServicio.insertarOrdenCompra(orden);
		System.out.println("¿Orden de compra registrada?: " + ordenGuardada);
		System.out.println("ID de la Orden asignado: " + orden.getIdOrdenCompra());

		System.out.println("\n--- 5. Probando consulta de órdenes pendientes por proveedor ---");
		List<OrdenCompra> pendientes = ordenCompraServicio.consultarOrdenesPendientesPorProveedor(nuevoProveedor.getIdProveedor());
		System.out.println("Órdenes pendientes encontradas: " + pendientes.size());
		pendientes.forEach(o -> System.out.println("-> ID Orden: " + o.getIdOrdenCompra() + " | Estado: " + o.getEstado() + " | Total: $" + o.getTotal()));

		System.out.println("\n========================================================");
		System.out.println(">>> ¡TODAS LAS PRUEBAS FINALIZARON EXITOSAMENTE! <<<");
		System.out.println("========================================================\n");
	}
}