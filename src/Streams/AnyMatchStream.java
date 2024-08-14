package Streams;

import Streams.models.User;

import java.util.stream.Stream;

public class AnyMatchStream {
    //operador terminal que verifica si q elementos cumplen el predicate dado retorna un boolean

    public static void main(String[] args) {
        boolean existe = Stream.of("pato guzman", "pepe gonzales", "paco garcia", "pepa pomez", "pedro perman","pepe perez")
                .map(nombre -> new User(nombre.split(" ")[0], nombre.split(" ")[1]))
                //predict que evalua si hay usuarios con que nombre y apellido inicien con p
                .anyMatch(usr -> usr.getNombre().toCharArray()[0] =='p' && usr.getApellido().toCharArray()[0] =='p');

        System.out.println(existe);
    }
}
