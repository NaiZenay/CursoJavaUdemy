package Streams;

import Streams.models.Factura;
import Streams.models.User;

import java.util.Arrays;
import java.util.List;

public class FlatMapFactura {
    public static void main(String[] args) {
        User user1= new User("John","Doe");
        User user2= new User("Pepe","Perz");

        user1.addFactura(new Factura("compras tecnologicas"));
        user1.addFactura(new Factura("muebles"));

        user2.addFactura(new Factura("bici"));
        user2.addFactura(new Factura("notebook"));

        List<User> users = Arrays.asList(user1,user2);
        users.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(factura -> System.out.println(factura.getDescripcion().concat(" ").concat(factura.getUsuario().getNombre()+factura.getUsuario().getApellido())));

//        Forma tradicional
//        for (User u: users){
//            for (Factura factura : u.getFacturas()) {
//                System.out.println(factura.getDescripcion());
//            }
//        }
    }
}
