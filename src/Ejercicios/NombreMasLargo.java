package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        String inputnombre1 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String inputnombre2 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String inputnombre3 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String resultado = "La persona con el nombre mas largo es: ";

        String[] nombre1 = inputnombre1.split(" ");
        int largoNombre1 = nombre1[0].toCharArray().length;

        String[] nombre2 = inputnombre2.split(" ");
        int largoNombre2 = nombre2[0].toCharArray().length;

        String[] nombre3 = inputnombre3.split(" ");
        int largoNombre3 = nombre3[0].toCharArray().length;

        int nombreMasLargo = (largoNombre1 > largoNombre2) ? largoNombre1 : largoNombre2;
        nombreMasLargo = (nombreMasLargo > largoNombre3) ? nombreMasLargo : largoNombre3;

        if (nombreMasLargo == largoNombre1) {
            resultado += inputnombre1 + " con (" + largoNombre1 + ") caracteres";
        } else if (nombreMasLargo == largoNombre2) {
            resultado += inputnombre2 + " con (" + largoNombre2 + ") caracteres";
        } else if (nombreMasLargo == largoNombre3) {
            resultado += inputnombre3 + " con (" + largoNombre3 + ") caracteres";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
