package Streams;

import java.util.stream.Stream;

public class DistinctStream {
    public static void main(String[] args) {
       Stream.of("pato guzman", "", "paco garcia","paco garcia","paco garcia","paco garcia","paco garcia","paco garcia","paco garcia","paco garcia", "pepa gomez", "pedro german","pepe perez")
               .distinct()//agrupa los elemntos repetidos
               .forEach(System.out::println);
    }
}
