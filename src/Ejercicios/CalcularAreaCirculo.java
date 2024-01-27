package Ejercicios;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio=0;
        try {
            System.out.println("Ingrese el radio del circulo a calcular");
            radio= scanner.nextDouble();
        } catch (Exception e) {
            System.err.println("RADIO INVALIDO");
        }
        System.out.println("El area del circulo es:"+Math.PI*(Math.pow(radio,2)));


    }
}
