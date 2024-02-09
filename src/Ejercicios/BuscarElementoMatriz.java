package Ejercicios;

import java.util.Scanner;

public class BuscarElementoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[4][4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Ingres el numero a guardar en la posicion [" + i + "][" + j + "]");
                nums[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingresa el elemento a buscar");
        int elemento = scanner.nextInt();
        boolean encontrado=false;

        buscador:for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == elemento) {
                    System.out.println("Elemento: " + elemento + " encontrado en la posicion: " + i + "," + j);
                    encontrado = true;
                    break buscador;
                }
            }
        }
        if (!encontrado){
            System.out.println("Elemento:" + elemento + " no encontrado");
        }

    }
}
