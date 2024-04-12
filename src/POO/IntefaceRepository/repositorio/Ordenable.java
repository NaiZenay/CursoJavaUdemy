package POO.IntefaceRepository.repositorio;

import POO.IntefaceRepository.Modelo.Direccion;
import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface Ordenable {
    //listar con orden
    List<Cliente> listar(String campo, Direccion direccion);
    default int ordenar(String campo,Cliente o1, Cliente o2) {
        int resultado=0;
        switch (campo) {
            case "id" -> resultado = o1.getId().compareTo(o2.getId());
            case "nombre" -> resultado = o1.getNombre().compareTo(o2.getNombre());
            case "apellido" -> resultado = o1.getApellido().compareTo(o2.getApellido());
        }
        return resultado;
    }

}
