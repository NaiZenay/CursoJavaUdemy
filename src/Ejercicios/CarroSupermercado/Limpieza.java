package Ejercicios.CarroSupermercado;

public class Limpieza extends Producto{
    private float cantidadLitros;
    private String area;

    public Limpieza(String nombre, double precio, float cantidadLitros, String area) {
        super(nombre, precio);
        this.cantidadLitros = cantidadLitros;
        this.area = area;
    }

    public Limpieza(String nombre, double precio) {
        super(nombre, precio);
    }

    public float getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(float cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
