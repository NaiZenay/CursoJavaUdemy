package PatronesDiseno.decorator.decoratorTexto;

import PatronesDiseno.decorator.decoratorTexto.decorador.*;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable textp= new Texto("Hola que tal");
        MayusDecorador mayusDecorador= new MayusDecorador(textp);
        ReveersaDecorador reveersaDecorador= new ReveersaDecorador(mayusDecorador);
        SubrayadoDecorador subrayadoDecorador= new SubrayadoDecorador(reveersaDecorador);
        System.out.println(subrayadoDecorador.darFormato());
        RemplazarEspacios remplazarEspacios= new RemplazarEspacios(subrayadoDecorador);
        System.out.println(remplazarEspacios.darFormato());
    }
}
