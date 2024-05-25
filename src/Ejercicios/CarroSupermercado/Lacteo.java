package Ejercicios.CarroSupermercado;

public class Lacteo extends Producto{
    private String tipo;
    private float cantidadGramos;

    public Lacteo(String nombre, double precio, String tipo, float cantidadGramos) {
        super(nombre, precio);
        this.tipo = tipo;
        this.cantidadGramos = cantidadGramos;
    }
}
