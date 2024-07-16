package Hilos.runnable;

public class SincronizacionThread {
    public static void main(String[] args) {
        new Thread(new ImprimirFrases("Hola ","q tal?")).start();
        new Thread(new ImprimirFrases("Buenas ","Noches")).start();
        new Thread(new ImprimirFrases("Pan ","con cafe")).start();
    }


    //asegura q solo un hilo pueda ejecutar la funcion imprimirFrases una a la vez
    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);
    }
}
