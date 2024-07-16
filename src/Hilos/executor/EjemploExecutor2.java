package Hilos.executor;

import java.util.concurrent.*;

public class EjemploExecutor2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        Callable<String> tarea = (() -> {
            System.out.println("Inicio");
            try {
                System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin");
            return "Resultado";
        });
        Callable<Integer> tarea2 = (() -> {
            System.out.println("Iniciando tarea 2");
            TimeUnit.SECONDS.sleep(4);
            return 10;
        });


        Future<String> futureResult = ex.submit(tarea);
        Future<String> futureResult2 = ex.submit(tarea);
        Future<Integer> futureResult3 = ex.submit(tarea2);


        ex.shutdown();
        System.out.println("Volviendo al main");

        while ((!futureResult.isDone()) && (!futureResult2.isDone())) {
            System.out.println(String.format("Resultado1: %s - Resultado3: %s - Resultado3: %s",
                    futureResult.isDone() ? "finalizado" : "en proceso",
                    futureResult2.isDone() ? "finalizado" : "en proceso",
                    futureResult3.isDone()? "finalizado" : "en proceso"));
            TimeUnit.MILLISECONDS.sleep(2000);
        }

        System.out.println("Finalizo la ejecucion de la tarea");
        System.out.println("Resultado de la tarea: " + futureResult.get());
        System.out.println("Resultado de la tarea: " + futureResult3.get());
        System.out.println("Resultado de la tarea2: " + futureResult2.get());


    }
}
