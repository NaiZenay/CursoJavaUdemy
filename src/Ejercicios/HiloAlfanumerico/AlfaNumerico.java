package Ejercicios.HiloAlfanumerico;

import java.util.concurrent.ThreadPoolExecutor;

public class AlfaNumerico {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new AlfaNumericoTarea(Tipo.NUMERO)).start();
        new Thread(new AlfaNumericoTarea(Tipo.LETRA)).start();

    }
}