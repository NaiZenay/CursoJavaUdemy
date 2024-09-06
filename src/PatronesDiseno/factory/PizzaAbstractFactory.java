package PatronesDiseno.factory;

abstract public class PizzaAbstractFactory {
    public PizzaProducto ordenarPizza(String tipo) {
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("=====Fabricando " + pizza.getNombre() + "=====");
        pizza.preparar();
        pizza.cocinar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);

}
