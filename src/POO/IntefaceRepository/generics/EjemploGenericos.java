package POO.IntefaceRepository.generics;

import Ejercicios.ProyetoOrdenCompra.Cliente;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ian", "Yañez"));

        System.out.println(clientes.iterator().next());


        Cliente[] clienteArray = {new Cliente("Ian", "Yañez"), new Cliente("Ian", "Yañez")};
        List<Cliente> clientesfromArray = fromArrayList(clienteArray);

        Clientepremium[] clientepremiums = {new Clientepremium("Alez", "Flores"), new Clientepremium("Alez", "Flores")};
        List<Clientepremium> clientesP = fromArrayList(clientepremiums);

        clientesfromArray.forEach(System.out::println);
        clientesP.forEach(System.out::println);
    }

    //Tipo generico<T>
    public static <T> List<T> fromArrayList(T[] c) {
        return Arrays.asList(c);
        //Retorna un array como una lista
    }

    //tipo generico q herede de number
    public static <T extends Number> List<T> fromArrayList(T[] c) {
        return Arrays.asList(c);
        //Retorna un array como una lista
    }

    //Cualquier tipo que herede de Cliente
    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
        //Retorna un array como una lista
    }

    //Cualquier tipo que herede de Cliente e implemente la interfaz comparable
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayList(T[] c) {
        return Arrays.asList(c);
        //Retorna un array como una lista
    }



}


