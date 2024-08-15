package ClassOptional.repo;

import ClassOptional.models.Computador;
import ClassOptional.models.Fabricante;
import ClassOptional.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repo<Computador> {
    private List<Computador> data;
    public ComputadorRepositorio() {
        data= new ArrayList<>();
        Procesador cpu= new Procesador("i7 ULTRA",new Fabricante("Intel"));
        data.add(new Computador("Asus","Strix",cpu));
        data.add(new Computador("MacBookPro","MVSDSD"));

    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return data.stream()
                .filter(pc -> pc.getNombre().equalsIgnoreCase(nombre))
                .findAny();

    }
}
