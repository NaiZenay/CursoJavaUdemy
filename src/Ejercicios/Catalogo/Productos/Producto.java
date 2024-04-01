package Ejercicios.Catalogo.Productos;

import Ejercicios.Catalogo.IProducto;

public class Producto implements IProducto {
    private int precio;

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
