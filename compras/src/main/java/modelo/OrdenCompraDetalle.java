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
 * Representa el detalle (partida) de un artículo dentro de una orden de compra.
 * Responsabilidad principal: Desglosar qué artículo específico se está pidiendo, 
 * en qué cantidad, y ser responsable de calcular su propio importe estimado.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Pertenece estrictamente a una única OrdenCompra
 * - Se vincula mediante un ID con el catálogo de Artículos del subsistema de Inventario.
 * Reglas de negocio:
 * - La cantidad solicitada y el costo unitario deben ser válidos para calcular el importe.
 * - El método calcularImporte() es responsabilidad exclusiva de esta clase (cantidadSolicitada * costoUnitario).
 * @author Islas López Isis Jezabel, Oscar Gonzalez Saucedo Equipo 1
 * Fecha de creación: 24-20-2026
 * Fecha modificación: 05-11-2026
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
