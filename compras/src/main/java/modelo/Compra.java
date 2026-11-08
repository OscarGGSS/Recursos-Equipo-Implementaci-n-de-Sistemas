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
 * Responsabilidad principal: Administrar y registrar 
 * Subsistema: Compras
 * Relación con otros componentes:
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
