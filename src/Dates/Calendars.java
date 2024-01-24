package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendars {
    public static void main(String[] args) {
        //API para seleccionar un fecha especifica
        Calendar calendar= Calendar.getInstance();
        //Asignacion fecha (año,    mes,    dia,    hora,       minuto,     segundo)
        calendar.set(2020, 0, 01,12,00,01);
        Date fecha = calendar.getTime();
        System.out.println("fecha = " + fecha);

        //Asignacion manual a traves de constantes
        Calendar calendario= Calendar.getInstance();
        calendario.set(Calendar.YEAR,2025);
        calendario.set(Calendar.MONTH,0);
        calendario.set(Calendar.DAY_OF_MONTH,12);
        calendario.set(Calendar.MINUTE,15);
        calendario.set(Calendar.SECOND,13);

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fecha2= calendario.getTime();
        System.out.println("calendario = " +simpleDateFormat.format(fecha2));

    }
}
