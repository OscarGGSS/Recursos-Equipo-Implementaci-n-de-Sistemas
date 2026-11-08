package fca.imple.compras.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
  * Representa el detalle de una compra en el subsistema de compras.
  * Responsabilidad principal: Almecena los datos completos de una compra, incluyendo la cantidad de artículos que se solicitaron.
  * Subsistema: Compras
  * Relacióm con otros componentes:
  * Reglas de negocio:
  * @author: Islas López Isis Jezabel Equipo 1
  * Fecha de Creación: 22-20-2026
  * Fecha de Modificación: 22-10-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CompraDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompraDetalle;

    private int idCompra;

    private int idArticulo;

    private int cantidadRecibida;

    private double costoUnitario;

    private double descuento;

    private double importe;

    /**
     * Descripción:
     * @throws:
     * Información de Modificación:
     * Información de Tablas, Entidades o Componentes:
     * Reglas de Negocio;
     * @author
     * Fecha de creación:
     * Fecha de modificación:
     */

    public double calcularImporte(){

        return 0;

    }
}
