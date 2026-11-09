package fca.imple.compras.repositorio;

import fca.imple.compras.modelo.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CompraRepositorio extends JpaRepository<Compra, Integer> {


    List<Compra> findByFechaCompraBetween(LocalDate fechaInicio, LocalDate fechaFin);

    List<Compra> findByIdProveedor(Integer idProveedor);

    List<Compra> findByEstado(String estado);

    List<Compra> findByIdProveedorAndFechaCompraBetween(Integer idProveedor, LocalDate fechaInicio, LocalDate fechaFin);

}