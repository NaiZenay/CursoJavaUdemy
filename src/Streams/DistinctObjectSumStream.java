package Streams;

import Streams.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DistinctObjectSumStream {
    public static void main(String[] args) {
       IntStream is=Stream.of("pato guzman", "pepe gonzales", "paco garcia","paco garcia", "pepa gomez", "pedro german")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
               //utiliza la implementacion de equals del objeto para hacer la comparacion
               .distinct()
               //convierte el stream a un IntStream tmb hay para los otro primitivos
               .mapToInt(value -> value.toString().length());
       //summaryStaticstics es un operador terminal q devuleve un IntSummaryStatistics
        IntSummaryStatistics issm=is.summaryStatistics();
        System.out.println("nombre mas largo cuenta con: "+issm.getMax()+" caracteres");
        System.out.println("nombre mas corto cuenta con: "+issm.getMin()+" caracteres");
        System.out.println("el promedio de caracterees de los nombres es:"+issm.getAverage());
    }
}
