package Hilos;

import Hilos.threads.NombreThread;

public class Hilos {
    /*
    Los hilos maneja ciclos de vida
    NEW: Cuando se ha creado pero no se ha iniciado
    RUNNABLE:DEspues de haberse creado se ha iniciado y est corriendo
    BLOCKED:No esta capacitado para ser ejecutado
    WAITING:Cuando esta en estado de espera en lo que otro hilo se ejecuta
    TERMINATED:Un hilo que ha terminado su ejecucion

    ALgunos metodos
    wait() ==> Desbloquea un hilo para que otro puedan tener acceso a un recurso sincronizado
    notify() ==> Despierta hilo para acceder a un recurso que estaba en estado de bloque
    notifyAll() ==> Despierta hilos para acceder a un recurso que estaba en estado de bloque
    sleep() ==> Deja en un estado suspendido por una cantidad de tiempo la ejecucion del hilo
    join() ==> Espera a que otros hilos terminen su ejecucion para terminar la ejecucion del hilo
     */
    public static void main(String[] args) {
        Thread hilo= new NombreThread("John Doe");
        Thread hilo3= new NombreThread("Maria Doe");


        //ejecuta el hilo
        hilo.start();
        //Obtiene el estado actual del hilo
        System.out.println(hilo.getState());
    }
}
