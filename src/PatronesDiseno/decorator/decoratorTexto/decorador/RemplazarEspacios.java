package PatronesDiseno.decorator.decoratorTexto.decorador;

import PatronesDiseno.decorator.decoratorTexto.Formateable;

public class RemplazarEspacios extends TextoDecorador{

    public RemplazarEspacios(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
