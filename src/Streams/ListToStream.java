package Streams;

import Streams.models.User;

import java.util.ArrayList;
import java.util.List;

public class ListToStream {
    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        users.add(new User("andres","guszman"));
        users.add(new User("ian","sanchez"));
        users.add(new User("mani","ortega"));
        users.add(new User("andy","nuñez"));
        users.add(new User("alex","flores"));

        //conversion de la lista a un stream de Strings
        users.stream().map(user -> user.getNombre().toUpperCase().concat(" ").concat(user.getApellido().toUpperCase())).forEach(System.out::println);

    }
}
