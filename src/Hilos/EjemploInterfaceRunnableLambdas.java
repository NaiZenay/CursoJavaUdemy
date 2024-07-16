package Hilos;

import Hilos.runnable.Tarea;

import static Hilos.runnable.Tarea.random;

public class EjemploInterfaceRunnableLambdas {
    public static void main(String[] args) throws InterruptedException {
        //Runnable es una interfaz por lo que se "instancia" como una clase anonima
//        Runnable tarea= new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("i = " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(random.nextLong(1000));
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
        Thread main= Thread.currentThread();

        Runnable tarea=() -> {
            //cuerpo del metodo run (Override de la interfaz)
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(random.nextLong(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            System.out.println(main.getState());

        };

        //Crea el hilo que toma como parametro un objeto ejecutable y el hilo
        Thread h1=new Thread(tarea,"Mate");
        Thread h2=new Thread(tarea,"Español");
        Thread h3=new Thread(tarea,"Ingles");
        Thread h4=new Thread(tarea,"Historia");
        Thread h5=new Thread(tarea,"Geografia");

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

        //mantedra en espera al hilo padre hasta q los hilos hijos terminen su ejecucion
        h1.join();
        h2.join();
        h3.join();
        h4.join();
        h5.join();
        System.out.println("Continua con el main");
        System.out.println(main.getState());
    }
}
