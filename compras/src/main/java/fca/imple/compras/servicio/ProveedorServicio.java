package fca.imple.compras.servicio;

import fca.imple.compras.modelo.Proveedor;
import fca.imple.compras.repositorio.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase de servicio que implementa la lógica de negocio y operaciones de persistencia para Proveedor.
 * Propósito: Gestionar el ciclo de vida y las consultas del catálogo de proveedores integrando Spring Data JPA.
 * Responsabilidad principal: Servir como intermediario entre la interfaz de usuario y el repositorio de acceso a datos.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Implementa la interfaz IProveedorServicio.
 * - Inyecta y delega operaciones en ProveedorRepositorio.
 * Reglas de negocio:
 * - Valida la existencia del registro antes de ejecutar actualizaciones o bajas.
 *
 * @author Óscar González Saucedo Equipo, Islas López Isis Jezabel 1
 * Fecha creación: 07-11-2026
 * Fecha modificación: 08-11-2026
 */
@Service
public class ProveedorServicio implements IProveedorServicio {

    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    @Override
    public boolean insertarProveedor(Proveedor proveedor) {
        if (proveedor == null) return false;
        proveedorRepositorio.save(proveedor);
        return true;
    }

    @Override
    public boolean modificarProveedor(Proveedor proveedor) {
        if (proveedor == null || proveedor.getIdProveedor() == null) return false;
        if (proveedorRepositorio.existsById(proveedor.getIdProveedor())) {
            proveedorRepositorio.save(proveedor);
            return true;
        }
        return false;
    }

    @Override
    public boolean borrarProveedor(int idProveedor) {
        if (proveedorRepositorio.existsById(idProveedor)) {
            proveedorRepositorio.deleteById(idProveedor);
            return true;
        }
        return false;
    }

    @Override
    public List<Proveedor> consultarListaProveedores() {
        return proveedorRepositorio.findAll();
    }

    @Override
    public Proveedor consultarProveedorPorIdONombre(int idProveedor, String nombre) {
        return proveedorRepositorio.findTop1ByIdProveedorOrNombre(idProveedor, nombre);
    }

    @Override
    public List<Integer> consultarArticulosPorProveedor(int idProveedor) {
        return proveedorRepositorio.consultarArticulosPorProveedor(idProveedor);
    }
}