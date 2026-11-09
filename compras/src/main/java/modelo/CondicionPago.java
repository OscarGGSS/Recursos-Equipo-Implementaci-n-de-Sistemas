package modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Representa una condición de pago establecida por un proveedor en el subsistema de compras.
 * Responsabilidad principal: Almacenar las políticas comerciales (límite de crédito, plazo en días) para ser aplicadas en las compras a crédito y la gestión de cuentas por pagar.
 * Subsistema: Compras
 * Relación con otros componentes:
 * - Está vinculada directamente a una entidad Proveedor.
 * - Sus reglas son consultadas por CuentaPorPagar para determinar la fecha límite de pago y el cálculo de intereses.
 * Reglas de negocio:
 * - El límite de crédito y los días de crédito no pueden ser valores negativos.
 * - La tasa de interés solo se aplica cuando una cuenta por pagar supera los días de crédito establecidos.
 *
 * @author Islas López Isis Jezabel, Oscar Gonzalez Saucedo Equipo 1
 * Fecha creación: 23-10-2026
 * Fecha modificación: 05-11-2026
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
     * Descripción: Calcula o determina el monto correspondiente al cobro de intereses moratorios 
     * aplicable bajo esta condición de pago.
     * Información de Modificación: No modifica el estado interno de la entidad, solo realiza un cálculo de lectura.
     * Información de Tablas, Entidades o Componentes: Se relaciona con la tabla CondicionPago y sirve de apoyo para CuentaPorPagar.
     * Reglas de Negocio: Solo genera un cobro mayor a cero si la condición estipula recargos por atraso y el plazo ha vencido.
     *
     * @return monto calculado por concepto de cobro de intereses, o 0.0 si no aplica.
     * @throws IllegalStateException si los parámetros de crédito o tasa contienen valores inválidos (menores a cero).
     * @author Islas López Isis Jezabel, Oscar Gonzalez Saucedo Equipo 1
     * Fecha creación: 23-10-2026
     * Fecha modificación: 05-11-2026
     */
    public double cobroIntereses() {
        return 0;
    }

    /**
     * Descripción: Obtiene el porcentaje de la tasa de interés asignada 
     * por el proveedor en sus términos de crédito.
     * Información de Modificación: No modifica información ni altera el estado de la clase.
     * 
     * Reglas de Negocio: La tasa devuelta no puede ser negativa y representa el factor aplicable sobre el saldo vencido.
     *
     * @return valor numérico de la tasa de interés configurada, o 0.0 si el proveedor no cobra intereses.
     * @author Islas López Isis Jezabel, Oscar Gonzalez Equipo 1
     * Fecha creación: 23-10-2026
     * Fecha modificación: 05-11-2026
     */
    public double tasa() {
        return 0;
    }
}
