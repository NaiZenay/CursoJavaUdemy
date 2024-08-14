package Streams;

import Streams.models.User;

import java.util.List;
import java.util.stream.Stream;

public class MapStream {
    //el operador map del tipo intermedio itera el stream aplicado una funcion a cada elemento de este
    public static void main(String[] args) {
        Stream<User> nombres = Stream.of("pato guzman", "pepe gonzales", "paco garcia", "pepa gomez", "pedro german")
                //aplica una operacion a cada elemento del stream toma un Function de parametro
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1])).map(user -> {
                    String nombre = user.getNombre();
                    String apellido = user.getApellido();
                    user.setNombre(nombre.toUpperCase());
                    user.setApellido(apellido.toUpperCase());
                    return user;
                });
        //for each toma un consumer de parametro
        List<User> listX = nombres.toList();
        listX.forEach(item -> System.out.println(item.toString()));
    }
}
