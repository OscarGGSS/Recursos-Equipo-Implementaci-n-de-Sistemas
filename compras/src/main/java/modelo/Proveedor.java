package modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Representa a un proveedor en el subsistema de compras.
 * Responsabilidad principal: Mantener la integridad de los datos del proveedor necesarios para la creación de órdenes de compra y gestión de cuentas por pagar.
 * Subsistema: Compras
 * Relacióm con otros componentes:
 * Reglas de negocio:
 *
 * @author Islas López Isis Jezabel
 * Fecha de inicio: 22-20-2026
 * Fecha de última modificación: 22-10-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;

    private String nombre;

    private String domicilio;

    private String rfc;

    private String contacto;

    private String banco;

    private String numeroCuenta;

}