package Ejercicios;
import java.util.Scanner;
public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[2];
        for (int i=0;i<numeros.length; i++){
            System.out.println("Ingresa un numero entero");
            numeros[i]=scanner.nextInt();
        }
        String orden=numeros[0]>numeros[1]?numeros[0]+" es mayor que "+ numeros[1]:numeros[1]+"es mayor que "+numeros[0];
        System.out.println(orden);
    }
}
