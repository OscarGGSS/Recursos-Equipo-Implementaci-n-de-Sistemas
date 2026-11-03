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
  * Responsabilidad principal:
  * Subsistema: Compras
  * Relacióm con otros componentes:
  * Reglas de negocio:
  * @author Islas López Isis Jezabel
  * Fecha de inicio: 23-20-2026
  * Fecha de última modificación: 23-10-2026
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
     * Descripción:
     * @throws:
     * Información de Modificación:
     * Información de Tablas, Entidades o Componentes:
     * Reglas de Negocio;
     * @author
     * Fecha de creación:
     * Fecha de modificación:
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