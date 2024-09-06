package PatronesDiseno.factory;

import PatronesDiseno.factory.producto.PizzaCaliforniaPeperoni;
import PatronesDiseno.factory.producto.PizzaCaliforniaQueso;
import PatronesDiseno.factory.producto.PizzaCaliforniavegetariana;

public class CaliforniaFactory extends PizzaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto=null;
        switch (tipo){
            case "queso"-> producto=new PizzaCaliforniaQueso();
            case "pepperoni"-> producto=new PizzaCaliforniaPeperoni();
            case "vegetariana"-> producto=new PizzaCaliforniavegetariana();
        }
        return producto;
    }
}
