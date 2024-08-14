package Streams;

import Streams.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class FilterEmpty {
    public static void main(String[] args) {
       long nombreasVacios= Stream.of("pato guzman", "", "paco garcia", "pepa gomez", "pedro german","pepe perez")
                .filter(String::isEmpty).count();

        System.out.println(nombreasVacios);
    }
}
