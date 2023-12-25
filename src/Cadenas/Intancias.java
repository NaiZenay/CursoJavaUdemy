package Cadenas;

public class Intancias {
    public static void main(String[] args) {
        //Instancia de forma implicita
        String instnaciaImplicita1="Cafe";
        String instnaciaImplicita2="Cafe";
        //Instancia de forma explicita
        String instanciaExplicita1= new String("Cafe");
        String instanciaExplicita2= new String("Cafe");


        //El operador de comparacion "==" compara la referencia no el valor
        boolean comparacionReferencia=instnaciaImplicita1==instanciaExplicita1;
        System.out.println("comparacionReferencia = " + comparacionReferencia);


        //Para compara el valor de los objetos se utiliza el metodo del objeto string "equals()"
        boolean comparacionValor=instnaciaImplicita1.equals(instanciaExplicita1);
        System.out.println("comparacionValor = " + comparacionValor);


        //Una instancia implicita crea por debajo una instancia explicita sin embargo cuando se crean dos o mas instacias implicitas con el mismo valor java por optimizacion asigna estas a una sola referencia
        boolean comparacionIntanciasImplicitas=instnaciaImplicita1==instnaciaImplicita2;
        System.out.println("comparacionIntanciasImplicitas = " + comparacionIntanciasImplicitas);//true
    }
}
