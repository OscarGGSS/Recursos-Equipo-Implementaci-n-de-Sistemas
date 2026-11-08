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
  * Representa una cuenta por pagar en el subsistema de compras.
  * Responsabilidad principal: Registra y administra los datos y procesos financieros de los datos 
  de los proveedores en las cuentas por pagar.
  * Subsistema: Compras
  * Relación con otros componentes: 
  - Se relaciona con las clases "CuentasPorPagar", "PagoProveedor" y "PagoDetalle"
  - Tiene relacion con "CuentasPorPagarDAO", los cuales su objeto de Acceso de Datos para consultar,
    eliminar y dar de alta (dependiendo de la actividad que se quiera hacer en las cuentas por pagar)
  * Reglas de negocio:
  - Calcula la fecha límite de pago considerando las condiciones y días de crédito del proveedor
  - Se genera de forma automatica al registrar la cuenta
  - Toda alta de cuenta por pagar se genera en automatico al registrar una compra.
  - Se exige un motivación de cancelación registrando el usuario y la fecha de la cancelación.
  * @author Islas López Isis Jezabel, Becerra Cruz Lizeth Adriana Equipo 1
  * Fecha de Creación: 23-10-2026
  * Fecha de Modificación: 07-11-2026
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CuentaPorPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuentaPorPagar;

    private Date fechaGeneracion;

    private Date fechaLimite;

    private double montoOriginal;

    private double interesAcomulado;

    private double saldo;

    private String estado;

    private int idCompra;

    private int idProveedor;

    private String motivoCancelacion;

    private Date fechaCancelacion;

    private int idUsuarioCancelo;

    /**
     * Descripción: Calcula el interes acumulado de la cuenta por pagar.
     * @throws: ArithmeticException Excepción lanzada en caso de error durante la operación aritmética con montos.
     * Información de Modificación: Creación de la lógica inicial de cálculo de recargos
     * Información de Tablas, Entidades o Componentes:
     * Reglas de Negocio;
     * @author Islas López Isis Jezabel, Becerra Cruz Lizeth Adriana Equipo 1.
     * Fecha de creación: 23-10-2026
     * Fecha de modificación: 07-11-2026
     */
    public double calcularInteresAcomulado(){

        return 0;

    }

    /**
     Descripción:
     @param: monto, su propósito es
     @return:
     @throws:
     Información de Modificación:
     Información de Tablas, Entidades o Componentes:
     Reglas de Negocio;
     @author:
     Fecha de creación:
     Fecha de modificación:
     */
    public void abonarAlSaldo(double monto){


    }

}
