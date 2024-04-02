package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface Ordenable {
    List<Cliente> listar(String campo, String direccion);

}
