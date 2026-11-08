package fca.imple.compras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal y punto de entrada para la ejecución del subsistema de compras en Spring Boot.
 * Responsabilidad principal: Inicializar el contexto de la aplicación, levantar el contenedor de inversión
 * de control y coordinar el escaneo de componentes y entidades del subsistema.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Escanea y administra el ciclo de vida de los componentes en los paquetes modelo, repositorio y servicio.
 * Reglas de negocio:
 * - Debe asegurar la inicialización correcta de las fuentes de datos y las entidades JPA antes de recibir peticiones.
 *
 * @author Islas López Isis Jezabel, Óscar González Saucedo Equipo 1
 * Fecha creación: 07-11-2026
 * Fecha modificación: 07-11-2026
 */
@SpringBootApplication(scanBasePackages = {"fca.imple.compras", "modelo", "repositorio", "servicio"})
public class ComprasApplication {

	/**
	 * Punto de entrada de la aplicación en la máquina virtual de Java.
	 * Información de Modificación: Configuración de arranque para inicializar el framework Spring Boot.
	 * Información de Tablas, Entidades o Componentes: Inicializa todos los beans y el motor de persistencia de Compras.
	 * Reglas de Negocio: No aplica lógica de negocio directa.
	 *
	 * @param args argumentos de línea de comandos proporcionados al iniciar la ejecución.
	 * @author Islas López Isis Jezabel, Óscar González Saucedo Equipo 1
	 * Fecha creación: 07-11-2026
	 * Fecha modificación: 07-11-2026
	 */
	public static void main(String[] args) {
		SpringApplication.run(ComprasApplication.class, args);
	}
}