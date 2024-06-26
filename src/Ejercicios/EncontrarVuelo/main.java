package Ejercicios.EncontrarVuelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("AAL 933", "New York", df.parse("2021-08-29 05:39"), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", df.parse("2021-08-31 04:45"), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", df.parse("2021-08-30 16:00"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", df.parse("2021-08-29 13:22"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", df.parse("2021-08-31 14:05"), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", df.parse("2021-08-31 05:20"), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", df.parse("2021-08-30 08:45"), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", df.parse("2021-08-29 07:41"), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", df.parse("2021-08-30 10:35"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", df.parse("2021-08-29 09:14"), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", df.parse("2021-08-31 08:33"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", df.parse("2021-08-31 15:15"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", df.parse("2021-08-30 08:14"), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", df.parse("2021-08-29 22:53"), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", df.parse("2021-08-31 09:57"), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", df.parse("2021-08-31 04:00"), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", df.parse("2021-08-29 07:45"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", df.parse("2021-08-30 07:12"), 58));
        vuelos.add(new Vuelo("LAT 501", "París", df.parse("2021-08-29 18:29"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", df.parse("2021-08-30 15:45"), 39));

        vuelos.sort(Vuelo::compareTo);
        for (Vuelo vueloss:vuelos){
            System.out.println(vueloss.toString());
        }
        LinkedList<Vuelo> vuelosOrd = new LinkedList<>(vuelos);
        vuelosOrd.sort((a, b) -> b.getCantidadPasajeros().compareTo(a.getCantidadPasajeros()));
        Vuelo ultimovuelo= vuelos.getLast();
        Vuelo menosPasajeros=vuelosOrd.getLast();

        System.out.println();
        System.out.println("El ultimo vuelo es:");
        System.out.println(ultimovuelo.toString());

        System.out.println();
        System.out.println("El vuelo con menos pasajeros es:");
        System.out.println(menosPasajeros.toString());

    }

}