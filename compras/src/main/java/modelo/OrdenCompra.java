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
  * Representa a una orden de compra en el subsistema de compras.
  * Responsabilidad principal: Mantener la integridad de los datos de la orden de compra para la creación de compras.
  * Subsistema: Compras
  * Relacióm con otros componentes:
  * Reglas de negocio:
  * @author Islas López Isis Jezabel
  * Fecha de inicio: 22-20-2026
  * Fecha de última modificación: 22-10-2026
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
