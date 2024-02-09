package Ejercicios;

import java.util.Scanner;

public class Historiograma {
    /*
    Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

    El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

    Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos,
      es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.

    Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

    1: ***
    2:
    3: *
    4: *****
    5: *
    6: **
    Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
     */
    public static void main(String[] args) {
        int[] nums = new int[12];
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println("Ingresa un numero del 1-6");
            nums[i]= scanner.nextInt();
        }

        int[] arregloCantidadValores = new int[12];
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
            System.out.print(arregloCantidadValores[i]+" ");
        }

        System.out.println("\n============================");
        for (int i = 0; i < nums.length ; i++) {
            String historiograma=nums[i]+"";
            for (int j = 0; j < arregloCantidadValores[i]; j++) {
                historiograma+="*";
            }
            System.out.println("\n"+historiograma);
        }

    }
}
