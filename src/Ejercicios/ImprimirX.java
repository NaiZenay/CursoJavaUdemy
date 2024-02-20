package Ejercicios;

import java.util.Scanner;

public class ImprimirX {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la matriz");
        int length=scanner.nextInt();

        char[][] x = new char[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                if (i == j) {
                    x[i][j] = 'x';
                } else if (i+j == length-1){
                    x[i][j] = 'x';
                }else {
                    x[i][j] = ' ';
                }


            }
        }

        for (char[] fila : x) {
            for (char columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }


    }
}
