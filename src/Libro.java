import java.util.List;

/**
 * Esta clase Libro hace referencia al libro que se pide prestado
 * y está definido por su titulo, editorial, year(año) y tipo.
 *
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class Libro {

    /** El titulo del liLibro. */
    public String titulo;
    /**La editorial de libro. */
    public String editorial;
    /** EL año en el que está publicado el libro.*/
    public Integer year;
    /** Tipo del que es el libro. */
    public Genero tipo;

    /** La variable copiasLibros se trata de las copias de los libros */
    List<Copia> copiasLibros;
    /** La variable autor de tipo Autor hace referencia al autor del libro*/
    Autor autor;

}
