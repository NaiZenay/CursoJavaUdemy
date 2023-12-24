package Ejercicios;

import javax.swing.*;

public class EjercicicoSistemasNumericos {
    public static void main(String[] args) {
        boolean numeroValido;
        int numeroDecimal = 0;
        do {
            numeroValido = true;
            //Entrada de datos
            String inputNumeroDecimal = JOptionPane.showInputDialog(null, "INGRESE UN NUMERO ENTERO");
            try {
                //Conersion a un entero
                numeroDecimal = Integer.parseInt(inputNumeroDecimal);
            } catch (NumberFormatException nfe) {
                //En caso de no ingresar un numero en el input mostrar alerta
                JOptionPane.showMessageDialog(null, "INGRESA UN NUMERO VALIDO");
                numeroValido = false;
            }
            //Repetir hasta que se ingrese un numero valido
        } while (numeroValido == false);
        //Realizar operacion y mostrar mensaje con los resultados
        String resultado = "Numero Binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal) + "\n" +
                "Numero Octal de " + numeroDecimal + "=" + Integer.toOctalString(numeroDecimal) + "\n" +
                "Numero Hexadecimal de " + numeroDecimal + "=" + Integer.toHexString(numeroDecimal);
        //Mostrar mensaje con el resultado
        JOptionPane.showMessageDialog(null, resultado);
        //Mensaje de Programa finalizado
        JOptionPane.showMessageDialog(null, "Programa finalizado");

    }
}
