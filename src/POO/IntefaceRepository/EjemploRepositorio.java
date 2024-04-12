package POO.IntefaceRepository;

import POO.IntefaceRepository.Modelo.Cliente;
import POO.IntefaceRepository.Modelo.Direccion;
import POO.IntefaceRepository.repositorio.ClienteListRepositorio;
import POO.IntefaceRepository.repositorio.CrudRepositorio;
import POO.IntefaceRepository.repositorio.Ordenable;
import POO.IntefaceRepository.repositorio.Paginable;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        ClienteListRepositorio repo= new ClienteListRepositorio();
        repo.crearCliente(new Cliente("Richie","Ricon"));
        repo.crearCliente(new Cliente("Monica","Ricon"));
        repo.crearCliente(new Cliente("Arturo","Ricon"));
        repo.crearCliente(new Cliente("Laura","Ricon"));
        repo.crearCliente(new Cliente("Oliver","Ricon"));
        repo.crearCliente(new Cliente("John","Ricon"));

        List<Cliente>clientes= repo.listar();
        clientes.forEach(c->{
            System.out.println(c.toString());
        });
        System.out.println();

        List<Cliente> clientes1= repo.listar(4,6);

        clientes1.forEach(c->{
            System.out.println(c.toString());
        });

        System.out.println();
        List<Cliente> ordenados=repo.listar("id", Direccion.DESC);
        ordenados.forEach(c->{
            System.out.println(c.toString());
        });

        repo.eliminar(4);
        System.out.println();
        clientes.forEach(c->{
            System.out.println(c.toString());
        });
        System.out.println();
    }
}
