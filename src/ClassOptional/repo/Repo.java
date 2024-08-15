package ClassOptional.repo;

import ClassOptional.models.Computador;

import java.util.Optional;

@FunctionalInterface

public interface Repo<T> {
    Optional<Computador> filtrar(String nombre);
}
