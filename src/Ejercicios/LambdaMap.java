package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/*
Para la tarea se pide como requerimiento escribir una expresión lambda que cuenta la cantidad de veces que se repiten
las palabras de una frase y devuelva la mas repetida, según lo siguiente:

La expresión lambda debe recibir por argumento una frase u oración y devolver un objeto Map que contenga la palabra
mas repetida de la frase como llave y la cantidad de veces que se repite como valor.
 */
public class LambdaMap {
    public static void main(String[] args) {
        String frase2 = "Tres tristes tigres tragaban trigo en un trigal.En un trigal tragaban trigo tres tristes tigres. Tres tristes tigres en un trigal tragaban trigo.Tragaban trigo tres tristes tigres en un trigal.";

        Function<String, Map<Integer, String>> palabraMasRepetida = (fraseParam) -> {
            Map<Integer, String> resultado = new HashMap<>();

            String[] fraseDividida = fraseParam.replace(",", "").replace(".", "").split(" ");
            String palabraRepetida = null;
            int masRepetida = 0;

            for (String palabra : fraseDividida) {
                int contadorPorPalabra = 0;
                for (String palabraComparada : fraseDividida) {
                    if (palabra.equalsIgnoreCase(palabraComparada)) {
                        contadorPorPalabra++;
                    }
                    if (contadorPorPalabra > masRepetida) {
                        palabraRepetida = palabra;
                        masRepetida = contadorPorPalabra;
                    }
                }
            }
            resultado.put(masRepetida, palabraRepetida);
            return resultado;
        };

        System.out.println(palabraMasRepetida.apply(frase2));

    }
}
