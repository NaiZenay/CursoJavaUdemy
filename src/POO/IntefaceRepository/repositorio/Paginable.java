package POO.IntefaceRepository.repositorio;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface Paginable {
    List<Cliente> listar(int dede, int hasta);

}
