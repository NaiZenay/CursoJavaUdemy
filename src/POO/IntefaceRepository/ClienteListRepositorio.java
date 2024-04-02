package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
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
    public List<Cliente> listar(String campo, Direccion direccion) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                int resultado=0;
                if (direccion==Direccion.ASC){
                    switch (campo){
                        case "id"->
                            resultado= o1.getId().compareTo(o2.getId());
                        case "nombre"->
                                resultado= o1.getNombre().compareTo(o2.getNombre());
                        case "apellido"->
                                resultado= o1.getApellido().compareTo(o2.getApellido());
                    }
                } else if (direccion==Direccion.DESC) {
                    switch (campo){
                        case "id"->
                                resultado= o2.getId().compareTo(o1.getId());
                        case "nombre"->
                                resultado= o2.getNombre().compareTo(o1.getNombre());
                        case "apellido"->
                                resultado= o2.getApellido().compareTo(o1.getApellido());
                    }
                }
                return resultado;
            }
        });
        return dataSource;
    }

    //paginacion
    @Override
    public List<Cliente> listar(int dede, int hasta) {
        return dataSource.subList(dede,hasta);
    }
}
