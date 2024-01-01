package FlujoDeControl;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 5");
        num = scanner.nextInt();
        //Soporta primitivos como ,int ,byte , short , char y Refrenciados como Integer y String ademas de Enums

        switch (num) {
            case 1:
                System.out.println("Ingresaste el numero 1");
                break;
            case 2:
                System.out.println("Ingresaste el numero 2");
                break;
            case 3:
                System.out.println("Ingresaste el numero 3");
                break;
            case 4:
                System.out.println("Ingresaste el numero 4");
                break;
            case 5:
                System.out.println("Ingresaste el numero 5");
                break;
            default:
                System.out.println("Ingresaste un numero que no esta entre el 1 y el 5");
                break;
        }
    }
}
