package Matrices;

import java.util.Scanner;

public class Creacion {
    public static void main(String[] args) {
        //Arreglo de Arreglos filas,columnas
        int[][] nums = new int[4][4];
        Scanner scanner = new Scanner(System.in);

//el primer ciclo recorre las filas
        for (int i = 0; i < nums.length; i++) {
            //el segundo for recorre las columas por fila
            for (int j = 0; j < nums.length; j++) {
                System.out.println("Ingres el numero a guardar en la posicion [" + (i + 1) + "][" + (j + 1) + "]");
                nums[i][j] = scanner.nextInt();
            }
        }
//iterando con for
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("====================================");

        //iteradno con foreach
        for (int[] fila : nums) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.println("====================================");

        //otra forma de crear una matriz con datos estaticos
        int[][] nums2 = {{1, 1}, {2, 2}};

        //iteradno con foreach
        for (int[] fila : nums2) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }

    }
}
