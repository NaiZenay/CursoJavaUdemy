package Ejercicios.Catalogo.Productos.Electronicos;

import Ejercicios.Catalogo.IProducto;

public class TVLcd extends Electronico {
    private int pulgada;

    public TVLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public String getFabricante() {
        return null;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta()+500;
    }

    @Override
    public String toString() {
        return "La nueva TV con el"+super.toString()+ "con un total de "+pulgada+" pulagadas";
    }
}
