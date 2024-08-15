package ClassOptional;

import ClassOptional.models.Computador;
import ClassOptional.repo.ComputadorRepositorio;
import ClassOptional.repo.Repo;

import java.util.Optional;

public class ejRepo {
    public static void main(String[] args) {
        Repo<Computador> repositorio= new ComputadorRepositorio();
        Optional<Computador> pc= repositorio.filtrar("ASus");
        pc.ifPresentOrElse(System.out::println,()->{
            System.out.println("no hay");
        });
    }
}
