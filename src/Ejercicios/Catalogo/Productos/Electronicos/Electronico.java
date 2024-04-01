package Ejercicios.Catalogo.Productos.Electronicos;

import Ejercicios.Catalogo.Productos.Producto;

abstract public class Electronico extends Producto{
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public Electronico(int precio) {
        super(precio);
    }

    abstract public String getFabricante();

    @Override
    public String toString() {
        return " precio de Venta de :"+getPrecioVenta()+" fabricado por:"+fabricante;
    }
}
