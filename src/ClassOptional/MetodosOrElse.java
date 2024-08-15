package ClassOptional;

import ClassOptional.models.Computador;
import ClassOptional.repo.ComputadorRepositorio;
import ClassOptional.repo.Repo;

import java.util.Optional;

public class MetodosOrElse {
    public static void main(String[] args) {
        Repo<Computador> repositorio= new ComputadorRepositorio();
        Optional<Computador> pc= repositorio.filtrar("ASus");
        Computador a= new Computador("Alien","r16");
        Computador PC=repositorio.filtrar("asu").orElse(a);//si el valor isPresent retorna el obj else un objeto por default o null
        //nota orElse si encuentra el obj  lo que se pasa por parmetro se todos modos se ejecuta por debajo y gasta mas recursos
        System.out.println("PC = " + PC);

        Computador PC2= repositorio.filtrar("asu").orElseGet(() -> new Computador("lenovo","sd12"));
    }
}
