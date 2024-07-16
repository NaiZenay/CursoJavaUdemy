package Ejercicios.HiloAlfanumerico;

import java.util.PrimitiveIterator;

public class AlfaNumericoTarea implements Runnable{
    private Tipo tipo;

    public AlfaNumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo==Tipo.NUMERO){
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }else {
            for (char letra = 'a'; letra <= 'z'; letra++) {
                System.out.println(letra);
            }
        }
    }
}
