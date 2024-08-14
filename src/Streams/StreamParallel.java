package Streams;

import Streams.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamParallel {
    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        users.add(new User("andres","guszman"));
        users.add(new User("ian","sanchez"));
        users.add(new User("mani","ortega"));
        users.add(new User("andy","nuñez"));
        users.add(new User("alex","flores"));

        long t1= System.currentTimeMillis();

        /*
         las operaciones sobre el stream se dividen en sub-tareas que se ejecutan en múltiples hilos.
          Java maneja automáticamente la creación y gestión de estos hilos utilizando el ForkJoinPool predeterminado.
         */
        String resultado= users.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("hilo: "+Thread.currentThread().getName()+"- nombre:"+n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return nombre.split(" ")[0].equalsIgnoreCase("mani")?Stream.of(nombre):Stream.empty();
                })
                .findAny().orElse("");

        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        System.out.println(resultado);

    }
}
