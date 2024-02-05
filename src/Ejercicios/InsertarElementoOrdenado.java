package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarElementoOrdenado {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        int max = nums.length;
        for (int i = 0; i < max; i++) {
            System.out.println("Ingrese un numero a guardar en el arreglo");
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Ingrese el numero a inyectar en el arreglo");
        int elemento = scanner.nextInt();
        int posicion=0;
        for (int i = 0; i < max-1; i++) {
            if (elemento > nums[i] && elemento < nums[i + 1]) {
                posicion = i+1;
                System.out.println(posicion);
            }
        }
        for (int i = max - 2; i >= posicion; i--) {
            nums[i + 1] = nums[i];
        }
        nums[posicion] = elemento;

        for (int num : nums) System.out.print(num+" ");


    }
}
