package Ejercicios.Catalogo.Productos.Electronicos;

import Ejercicios.Catalogo.Productos.Producto;

abstract public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    abstract public String getFabricante();

}
