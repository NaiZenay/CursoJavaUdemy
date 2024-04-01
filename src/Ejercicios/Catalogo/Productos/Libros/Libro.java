package Ejercicios.Catalogo.Productos.Libros;

import Ejercicios.Catalogo.Productos.Producto;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta()+50;
    }

    @Override
    public String toString() {
        return "publicado el "+ fechaPublicacion.toString() +"por " +autor+ "titulado \""+titulo+"\" y editado por "+editorial+ "al precio de"+ getPrecioVenta() ;
    }
}
