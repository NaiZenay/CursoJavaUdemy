package Ejercicios;

import java.util.Scanner;

public class DesplazarPosicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = nums.length;

        int aux = nums[max - 1];
        for (int i = max - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = aux;
        for (int num : nums) System.out.println(num);

        System.out.println("===========================================");

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int MAX = nums2.length;
        System.out.println("Ingresa el numero a inyectar en el arreglo");
        int elemento = scanner.nextInt();
        System.out.println("Ingresa la posicion donde se inyectara el elemento (0-9)");
        int posicion = scanner.nextInt();

        for (int i = MAX - 2; i >= posicion; i--) {
            nums2[i + 1] = nums2[i];
        }
        nums2[posicion] = elemento;

        for (int num : nums2) System.out.println(num);
    }
}
