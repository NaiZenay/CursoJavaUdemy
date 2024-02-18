package Matrices;

import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        int [][] nums = new int[3][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]= j+1;
            }
        }

        for (int[] fila : nums) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        int aux;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                aux=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=aux;
            }
        }
        System.out.println();

        for (int[] fila : nums) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
