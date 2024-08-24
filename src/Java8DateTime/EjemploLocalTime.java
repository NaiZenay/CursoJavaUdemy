package Java8DateTime;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora:"+ahora.getHour()+" Min:"+ahora.getMinute()+" Segs:"+ahora.getSecond());

        LocalTime seisCon30= LocalTime.of(6,30);
        System.out.println("seisCon30 LocalTime.of= " + seisCon30);

        seisCon30 = LocalTime.parse("06:30");
        System.out.println("seisCon30 Parse= " + seisCon30);

        LocalTime ahora2 = LocalTime.now();
        LocalTime en30min=LocalTime.now().plusMinutes(30);
        System.out.println(ahora+" en30min = " + en30min);

        LocalTime hace30min=LocalTime.now().minusMinutes(30);
        System.out.println(ahora+" hace30min = " + hace30min);

        boolean despues= ahora2.isBefore(en30min);
        System.out.println("despues = " + despues);

        boolean antes=ahora2.isAfter(hace30min);
        System.out.println("antes = " + antes);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Local Time formateado");
        System.out.println(dateTimeFormatter.format(ahora2));

        LocalTime max= LocalTime.MAX;
        LocalTime min= LocalTime.MIN;

        System.out.println("Hora maxima del dia:"+max);
        System.out.println("Hora minima del dia:"+min);

    }


}
