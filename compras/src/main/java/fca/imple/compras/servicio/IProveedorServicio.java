package fca.imple.compras.servicio;

import fca.imple.compras.modelo.Proveedor;
import java.util.List;

/**
 * Interfaz que define las operaciones del servicio de proveedores.
 * Propósito: Establecer el contrato formal de los métodos de gestión y consulta de proveedores.
 * Responsabilidad principal: Delimitar las operaciones disponibles para el catálogo y reglas comerciales de proveedores.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Es implementada por la clase ProveedorServicio.
 * - Es consumida por la capa de interfaz de usuario en ComprasApplication.
 * Reglas de negocio:
 * - Todo proveedor manipulado debe apegarse a las restricciones de unicidad fiscal y datos bancarios completos.
 *
 * @author Óscar González Saucedo Equipo 1
 * Fecha creación: 07-11-2026
 * Fecha modificación: 07-11-2026
 */
public interface IProveedorServicio {

    boolean insertarProveedor(Proveedor proveedor);
    boolean modificarProveedor(Proveedor proveedor);
    boolean borrarProveedor(int idProveedor);
    List<Proveedor> consultarListaProveedores();
    Proveedor consultarProveedorPorIdONombre(int idProveedor, String nombre);
    List<Integer> consultarArticulosPorProveedor(int idProveedor);
}