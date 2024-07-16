package Hilos.executor;

import java.util.concurrent.*;

/*
es una interfaz en Java que proporciona métodos para gestionar
la ejecución de tareas de manera asíncrona utilizando un grupo de hilos (thread pool)
 */
public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService ex= Executors.newSingleThreadExecutor();
        Runnable tarea=(()->{
            System.out.println("Inicio");
            try {
                System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin");
        });

        //Guarda una tarea a ser ejecutada
        Future<?> futureResult=ex.submit(tarea);
        /*
        Future
        es una interfaz que representa el resultado de una tarea asincrónica.
        Proporciona métodos para comprobar si la tarea está completa,
        esperar a su finalización y recuperar el resultado de la tarea.
        Metodos
        get() => Bloquea una atraea hasta q este completa(o expire cierto tiempo determinado en el constructor)
        cancel() => intenta cancelar la tarea devuelve un boolean
        isCanceled() => retorna un boolean de si la tarea se cancelo antes de terminar
        isDone() => retorna un boolean de si la tarea termino con exito

         */


        /*
        ex.shutdown();
        inicia un cierre ordenado en el que las tareas ya enviadas serán ejecutadas,
        pero no se aceptarán nuevas tareas. No interrumpe las tareas que ya están en ejecución.
         */
        ex.shutdown();
        System.out.println("Volviendo al main");
        /*
        ex.awaitTermination
            hace que el hilo principal espere hasta que todas las tareas
            en el ExecutorService hayan completado su ejecución después de
            una solicitud de shutdown. Este método toma dos parámetros: un tiempo límite y la unidad de tiempo.
         */
//        ex.awaitTermination(2,TimeUnit.SECONDS);

        while (!futureResult.isDone()){
                System.out.println("ejecutando...");
                TimeUnit.MILLISECONDS.sleep(2000);
        }

        System.out.println("Finalizo la ejecucion de la tarea");
        System.out.println("Resultado de la tarea: "+futureResult.get());


    }
}
