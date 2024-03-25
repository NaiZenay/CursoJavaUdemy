package POO.basic;

import java.util.Scanner;

//La sobrecarga de metodos se refiere a los metodos q realizan la misma tarea y se llaman igual pero con diferentes parametros
public class Sobrecarga {
    static public int sumar(int a, int b){
        return a+b;
    }

    static public float sumar(float a,float b){
        return a+b;
    }

    static public double sumar(double a, double b){
        return a+b;
    }

    static public int sumar(String a, String b){
        int A=0;
        int B=0;
        try{
            A=Integer.parseInt(a);
            B=Integer.parseInt(b);
        }catch (NumberFormatException nfe){
            return 0;
        }
        return A+B;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(sumar(scanner.next(),scanner.next()));

        System.out.println(sumar(scanner.nextInt(),scanner.nextInt()));

        System.out.println(sumar(scanner.nextDouble(),scanner.nextDouble()));

        System.out.println(sumar(scanner.nextFloat(),scanner.nextFloat()));

    }
}
