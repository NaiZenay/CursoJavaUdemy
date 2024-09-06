package PatronesDiseno.decorator.decoradorCafe.decoradores;

import PatronesDiseno.decorator.decoradorCafe.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafeConfigurable) {
        super(cafeConfigurable);
    }

    @Override
    public float getPrecioBase() {
        return cafeConfigurable.getPrecioBase()+12f;
    }

    @Override
    public String getIngredientes() {
        return cafeConfigurable.getIngredientes()+"\n-Leche";
    }
}
