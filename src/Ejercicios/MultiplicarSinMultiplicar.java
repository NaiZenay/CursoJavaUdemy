package Ejercicios;

import java.util.Scanner;

public class MultiplicarSinMultiplicar {
    public static void main(String[] args) {
        /*
        Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
        tener en cuenta los unarios, donde menos por menos es positivo.
         */
        Scanner scanner= new Scanner(System.in);
        int nums []= new int[2];
        for(int i=0 ; i<nums.length;i++){
            System.out.println("Ingresa un numero entero");
            nums[i]= scanner.nextInt();
        }
        int aux=nums[0];
        for (int i=1 ; i<nums[1];i++){
            nums[0]+=aux;
        }
        System.out.println("Reusltado de multiplicar:"+aux+"x"+nums[1]+"="+nums[0]);
    }
}
