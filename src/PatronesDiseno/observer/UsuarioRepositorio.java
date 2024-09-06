package PatronesDiseno.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable {
    private List<String> repo = new ArrayList<>();

    public void crear(String usuario) {
        repo.add(usuario);
        notificarObservadores();
    }

}
