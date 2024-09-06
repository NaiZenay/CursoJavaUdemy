package PatronesDiseno.factory.ejemplo;

import PatronesDiseno.factory.CaliforniaFactory;
import PatronesDiseno.factory.NYFactory;
import PatronesDiseno.factory.PizzaAbstractFactory;
public class ejemploFactory {
    public static void main(String[] args) {
        PizzaAbstractFactory factoryNY= new NYFactory();
        PizzaAbstractFactory factoryCalifornia= new CaliforniaFactory();

        factoryNY.ordenarPizza("peperoni");
        factoryCalifornia.ordenarPizza("vegetariana");
    }
}
