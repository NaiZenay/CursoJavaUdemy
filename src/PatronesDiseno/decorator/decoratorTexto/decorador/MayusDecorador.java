package PatronesDiseno.decorator.decoratorTexto.decorador;

import PatronesDiseno.decorator.decoratorTexto.Formateable;

public class MayusDecorador extends TextoDecorador{

    public MayusDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
