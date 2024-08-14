package Ejercicios;

import javax.swing.*;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NombreMasLargo {
    /*
    Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos.
Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
Restricción no usar loops en el desarrollo de la tarea.
Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
     */
    public static void main(String[] args) {
        String inputnombre1 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String inputnombre2 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String inputnombre3 = JOptionPane.showInputDialog(null, "Ingresa el nombre y apellido de un familiar o amigo");
        String resultado = "La persona con el nombre mas largo es: ";
        
        String max=(inputnombre1.split(" ")[0].length()>inputnombre2.split(" ")[0].length())?inputnombre1:inputnombre2;
        max=(max.split(" ")[0].length() > inputnombre3.split(" ")[0].length())?max:inputnombre3;

        resultado+=max;


        //Solucion con Streams
        IntStream nombres=Stream.of(inputnombre1,inputnombre2,inputnombre3).map(nom->nom.split(" ")[0]).mapToInt(String::length);
        IntSummaryStatistics nombresInt=nombres.summaryStatistics();
        System.out.println();
        JOptionPane.showMessageDialog(null, resultado+" con "+nombresInt.getMax()+" carcteres");

    }
}
