package Java8DateTime;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTime = LocalDateTime.now();
        System.out.println("fechaTime = " + fechaTime);
        
        fechaTime = LocalDateTime.of(2020, Month.DECEMBER, 25, 22, 30);
        System.out.println("fechaTime = " + fechaTime);

        fechaTime= LocalDateTime.parse("2020-12-25T00:30");
        System.out.println("fechaTime = " + fechaTime);

        LocalDateTime fechaTime2=fechaTime.plusDays(22);
        System.out.println(fechaTime2);
        LocalDateTime fechaTime3=fechaTime.minusDays(22);
        System.out.println(fechaTime3);

        Month mes= fechaTime.getMonth();
        DayOfWeek dia=fechaTime.getDayOfWeek();
        int ano=fechaTime.getYear();

        System.out.println(fechaTime2.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")));


    }
}
