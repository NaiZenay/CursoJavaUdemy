package Hilos.runnable;

public class ImprimirFrases implements Runnable{
    String frase1;
    String frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        SincronizacionThread.imprimirFrases(frase1,frase2);
    }
}
