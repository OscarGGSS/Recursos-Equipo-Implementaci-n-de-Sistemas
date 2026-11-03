package modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Representa el detalle de una orden de compra en el subsistema de compras.
 * Responsabilidad principal:
 * Subsistema: Compras
 * Relacióm con otros componentes:
 * Reglas de negocio:
 * @author Islas López Isis Jezabel
 * Fecha de inicio: 24-20-2026
 * Fecha de última modificación: 24-10-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrdenCompraDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdenCuentaDetalle;

    private int idOrdenCompra;

    private int idArticulo;

    private int cantidadSolicitada;

    private double costoUnitario;

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