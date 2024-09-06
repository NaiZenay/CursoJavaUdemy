package PatronesDiseno.factory.producto;

import PatronesDiseno.factory.PizzaProducto;

public class PizzaCaliforniavegetariana extends PizzaProducto {
    public PizzaCaliforniavegetariana() {
        super();
        nombre="Pizza California Vegetariana";
        masa="Masa delgada light";
        salsa="Salsa BBQ Light";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rectangulos");
    }
}
