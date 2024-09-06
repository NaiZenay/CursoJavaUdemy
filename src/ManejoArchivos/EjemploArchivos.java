package ManejoArchivos;

import ManejoArchivos.service.ArchivoServicio;

public class EjemploArchivos {
    public static void main(String[] args) {
        String nombreArchivo= "C:\\Users\\Ian\\Documents\\Dev\\Java\\CursoJavaUdemy\\src\\ManejoArchivos\\TXT.txt";
        ArchivoServicio servicio= new ArchivoServicio();
        servicio.crearArchivo2(nombreArchivo);
    }
}
