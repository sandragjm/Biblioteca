import java.util.Date;
import java.util.List;
/**
 * Esta clase describe al AUTOR de los libros por su nombre, nacionalidad
 * y fecha de nacimiento. Además, se añade la lista de los libros que ha escrito.
 *
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class Autor {

    /** Nombre del autor, tipo String */
    public String nombre;
    /** Nacionalidad del autor, tipo String*/
    public String nacionalidad;
    /** Fecha de nacimiento del autor, tipo Date */
    public Date fechanacimiento;
    /** Lista de los libros que ha escrito este autor, tipo Libro*/
    List<Libro> libros;
}