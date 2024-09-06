package PatronesDiseno.factory.producto;

import PatronesDiseno.factory.PizzaProducto;

public class PizzaNYvegetariana extends PizzaProducto {
    public PizzaNYvegetariana() {
        super();
        nombre="Pizza vegetariana New York";
        masa="Masa Integral vegana";
        salsa="Salsa de tomata";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Espinicacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebandas cuadradas");
    }
}
