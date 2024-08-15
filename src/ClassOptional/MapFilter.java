package ClassOptional;

import ClassOptional.models.Computador;
import ClassOptional.models.Fabricante;
import ClassOptional.repo.ComputadorRepositorio;
import ClassOptional.repo.Repo;

import java.util.Optional;

public class MapFilter {
    public static void main(String[] args) {
        Repo<Computador> repositorio= new ComputadorRepositorio();

        String fb= repositorio.filtrar("Aus")
                .map(cpu ->cpu.getProcesador().getFabricante().getNombre())
                .filter(fab -> fab.equalsIgnoreCase("intel"))
                .orElse("nadota no hay");
        System.out.println(fb);
    }
}
