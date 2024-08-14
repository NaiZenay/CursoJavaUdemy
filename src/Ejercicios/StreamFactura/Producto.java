package Ejercicios.StreamFactura;

public class Producto {
    private double precio;
    private int cantidad;
    public Producto( int cantidad ,double precio) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }

}
