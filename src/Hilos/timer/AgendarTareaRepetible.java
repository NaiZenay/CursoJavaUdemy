package Hilos.timer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class AgendarTareaRepetible {
    public static void main(String[] args) {
        Timer timer = new Timer();
        /*
         las operaciones realizadas sobre estas variables son indivisibles y se completan en un solo paso,
         lo que asegura que no haya interferencias por otros hilos durante la ejecución de estas operaciones.
         */
        AtomicInteger count= new AtomicInteger(3);
        Toolkit tl= Toolkit.getDefaultToolkit();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i=count.getAndDecrement();

                if (i > 0) {
                    //Hara un sonido cada q se incie una nueva tarea
                    tl.beep();
                    System.out.println("tarea periodica en: " + new Date() + " nombre del Thread :" + Thread.currentThread().getName());
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }

            }
        }, 3000, 2000);

        System.out.println("Agendamos una tarea para 5 segundos mas....");
    }
}
