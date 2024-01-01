package Ejercicios;

import java.util.Scanner;

public class AnalizadorDeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recibir texto
        System.out.println("Ingrese el texto a analizar");
        String inputTexto = scanner.nextLine();

        String[] letras = new String[3];
        int[] countLetras = new int[letras.length];

        System.out.println("Ingrese 3 caracteres a analizar dentro del texto");
        //Pedir letras sl usuario
        for (int i = 0; i < letras.length; i++) {
            letras[i] = scanner.nextLine();
        }

        //Llenar contadores
        for (int i = 0; i < inputTexto.toCharArray().length; i++) {
            if (String.valueOf(inputTexto.toCharArray()[i]).equalsIgnoreCase(letras[0])) {
                countLetras[0]++;
            } else if (String.valueOf(inputTexto.toCharArray()[i]).equalsIgnoreCase(letras[1])) {
                countLetras[1]++;
            } else if (String.valueOf(inputTexto.toCharArray()[i]).equalsIgnoreCase(letras[2])) {
                countLetras[2]++;
            }
        }

        for (int i = 0; i < countLetras.length; i++) {
            System.out.println("Hay " + countLetras[i] + " instancias de la letra " + letras[i]);
        }

        System.out.println();

        //Contar palabras
        System.out.println("Hay " + inputTexto.split(" ").length + " palabras en este texto");

        System.out.println();

        //Primer y ultimo caracter
        System.out.println("La letra \"" + inputTexto.toCharArray()[0] + "\" es el primer caracter del texto y \"" + inputTexto.toCharArray()[inputTexto.toCharArray().length - 1] + "\" es el ultimo caracter del texto");

        System.out.println();

        //Texto Invertido
        System.out.println("Como se veria el texto invertido?");
        for (int i=inputTexto.split(" ").length-1 ; i>0 ;i--){
            System.out.print(inputTexto.split(" ")[i]+ " ");
        }

        System.out.println();

        //Verficar si la palabra java se encuentra dentro de este texto
        if (inputTexto.contains("Java")){
            System.out.println("La palabra \"Java\" esta dentro de este texto");
        }
    }
}
