package Streams;

import Streams.models.User;
import java.util.stream.Stream;

public class FindFirstStreamSingle {
    //operador terminal q devuelve el primer elemento del stream en forma de un Optional
    public static void main(String[] args) {
        User u = Stream.of("pato guzman", "pepe gonzales", "paco garcia", "pepa gomez", "pedro german","pepe perez")
                //aplica una operacion a cada elemento del stream toma un Function de parametro
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usr -> usr.getNombre().toCharArray()[0] =='p' && usr.getApellido().toCharArray()[0] =='p').findFirst().get();

        System.out.println(u);
    }
}
