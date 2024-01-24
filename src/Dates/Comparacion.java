package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Comparacion {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        calendar.set(2021,00,15);
        Date fecha1= calendar.getTime();
        calendar.set(2022,04,25);
        Date fecha2= calendar.getTime();

        //Comparacion de fechas (despues)
        if (fecha1.after(fecha2)){
            System.out.println("Fecha1: "+sdf.format(fecha1)+"es despues de Fecha2: "+sdf.format(fecha2));
        }else{
            System.out.println("Fecha2: "+sdf.format(fecha2)+" es despues de Fecha1: "+sdf.format(fecha1));
        }

        //Comparacion de fechas (antes)
        if (fecha1.before(fecha2)){
            System.out.println("Fecha1: "+sdf.format(fecha1)+" es antes de Fecha2: "+sdf.format(fecha2));
        }else{
            System.out.println("Fecha2: "+sdf.format(fecha2)+" es antes de Fecha1: "+sdf.format(fecha1));
        }

        //Comparacion de fechas (igual)
        if (fecha1.equals(fecha2)){
            System.out.println("Fecha1: "+sdf.format(fecha1)+"es igual de Fecha2: "+sdf.format(fecha2));
        }else{
            System.out.println("Fecha2: "+sdf.format(fecha2)+" y Fecha1: "+sdf.format(fecha1)+" no son iguales".toUpperCase());
        }

        //Comparacion de fechas (igual)
        if (fecha1.compareTo(fecha2)==0){//0 iguales, <0 fecha1 es menor, 0> fecha1 es mayor
            System.out.println("Fecha1: "+sdf.format(fecha1)+" es igual de Fecha2: "+sdf.format(fecha2));
        }else if(fecha1.compareTo(fecha2)<0){
            System.out.println("Fecha1: "+sdf.format(fecha1)+" es antes de Fecha2: "+sdf.format(fecha2));
        }else if(fecha1.compareTo(fecha2)>0){
            System.out.println("Fecha1: "+sdf.format(fecha1)+" es despues de Fecha2: "+sdf.format(fecha2));
        }



    }
}
