package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface Ordenable {
    //listar con orden
    List<Cliente> listar(String campo, Direccion direccion);


}
