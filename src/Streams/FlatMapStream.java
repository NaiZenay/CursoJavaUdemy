package Streams;

import Streams.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapStream {
    public static void main(String[] args) {
        Stream<User> nombres = Stream.of("pato guzman", "pepe gonzales", "paco garcia", "pepa gomez", "pedro german","pepe perez")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                //similar al map solo q en lugar de devolver elementos del stream, por cada elemento devuleve un stream diferente
                .flatMap(user -> {
                    if(user.getNombre() .equalsIgnoreCase("pepe")){
                        return Stream.of(user);
                    }
                    return Stream.empty();

                }).peek(System.out::println);
    }
}
