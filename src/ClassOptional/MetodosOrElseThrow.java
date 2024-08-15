package ClassOptional;

import ClassOptional.models.Computador;
import ClassOptional.repo.ComputadorRepositorio;
import ClassOptional.repo.Repo;

import java.util.Optional;

public class MetodosOrElseThrow {
    public static void main(String[] args) throws Exception {
        Repo<Computador> repositorio = new ComputadorRepositorio();
        Optional<Computador> pc = Optional.empty();
        System.out.println(repositorio.filtrar("asus").orElseThrow());//basicamente un get pero mejor
        String archivo = "doc.pdf";
        String extension = Optional.ofNullable(archivo).map(doc -> doc.split("\\.")[1]).orElseThrow();
        System.out.println("extension = " + extension);
    }
}
