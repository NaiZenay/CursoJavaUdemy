package Ejercicios;

import javax.swing.*;
import java.util.Locale;

public class ManejoStrings {
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
