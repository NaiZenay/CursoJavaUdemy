package ManejoArchivos;

import ManejoArchivos.service.ArchivoServicio;

import java.io.IOException;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\Ian\\Documents\\Dev\\Java\\CursoJavaUdemy\\src\\ManejoArchivos\\TXT.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo(nombreArchivo));
        System.out.println(servicio.leerArchivo2(nombreArchivo));

    }
}
