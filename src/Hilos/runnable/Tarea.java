package Hilos.runnable;

import java.util.Random;

public class Tarea implements Runnable {

    public static Random random = new Random();
    private String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + nombre);
            try {
                Thread.sleep(random.nextLong(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
