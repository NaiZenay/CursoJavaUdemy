package Ejercicios;

import javax.swing.*;

public class ManejoStrings {
    /*
    La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
N.es_A.ia_E.pe
     */
    public static void main(String[] args) {
        String[] nombres = new String[3];
        String[] nombresConvertidos = new String[3];
        String resultado = "";
        for (int i = 0; i < 3; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Ingresa el nombre de algun familiar o amigo");
            nombresConvertidos[i] = String.valueOf(nombres[i].toUpperCase().charAt(1)).concat(".").concat(nombres[i].substring(nombres[i].length() - 2)).concat("_");
            resultado += nombresConvertidos[i];
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
