package Matrices;

import java.util.Scanner;

public class SumaMatrices {
    static Scanner scanner = new Scanner(System.in);

    static void poblarMatriz(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Ingres el numero a guardar en la posicion [" + i + "][" + j + "]");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] resultado = new int[3][3];

        SumaMatrices.poblarMatriz(a);
        SumaMatrices.poblarMatriz(b);

        //Suma
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        //resultado
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
        }


    }
}
