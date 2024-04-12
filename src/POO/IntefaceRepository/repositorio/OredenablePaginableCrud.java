package POO.IntefaceRepository.repositorio;

import POO.IntefaceRepository.Modelo.Cliente;
import POO.IntefaceRepository.Modelo.Direccion;

import java.util.List;

public interface OredenablePaginableCrud extends Paginable,Ordenable,CrudRepositorio{
    @Override
    List<Cliente> listar();

    @Override
    Cliente porId(int idCliente);

    @Override
    void crearCliente(Cliente cliente);

    @Override
    void editar(Cliente cliente);

    @Override
    void eliminar(int idCliente);

    @Override
    List<Cliente> listar(String campo, Direccion direccion);

    @Override
    default int ordenar(String campo, Cliente o1, Cliente o2) {
        return Ordenable.super.ordenar(campo, o1, o2);
    }

    @Override
    List<Cliente> listar(int dede, int hasta);
}
