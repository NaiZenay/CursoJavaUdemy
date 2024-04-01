package Ejercicios.Catalogo.Productos.Electronicos;

import Ejercicios.Catalogo.IProducto;

public class IPhone extends Electronico{
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public IPhone(int precio, String modelo, String color) {
        super(precio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFabricante() {
        return "IPHONE Fabricado por "+this.getFabricante();
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta()+200;
    }

    @Override
    public String toString() {
        return "El nuevo modelo "+modelo+ " ahora en color "+color+ super.toString();
    }
}
