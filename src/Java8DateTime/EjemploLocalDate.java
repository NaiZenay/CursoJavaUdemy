package Java8DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        fechaActual= LocalDate.of(2020,12,25);
        System.out.println("fechaActual = " + fechaActual);
                                            //asigancion con enum
        fechaActual=LocalDate.of(2020, Month.APRIL,11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual=LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);
                                                //incrementar dias
        LocalDate diaDeMangana= LocalDate.now().plusDays(1);
        System.out.println("diaDeMangana = " + diaDeMangana);

                                                //diminuir dias
        LocalDate ayer=LocalDate.now().minusDays(1);
        System.out.println("ayer = " + ayer);

        LocalDate mesAnteriorMismoDia= LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek  diaDeSemanaConFecha= LocalDate.parse("2024-08-23").getDayOfWeek();
        System.out.println("diaDeSemanaConFecha = " + diaDeSemanaConFecha);
        
        int once = LocalDate.of(2024,8,23).getDayOfMonth();
        System.out.println("once = " + once);
        
        boolean esBisiesto= LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes= ayer.isBefore((LocalDate.now()));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues= ayer.isAfter((LocalDate.now()));
        System.out.println("esAntes = " + esAntes);

        boolean esIgual= ayer.isEqual((LocalDate.now()));
        System.out.println("esAntes = " + esAntes);


        System.out.println();
        Month mes= fechaActual.getMonth();
        System.out.println("mes = " + mes);
        System.out.println("Mes en español: " +
                //Obtener mes en español
                mes.getDisplayName(TextStyle.FULL,new Locale("es","ES")));
        System.out.println("Dia de la semana en español: " +
                //Obtener mes en español
                diaDeSemanaConFecha.getDisplayName(TextStyle.FULL,new Locale("es","ES")));


    }
}
