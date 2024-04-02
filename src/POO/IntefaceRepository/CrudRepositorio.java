package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(int idCliente);
    void crearCliente(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(int idCliente);


}
