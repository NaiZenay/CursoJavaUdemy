package PatronesDiseno.factory.producto;

import PatronesDiseno.factory.PizzaProducto;

public class PizzaNYpeperoni extends PizzaProducto {
    public PizzaNYpeperoni() {
        super();
        nombre="Pizza Peperoni NY";
        masa="Masa delgada a la piedra";
        salsa="Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40min a 90C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
