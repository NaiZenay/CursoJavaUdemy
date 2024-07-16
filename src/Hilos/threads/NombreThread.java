package Hilos.threads;

public class NombreThread extends Thread{
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("se inicia el metodo run del hilo "+ getName());

        }
        System.out.println("fin de hilo");
    }

}
