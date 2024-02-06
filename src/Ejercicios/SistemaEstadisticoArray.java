package Ejercicios;

import java.util.Scanner;

public class SistemaEstadisticoArray {
    /*
    Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[7];
        int countNegativos = 0;
        int countPositivos = 0;
        double promedioNegativos = 0;
        double promedioPositivos = 0;
        int countCeros = 0;
        for (int i = 0; i < 7; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] < 0) {
                countNegativos++;
                promedioNegativos += nums[i];
            } else if (nums[i] > 0) {
                countPositivos++;
                promedioPositivos += nums[i];
            } else {
                countCeros++;
            }
        }
        System.out.println("Promedio de numeros negativos: " + (promedioNegativos /= countNegativos));
        System.out.println("Promedio de numeros positivos: " + (promedioPositivos /= countPositivos));
        System.out.println("Cantidad de Ceros:" + countCeros);
    }
}
