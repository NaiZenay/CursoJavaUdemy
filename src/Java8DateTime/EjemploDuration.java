package Java8DateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class EjemploDuration {

    public static void main(String[] args) {
        LocalDateTime fecha1=LocalDateTime.now();
        LocalDateTime fecha2=LocalDateTime.now();

//        retorna la direfencia de tiempo en Horas,min,ss,ms
        Duration lapsus= Duration.between(fecha1,fecha2.plusDays(2));
        System.out.println("lapsus = " + lapsus);
    }
    
}
