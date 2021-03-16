import java.util.List;

/**
 * Esta clase Socio hace referencia al socio que pide prestado la
 * copia de un libro. Está definicdo por su nombre, numero, direccion
 * y telefono.
 *
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class Socio {

    /** Numero para identificar al socio, tipo Integer */
    public Integer numero;
    /** Nombre del socio, tipo String*/
    public String nombre;
    /** Direccion del socio, tipo String*/
    public String direccion;
    /** Número de teléfono del socio, tipo String*/
    public String telefono;

    /** Multa que puede recibir el socio por incumplir el préstamo */
    Multa multa;
    /** Lista de copias que que pedido prestadas el socio*/
    List<Copia> copias;
}

