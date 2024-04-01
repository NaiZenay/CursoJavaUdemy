package Ejercicios.Catalogo.Productos.Electronicos;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    @Override
    public String getFabricante() {
        return null;
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

}
