package Ejercicios.Catalogo.Productos.Libros;

import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta()+20;
    }

    @Override
    public String toString() {
        return "El comic del famoso personaje "+personaje+" "+super.toString();
    }
}
