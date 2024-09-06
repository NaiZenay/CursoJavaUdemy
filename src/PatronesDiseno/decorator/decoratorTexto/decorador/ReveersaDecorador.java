package PatronesDiseno.decorator.decoratorTexto.decorador;

import PatronesDiseno.decorator.decoratorTexto.Formateable;

public class ReveersaDecorador extends TextoDecorador{

    public ReveersaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder stringBuilder=new StringBuilder(texto.darFormato());
        return stringBuilder.reverse().toString();
    }
}
