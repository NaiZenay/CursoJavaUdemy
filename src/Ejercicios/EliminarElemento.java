package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarElemento {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        int max = nums.length;
        for (int i = 0; i < max; i++) {
            nums[i] = i+1;
        }
        Arrays.sort(nums);
        System.out.println("Ingrese la posicion a eliminar en el arreglo (0-9)");
        int posicionEliminada = scanner.nextInt();

        nums[posicionEliminada]=0;
        for (int i = posicionEliminada ; i<max-1;i++){
            nums[i]=nums[i+1];
        }

        for (int num : nums) System.out.print(num+" ");

    }
}
