package Ejercicios.Catalogo.Productos;

import Ejercicios.Catalogo.IProducto;

abstract public class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio+(this.precio*0.15);
    }

}
