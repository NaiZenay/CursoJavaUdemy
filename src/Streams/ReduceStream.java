package Streams;

import java.util.Random;
import java.util.stream.Stream;

public class ReduceStream {
//    un operador q retorna un unico resultado utilizando los elemtos del stream proporcionado
    public static void main(String[] args) {
       String x=Stream.of("pato guzman","paco garcia", "pepa gomez", "pedro german","pepe perez")
               //valor inicial , representacion de 2 valores del stream
               .reduce("resultado reduce: ",(a,b)->a+" "+b+",");
        System.out.println(x);

        Random r=new Random();
        int res= Stream.of(1,2,3,4,5,6,7)
                .filter(a->a%2 >0)
                .reduce(0, Integer::sum);
        System.out.println(res);
    }
}
