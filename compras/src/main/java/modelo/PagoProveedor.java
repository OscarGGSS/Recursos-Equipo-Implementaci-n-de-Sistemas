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
 * Representa a un pago de a un proveedor en el subsistema de compras.
 * Responsabilidad principal: Llevar el registro de cuánto dinero le abonamos
 * a un proveedor y cómo se divide ese dinero entre lo que debemos y los intereses.
 * Subsistema: Compras
 * Relacióm con otros componentes:
 * - Se conecta con cuentas por pagar.
 * - Contiene una lista de detalle de pago que contienen especificaciones.
 * Reglas de negocio:
 * - Todo pago registrado debe reflejar un monto total y una fecha válida.
 * - Un pago general puede desglosarse en múltiples abonos dirigidos a diferentes cuentas por pagar.
 * @author Islas López Isis Jezabel Equipo 1
 * Fecha de Creación: 22-20-2026
 * Fecha de Modificación: 02-11-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PagoProveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pagoProveedor;

    private int idPago;

    private int idCuentaPorPagar;

    private double abonoAlSaldo;

    private double abonoAlInteres;

}
