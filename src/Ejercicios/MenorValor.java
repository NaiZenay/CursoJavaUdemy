package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {
        /*
        El desafío es buscar el número menor de mínimo 10 valores enteros
        Requisitos:
        1.Calcular el menor número e imprimir el valor.
        2.Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".
         */
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int menorValor = Integer.MAX_VALUE;
        boolean menorA10 = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un numero entero");
            try {
                numeros[i] = scanner.nextInt();
            } catch (InputMismatchException IME) {
                System.out.println("Ingresaste un numero demasiado grande o ingresaste algo que no es un numero");
                System.exit(0);
            }
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
            if (menorValor < 10) {
                menorA10 = true;
            }

        }
        System.out.println("El numero con el menor valor es: " + menorValor);
        if (menorA10) {
            System.out.println("El numero de menor valor: " + menorValor + " es menor a 10");
        } else {
            System.out.println("El numero de menor valor: " + menorValor + " es mayor o igual a 10");
        }

    }
}
