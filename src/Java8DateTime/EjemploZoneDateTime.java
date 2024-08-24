package Java8DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploZoneDateTime {
    public static void main(String[] args) {
        LocalDateTime zonaDateTime=LocalDateTime.now();

        //zonas horarias
        ZoneId ny=ZoneId.of("America/New_York");
        ZoneId madrid=ZoneId.of("Europe/Madrid");

        //Aleternativa para seleccionar la zona horaria
        ZoneOffset ny2= ZoneOffset.of("-04:00");
        ZoneOffset madrid2= ZoneOffset.of("+02:00");

        ZonedDateTime zonedDateTime=zonaDateTime.atZone(ny2);


                                                    //fecha, de donde
        ZonedDateTime zonedDateTimeNY= ZonedDateTime.of(zonaDateTime,ny);
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.println("Fecha y hora de partida de New York");
        System.out.println("zonedDateTimeNY = " + dateTimeFormatter.format(zonedDateTimeNY));


        ZonedDateTime zonedDateTimeMadrid= ZonedDateTime.of(zonaDateTime,madrid);
        System.out.println("Fecha y hora de llegada a Madrid");
        System.out.println("zonedDateTimeMadrid = " + dateTimeFormatter.format(zonedDateTimeMadrid.plusHours(12)));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        
    }
}
