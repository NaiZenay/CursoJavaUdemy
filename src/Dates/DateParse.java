package Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");

        //dentro de un try catch para evitar errores en la conversion
        try {
            //Convierte un String en un Date
            Date fecha = simpleDateFormat.parse("2024-11-01");
            System.out.println(simpleDateFormat.format(fecha));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
