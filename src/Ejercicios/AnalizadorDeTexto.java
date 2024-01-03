package Ejercicios;

import java.util.Scanner;

public class AnalizadorDeTexto {
    //Desafio:Analizador De Texto

    /*
    Crear un progrma que reciba cualquier texto y realice lo siguiente:
    Que el usuario elija 3 caracteres y el programa le diga cuantas veces se encuantran esos caracteres en el texto
    Contar la cantidad de palabras del texto
    Mostrar cual es el primer u ultimo caracter del texto
    Como se veria el texto si se invirtieran las palabras de este
    Mostrar si en el texto esta la palabra "Java"
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recibir texto
        System.out.println("Ingrese el texto a analizar");
        String inputTexto = scanner.nextLine();

        //Cuantas letras se van a buscar
        String[] letras = new String[2];
        int[] countLetras = new int[letras.length];

        System.out.println("Ingrese " + letras.length + " caracteres a analizar dentro del texto");
        //Pedir letras al usuario

        boolean charInvalido;
        //if there is a god is fking me!!!
        //Input de caracteres
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Ingresa caracter");
            do {
                charInvalido = true;
                letras[i] = scanner.nextLine();
                if (letras[i].length() > 1) {
                    System.out.println("Ingresaste mas de un caracter, Solo debes ingresar 1");
                    charInvalido = false;
                }
            } while (!charInvalido);
        }

        //Llenar contadores
        //if there is a god is fking me!!!
        for (int i = 0; i < inputTexto.toCharArray().length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (String.valueOf(inputTexto.toCharArray()[i]).equalsIgnoreCase(letras[j])) {
                    countLetras[j]++;
                }
            }
        }
        StringBuilder instanciasLetras = new StringBuilder();
        for (int i = 0; i < countLetras.length; i++) {
            instanciasLetras.append("Hay ").append(countLetras[i]).append(" instancias de la letra ").append(letras[i]).append("\n");
        }
        System.out.println(instanciasLetras);


        //Contar palabras
        System.out.println("Hay " + inputTexto.split(" ").length + " palabras en este texto\n");

        //Primer y ultimo caracter
        System.out.println("La letra \"" + inputTexto.toCharArray()[0] + "\" es el primer caracter del texto y \"" + inputTexto.toCharArray()[inputTexto.toCharArray().length - 1] + "\" es el ultimo caracter del texto \n");

        //Texto Invertido
        int maxTexto = inputTexto.split(" ").length;
        StringBuilder textoInvertido = new StringBuilder();
        textoInvertido.append("Como se veria el texto con las palabras invertidas?").append("\n");
        while (maxTexto > 0) {
            textoInvertido.append(inputTexto.split(" ")[maxTexto - 1]).append(" ");
            maxTexto--;
        }
        System.out.println(textoInvertido + "\n");

        //Verficar si la palabra java se encuentra dentro de este texto
        if (inputTexto.contains("Java")) {
            System.out.println("La palabra \"Java\" esta dentro de este texto");
        }
    }
}
