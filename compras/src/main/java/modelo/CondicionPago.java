package modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
  * Representa una condición de pago creada por un provedor.
  * Responsabilidad principal: Almacenr las condiciones de pago para posteriormente ser aplicadas en una compra.
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
public class CondicionPago {

    private double limiteCredito;

    private int diasCredito;

/**
  * Descripción:
  * @throws:
  * Información de Modificación:
  * Información de Tablas, Entidades o Componentes:
  * Reglas de Negocio;
  * @author
  * Fecha de creación:
  * Fecha de última modificación:
 */

    public double cobroIntereses(){

        return 0;

    }

    /**
     * Descripción:
     * @throws:
     * Información de Modificación:
     * Información de Tablas, Entidades o Componentes:
     * Reglas de Negocio;
     * @author
     * Fecha de creación:
     * Fecha de última modificación:
     */
    public double tasa(){

        return 0;

    }
}