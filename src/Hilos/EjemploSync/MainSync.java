package Hilos.EjemploSync;

public class MainSync {
    public static void main(String[] args) {
        Panaderia p= new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }
}
