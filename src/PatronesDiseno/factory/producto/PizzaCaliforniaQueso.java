package PatronesDiseno.factory.producto;

import PatronesDiseno.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {
        super();
        nombre="Pizza California de queso";
        masa="masa a la piedra delgada";
        salsa="Salsa de tomate rucula";
        ingredientes.add("Extra Queso Mozarrella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min a 100C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en pequeños triangulos");
    }

}
