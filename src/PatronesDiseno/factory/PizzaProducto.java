package PatronesDiseno.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
    protected   String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes= new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando "+nombre);
        System.out.println("Seleccionando la "+masa);
        System.out.println("Agregando la "+ salsa);
        System.out.println("Agregando los ingredientes:");
        this.ingredientes.forEach(System.out::println);
    }

    public String getNombre() {
        return nombre;
    }

    public void empaquetar(){
        System.out.println("Pizza empacada");
    }

    abstract public void cocinar();

    abstract public void cortar();

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
