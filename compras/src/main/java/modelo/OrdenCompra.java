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
 * Representa una orden de compra generada a un proveedor en el subsistema de compras.
 * Responsabilidad principal: Registrar la solicitud de mercancía a un 
 * proveedor, manteniendo el control de los costos estimados antes de la recepción.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Es generada por un Gerente de Compras.
 * - Se emite dirigida a un Proveedor.
 * - Contiene una lista de OrdenCompraDetalle (composición) con los artículos pedidos.
 * - Es antes de que posteriormente se de origen a una Compra real.
 * Reglas de negocio:
 * - Toda orden debe tener una fecha de creación y un estado actual.
 * - El total estimado se compone de la suma de sus detalles menos los descuentos aplicables.
 * - Una orden de compra es solo una solicitud, no genera una deuda (CuentaPorPagar) hasta convertirse en Compra.
 * @author Islas Lopez Isis Jezabel, Óscar González Saucedo Equipo 1
 * Fecha de creación: 24-10-2026
 * Fecha modificación: 05-11-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdenCompra;

    private int idProveedor;

    private double costo;

    private Date fechaCreacion;

    private double descuento;

    private double total;

}
