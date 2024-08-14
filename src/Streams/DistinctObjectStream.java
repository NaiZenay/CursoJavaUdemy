package Streams;

import Streams.models.User;

import java.util.List;
import java.util.stream.Stream;

public class DistinctObjectStream {
    public static void main(String[] args) {
       Stream.of("pato guzman", "pepe gonzales", "paco garcia","paco garcia", "pepa gomez", "pedro german")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
               //utiliza la implementacion de equals del objeto para hacer la comparacion
               .distinct()
               .forEach(System.out::println);
    }
}
