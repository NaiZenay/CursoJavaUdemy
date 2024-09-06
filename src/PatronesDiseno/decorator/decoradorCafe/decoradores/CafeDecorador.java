package PatronesDiseno.decorator.decoradorCafe.decoradores;

import PatronesDiseno.decorator.decoradorCafe.Cafe;
import PatronesDiseno.decorator.decoradorCafe.Configurable;

public abstract class CafeDecorador implements Configurable {
    protected Configurable cafeConfigurable;

    public CafeDecorador(Configurable cafeConfigurable) {
        this.cafeConfigurable = cafeConfigurable;
    }

}
