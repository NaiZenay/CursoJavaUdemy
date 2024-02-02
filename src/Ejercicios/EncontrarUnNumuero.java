package Ejercicios;

import java.util.Scanner;

public class EncontrarUnNumuero {
    public static void main(String[] args) {
        int nums[]= new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese un numero");
            nums[i]= scanner.nextInt();
        }
        System.out.println("Ingrese el numero a buscar");
        int buscado=scanner.nextInt();
        boolean encontrado=false;
        for (int i = 0; i < nums.length; i++) {
            if (buscado==nums[i]){
                encontrado=true;
                System.out.println("El numero se encuentra en la posicion "+i);
                break;
            }
        }
        if (!encontrado){
            System.out.println("El numero "+buscado+" no se encuentra en el arreglo");
        }


    }
}
