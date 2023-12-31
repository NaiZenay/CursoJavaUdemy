package Ejercicios;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String inputnombre1 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String inputnombre2 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String inputnombre3 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String resultado = "La persona con el nombre mas largo es: ";
        
        String max=(inputnombre1.split(" ")[0].length()>inputnombre2.split(" ")[0].length())?inputnombre1:inputnombre2;
        max=(max.split(" ")[0].length() > inputnombre3.split(" ")[0].length())?max:inputnombre3;

        resultado+=max;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
