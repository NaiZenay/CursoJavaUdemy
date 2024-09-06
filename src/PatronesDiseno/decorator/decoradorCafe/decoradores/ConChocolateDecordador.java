package PatronesDiseno.decorator.decoradorCafe.decoradores;

import PatronesDiseno.decorator.decoradorCafe.Configurable;

public class ConChocolateDecordador extends CafeDecorador{
    public ConChocolateDecordador(Configurable cafeConfigurable) {
        super(cafeConfigurable);
    }

    @Override
    public float getPrecioBase() {
        return cafeConfigurable.getPrecioBase()+5f;
    }

    @Override
    public String getIngredientes() {
        return cafeConfigurable.getIngredientes()+"\n-Chocoalate";
    }
}
