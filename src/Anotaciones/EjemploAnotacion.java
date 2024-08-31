package Anotaciones;

import Anotaciones.modelos.Producto;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p= new Producto();

        p.setNombre("tv plana");
        p.setPrecio(1234);
        p.setFecha(LocalDate.now());

        System.out.println("json = " + Procesador.convertirJSON(p));
    }
}
