package java_8Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String,String> f1= param->("wuenas")+param;
        System.out.println(f1.apply(" q tal"));

        Function<String,String> f2= String::toUpperCase;
        //Valor recibido, segundo valor recibido , valar a retornar
        BiFunction<String,String,String> f3=(a,b)-> a.toUpperCase().concat(b.toUpperCase());

        System.out.println(f3.apply("alex","flores"));

        BiFunction<String,String,Integer> f4= String::compareTo;
        System.out.println(f4.apply("jaja","jaja"));

    }
}
