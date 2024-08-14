package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    //implementa flujos de datos donde se aplican operaciones a cada uno de los elementos de una collection de datos
    //Reducen notablemente las tareas de transformaciones
    //son inmutables (no afectan el objeto original)
    //exiten 2 tipos de operadores en el API de stream intermedios y terminales los intermedios realizan operaciones sobre el flujo de datos y los terminales finalizan el proceso del flujo produciendo un resultado

    public static void main(String[] args) {
        //creacion de un stream
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");

        //usa lambdas
        //consumer
        nombres.forEach(System.out::println);
        //Function
        nombres.map(String::toLowerCase);
        //predicate
        nombres.filter(String::isBlank);

        //Segunda forma de creacion
        String[] nom = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> nombres2 = Arrays.stream(nom);
        nombres2.forEach(String::toUpperCase);

        //Tercera forma de creacion
        Stream<String> nomb = Stream.<String>builder().add("Alex").add("Aldo").add("Amlo").build();

        //Cuarta forma de creacioon convirtiendo un Colletion a un stream
        List<String> listanombre = new ArrayList<>();
        listanombre.add("Alex");
        listanombre.add("Aldo");
        listanombre.add("Amlo");
        Stream<String> nombres3 = listanombre.stream();
    }
}
