package POO.IntefaceRepository.repositorio;

import POO.IntefaceRepository.Modelo.Direccion;
import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface Ordenable {
    //listar con orden
    List<Cliente> listar(String campo, Direccion direccion);


}
