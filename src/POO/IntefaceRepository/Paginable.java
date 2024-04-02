package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface Paginable {
    List<Cliente> listar(int dede, int hasta);

}
