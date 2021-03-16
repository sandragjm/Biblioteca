/**
 * Esta clase hace referencia a las COPIAS de los libros,
 * identificandolos por su referencia y por su estado.
 *
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class Copia {

    /** La variable referencia, tipo Interger, identifica la copia. */
    public Integer referencia;
    /** La variable estado de tipo EstadoCopia describe el estado de la
     * copia. */
    public EstadoCopia estado;
    /** La variable libro de tipo Libro hace referencia al libro del
     *  que se ha hecho la copia */
    Libro libro;
    /** La variable socio de tipo Socio hace referencia al socio que
     * ha pedido esta copia.  */
    Socio socio;
}