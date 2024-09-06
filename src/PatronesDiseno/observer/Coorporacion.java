package PatronesDiseno.observer;

public class Coorporacion extends Observable{
    private String nombre;
    private double precio;

    public Coorporacion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void modificarPrecio(double nuevoPrecio){
        this.precio=nuevoPrecio;
        this.notificarObservadores();
    }
}
