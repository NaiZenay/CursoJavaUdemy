package Hilos.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService ex= Executors.newScheduledThreadPool(2);
        System.out.println("Una tarea en el main");
        ex.schedule(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ejecutando alguna tarea....");
        },500, TimeUnit.MILLISECONDS);
        System.out.println("Tarea secundaria en el main");
        ex.shutdown();
    }
}
