package fca.imple.compras.servicio;

import fca.imple.compras.modelo.OrdenCompra;
import fca.imple.compras.modelo.OrdenCompraDetalle;
import fca.imple.compras.repositorio.OrdenCompraDetalleRepositorio;
import fca.imple.compras.repositorio.OrdenCompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase de servicio que implementa la lógica de negocio y persistencia para OrdenCompra.
 * Propósito: Administrar la gestión de solicitudes de compra y coordinar consultas especializadas con Spring Data JPA.
 * Responsabilidad principal: Centralizar la orquestación de cabeceras de órdenes, partidas y reglas de estado comercial.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Implementa la interfaz IOrdenCompraServicio.
 * - Inyecta OrdenCompraRepositorio y OrdenCompraDetalleRepositorio.
 * Reglas de negocio:
 * - Verifica la existencia previa de la orden antes de actualizar o consultar partidas.
 *
 * @author Óscar González Saucedo Equipo 1
 * Fecha creación: 07-11-2026
 * Fecha modificación: 07-11-2026
 */
@Service
public class OrdenCompraServicio implements IOrdenCompraServicio {

    @Autowired
    private OrdenCompraRepositorio ordenCompraRepositorio;

    @Autowired
    private OrdenCompraDetalleRepositorio ordenCompraDetalleRepositorio;

    @Override
    public boolean insertarOrdenCompra(OrdenCompra ordenCompra) {
        if (ordenCompra == null) return false;
        ordenCompraRepositorio.save(ordenCompra);
        return true;
    }

    @Override
    public boolean modificarOrdenCompra(OrdenCompra ordenCompra) {
        if (ordenCompra == null || ordenCompra.getIdOrdenCompra() == null) return false;
        if (ordenCompraRepositorio.existsById(ordenCompra.getIdOrdenCompra())) {
            ordenCompraRepositorio.save(ordenCompra);
            return true;
        }
        return false;
    }

    @Override
    public boolean borrarOrdenCompra(int idOrdenCompra) {
        if (ordenCompraRepositorio.existsById(idOrdenCompra)) {
            ordenCompraRepositorio.deleteById(idOrdenCompra);
            return true;
        }
        return false;
    }

    @Override
    public OrdenCompra consultarDetalleOrdenCompra(int idOrdenCompra) {
        return ordenCompraRepositorio.findById(idOrdenCompra).orElse(null);
    }

    @Override
    public List<OrdenCompraDetalle> consultarPartidasOrdenCompra(int idOrdenCompra) {
        return ordenCompraDetalleRepositorio.findByIdOrdenCompra(idOrdenCompra);
    }

    @Override
    public List<OrdenCompra> consultarOrdenesPendientesPorProveedor(int idProveedor) {
        return ordenCompraRepositorio.findByIdProveedorAndEstado(idProveedor, "Pendiente");
    }

    @Override
    public List<OrdenCompra> consultarOrdenesPendientesPorArticulo(int idArticulo) {
        return ordenCompraRepositorio.consultarOrdenesPendientesPorArticulo(idArticulo);
    }

    @Override
    public List<OrdenCompra> consultarOrdenesCanceladas(LocalDate inicio, LocalDate fin, int idProveedor) {
        return ordenCompraRepositorio.findByFechaCreacionBetweenAndIdProveedorAndEstado(inicio, fin, idProveedor, "Cancelada");
    }
}