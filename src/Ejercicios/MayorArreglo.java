package Ejercicios;

import java.util.Scanner;

public class MayorArreglo {
    public static void main(String[] args) {
        int[] nums=new int[5];
        int mayor=0;
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();

        }
        for (int i = 1; i < nums.length; i++) {
            mayor=(nums[mayor]>nums[i])?mayor:i;

        }

        System.out.println(nums[mayor]);

    }
}
