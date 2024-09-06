package PatronesDiseno.factory;

import PatronesDiseno.factory.producto.PizzaNYitaliana;
import PatronesDiseno.factory.producto.PizzaNYpeperoni;
import PatronesDiseno.factory.producto.PizzaNYvegetariana;

public class NYFactory extends PizzaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto=null;
        switch (tipo) {
            case "vegetariana"-> producto=new PizzaNYvegetariana();
            case "peperoni"-> producto=new PizzaNYpeperoni();
            case "italiana"-> producto=new PizzaNYitaliana();
            default -> {
                return null;
            }
        }
        return producto;
    }
}
