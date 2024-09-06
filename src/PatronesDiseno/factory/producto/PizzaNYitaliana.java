package PatronesDiseno.factory.producto;

import PatronesDiseno.factory.PizzaProducto;

public class PizzaNYitaliana extends PizzaProducto {
    public PizzaNYitaliana() {
        super();
        nombre="Pizza italiana NY";
        masa="Massa gruesa";
        salsa="Salsa de tomate italiano carne";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceiunas");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillos");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }


}
