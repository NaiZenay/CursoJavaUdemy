package Arrays;

import java.util.Scanner;

public class Recorrer {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] nums = new int[10];
        int total=nums.length;
        
        //Recorrer con for
        //inicia en la posicion 0 ; hasta el total del arreglo;incremento
        for(int i =0;i<total;i++){
            //asignacion de valor por posicion
            nums[i]=scanner.nextInt();
        }
        
        //recorrer con forEach
        for(int num:nums){
            System.out.println("num = " + num);
        }

        //Recorrer de manera inversa
        for (int i = total-1; i >=0 ; i--) {
            System.out.println(nums[i]);
        }
        System.out.println("=========================");
        //inverso de un valor
        for (int i = total-1; i >=0 ; i--) {
            int actual=nums[i];
            int inverso= nums[total-i-1];
            System.out.println("Para cada "+actual+":"+inverso);
        }

    }
}
