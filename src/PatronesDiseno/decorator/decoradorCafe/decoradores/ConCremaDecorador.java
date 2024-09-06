package PatronesDiseno.decorator.decoradorCafe.decoradores;

import PatronesDiseno.decorator.decoradorCafe.Configurable;

public class ConCremaDecorador extends CafeDecorador{
    public ConCremaDecorador(Configurable cafeConfigurable) {
        super(cafeConfigurable);
    }

    @Override
    public float getPrecioBase() {
        return cafeConfigurable.getPrecioBase()+2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafeConfigurable.getIngredientes()+"\n-Crema";
    }
}
