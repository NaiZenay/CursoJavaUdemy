package Hilos;

import Hilos.runnable.Tarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        //Crea el hilo que toma como parametro una objeto ejecutable
        new Thread(new Tarea("Mate")).start();
        new Thread(new Tarea("Español")).start();
        new Thread(new Tarea("Ingles")).start();
        new Thread(new Tarea("Historia")).start();
        new Thread(new Tarea("Geografia")).start();
    }
}
