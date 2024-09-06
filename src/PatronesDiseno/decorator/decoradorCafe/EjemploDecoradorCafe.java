package PatronesDiseno.decorator.decoradorCafe;

import PatronesDiseno.decorator.decoradorCafe.decoradores.ConChocolateDecordador;
import PatronesDiseno.decorator.decoradorCafe.decoradores.ConCremaDecorador;
import PatronesDiseno.decorator.decoradorCafe.decoradores.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafeConfig= new Cafe(7f,"Mocha");
        ConCremaDecorador cafeConCrema= new ConCremaDecorador(cafeConfig);
        ConLecheDecorador cafeConLeche= new ConLecheDecorador(cafeConCrema);
        ConChocolateDecordador cafeConChocolate= new ConChocolateDecordador(cafeConLeche);

        System.out.println("El precio del Cafe Mocha es: "+cafeConChocolate.getPrecioBase());
        System.out.println("Los ingredientes son:"+cafeConChocolate.getIngredientes());

        Configurable capuchino = new Cafe(4f,"Capucchino");
        ConLecheDecorador conLecheDecorador= new ConLecheDecorador(capuchino);
        ConCremaDecorador conCremaDecorador= new ConCremaDecorador(conLecheDecorador);

        System.out.println("El precio del Capuchino es: "+conCremaDecorador.getPrecioBase());
        System.out.println("Los ingredientes son:"+conCremaDecorador.getIngredientes());

    }
}
