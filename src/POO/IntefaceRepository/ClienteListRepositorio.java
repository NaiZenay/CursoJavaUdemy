package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, Ordenable, Paginable {
    private List<Cliente> dataSource;


    public ClienteListRepositorio() {
        super();
        dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente porId(int idCliente) {
        Cliente c = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId() == idCliente) {
                c = cliente;
                break;
            }
        }
        return c;
    }

    @Override
    public void crearCliente(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(int idCliente) {
        this.dataSource.remove(this.porId(idCliente));
    }

    //listar con orden
    @Override
    public List<Cliente> listar(String campo, String direccion) {
        return null;
    }

    //paginacion
    @Override
    public List<Cliente> listar(int dede, int hasta) {
        return null;
    }
}
