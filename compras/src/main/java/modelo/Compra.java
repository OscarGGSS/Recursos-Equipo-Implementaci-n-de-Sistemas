package modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

/**
 * Representa a una compra en el subsistema de compras.
 * Responsabilidad principal: Administrar y registrar las compras efectuadas a los proveedores
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Se relaciona con las clases "CompraDetalle", "CuentaPorPagar", "Proveedor" Y "OrdenCompra"
 * Reglas de negocio:
 * - Se captura el número de factura del proveedor
 * - Se registran por separado las tres fechas: Fecha de la orden, Fecha de recepción, Fecha de compra
 * - Se actualizan o cancelan según las modificaciones, cancelaciones o devoluciones aplicadas sobre la compra relacionada
 * @author: Islas López Isis Jezabel, Becerra Cruz Lizeth Adriana  Equipo 1
 * Fecha de Creación: 22-20-2026
 * Fecha de Modificación: 22-10-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    private String numeroFactura;

    private Date fechaOrden;

    private Date fechaRecepcion;

    private Date fechaCompra;

    private String estado;

    private double total;

    private int idOrdenCompra;

    private int idProveedor;

    private int idGrenteCompras;

}
