package Ejercicios;

import java.util.Scanner;

public class ParesImparesArray {
    public static void main(String[] args) {
        int[] arr = new int[10], pares, impares;
        int paresLength = 0;
        int imparesLength = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                paresLength++;
            } else {
                imparesLength++;
            }
        }
        pares = new int[paresLength];
        impares = new int[imparesLength];
        int indexPares=0,imparesIndex=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pares[indexPares++]=arr[i];
            } else {
                impares[imparesIndex++]=arr[i];
            }
        }

        for (int par :pares) System.out.print(par+" ");
        System.out.println();
        for (int impar :impares) System.out.print(impar+" ");

    }
}
