package ManejoArchivos.service;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(archivo, true))) {
            bf.append("Tamangandapio");
            System.out.println("escrito con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter pw = new PrintWriter((new FileWriter(archivo, true)))) {
            pw.println("Wasaaaaap");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder stringBuilder = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader bf = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea=bf.readLine()) != null) {
                stringBuilder.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder stringBuilder = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner scanner= new Scanner(archivo)){
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.next()).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
