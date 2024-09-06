package PatronesDiseno.decorator.decoratorTexto.decorador;

import PatronesDiseno.decorator.decoratorTexto.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }


}
