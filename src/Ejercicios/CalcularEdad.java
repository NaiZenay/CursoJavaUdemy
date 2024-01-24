package Ejercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date FechaNac = null;
        boolean fechavalida;
        do {
            try {
                fechavalida = true;
                System.out.println("Ingresa la fecha de nacimieto Formato:(2000-01-10)");
                String FechaString = s.next();
                FechaNac = df.parse(FechaString);
            } catch (ParseException e) {
                System.out.println("Formato invalido");
                fechavalida=false;
            }
        }while (!fechavalida);

        Date actual = new Date();
        df = new SimpleDateFormat("yyyyMMdd");
        int desde = Integer.parseInt(df.format(FechaNac));
        int hasta = Integer.parseInt(df.format(actual));

        int edad = (hasta - desde) / 10000;

        System.out.println("edad = " + edad);

    }

}
