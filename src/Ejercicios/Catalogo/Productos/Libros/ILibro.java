package Ejercicios.Catalogo.Productos.Libros;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();

}
