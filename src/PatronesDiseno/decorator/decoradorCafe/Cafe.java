package PatronesDiseno.decorator.decoradorCafe;

public class Cafe implements Configurable{
    private float precio;
    private String nombre;

    public Cafe(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public float getPrecioBase() {
        return precio;
    }

    @Override
    public String getIngredientes() {
        return nombre;
    }
}
