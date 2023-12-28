package Operadores;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        boolean b1 = i < j;
        System.out.println(b1 ? "aprobado" : "reprobado");
        //if(condicion)?, true : false

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int max;
        System.out.println("Ingresa un numero entero");
        num1 = scan.nextInt();
        System.out.println("Ingresa un numero entero");
        num2 = scan.nextInt();
        System.out.println("Ingresa un numero entero");
        num3 = scan.nextInt();
        max=(num1 > num2)?num1:num2;
        max=(max>num3)?max:num3;

        System.out.println("El numero mas grande de los tres es:" + max);


        //Jerarquia de operaciones
        /*
        | Operador | Significado |
        | ++,--,+,-,! | incremento,decremento,suma,resta,negacion |
        | () | parentesis |
        | *,/,% | Operaciones aritmeticas |
        | >,>=,<,<= intanceof | relacionales |
        | ==, != | comparacion,disntito de |
        | && | AND |
        | || | or |
        | ()?: | ternario |
        | +,+=,-=,*=,/=,%= | asignacion |
        */
    }
}
