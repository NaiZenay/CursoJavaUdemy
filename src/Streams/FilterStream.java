package Streams;

import Streams.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FilterStream {
    //devuelve un stream que cumpla con las condiciones aplicadas
    public static void main(String[] args) {
        Stream<User> nombres = Stream.of("pato guzman", "pepe gonzales", "paco garcia", "pepa gomez", "pedro german","pepe perez")
                //aplica una operacion a cada elemento del stream toma un Function de parametro
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usr -> usr.getNombre().toCharArray()[0] =='p' && usr.getApellido().toCharArray()[0] =='p');
        Optional<User> usr= nombres.findFirst();
        System.out.println(usr.get());
    }
}
