package Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        //Objeto de jav.util para fechas
        Date date = new Date();
        System.out.println("date = " + date);//Wed Jan 24 14:29:19 CST 2024

        //Objeto con el fin de dar un formato personalizado de un Date en forma de String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy dd MM");//toma un string en el constructor del formato a utilizar

        /*
        yyyy-MM-dd	2024-01-24
        dd/MM/yyyy	24/01/2024
        MM/dd/yyyy	01/24/2024
        HH:mm:ss	14:30:00
        yyyy-MM-dd HH:mm:ss	2024-01-24 14:30:00
        */

        System.out.println(sdf.format(date));//toma la referencia de date como argumento

        Date date2 = new Date();
        System.out.println(date2.getTime());//Obtiene los milisegundos de 1970 hasta ahora
    }


}
