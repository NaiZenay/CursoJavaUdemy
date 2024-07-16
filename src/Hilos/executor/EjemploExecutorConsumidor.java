package Hilos.executor;

import Hilos.EjemploSync.Consumidor;
import Hilos.EjemploSync.Panaderia;
import Hilos.EjemploSync.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorConsumidor {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Panaderia p= new Panaderia();
        Runnable productor= new Panadero(p);
        Runnable consumidor= new Consumidor(p);

        Future<?> futureResult = ex.submit(productor);
        Future<?> futureResult2 = ex.submit(consumidor);
        ex.shutdown();

        System.out.println("Finalizo la ejecucion de la tarea");

    }
}

