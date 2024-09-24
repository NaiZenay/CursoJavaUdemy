package Ejercicios.LeerArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraerDatos {
    public static void main(String[] args) {
        List<String> datos = new ArrayList<>();
        String nombreArchivo = "C:\\Users\\Ian\\Documents\\Dev\\Java\\CursoJavaUdemy\\src\\Ejercicios\\LeerArchivo\\data";

        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (BufferedReader bf = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = bf.readLine()) != null) {
                if (linea.contains("||")) {
                    String[] partes = linea.split("\\|\\|");
                    datos.addAll(Arrays.asList(partes));
                } else {
                    datos.add(linea);  // Añadir la línea completa si no contiene "||"
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mostrar los datos
        datos.forEach(System.out::println);
    }
}
