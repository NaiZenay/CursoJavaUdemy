package PatronesDiseno.factory.producto;

import PatronesDiseno.factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza California de peperoni";
        masa = "Masaa a la piedra gruesa";
        ingredientes.add("Peperonii");
        ingredientes.add("Extra queso mozarrella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min a 55C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
