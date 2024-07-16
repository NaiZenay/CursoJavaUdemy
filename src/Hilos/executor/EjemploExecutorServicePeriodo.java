package Hilos.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ex= Executors.newScheduledThreadPool(2);
        System.out.println("Una tarea en el main");
        CountDownLatch lock= new CountDownLatch(5);
        ex.scheduleAtFixedRate(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ejecutando alguna tarea....");
        },1000,2000, TimeUnit.MILLISECONDS);
        lock.await();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Tarea secundaria en el main");
        ex.shutdown();
        System.out.println("fin");
    }
}
