import java.util.Date;

/**
 * La clase Prestamo está definida por la hora inicio y fin.
 *
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class Prestamo {

    /** Fecha inicio, tipo Date */
    public Date inicio;
    /** Fecha final, tipo Date */
    public Date fin;

    /** Socio que pide el préstamo*/
    Socio socio;
    /** Copia que el socio solicita en el préstamo*/
    Copia copia;
}