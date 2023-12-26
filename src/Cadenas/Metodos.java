package Cadenas;

public class Metodos {
    public static void main(String[] args) {
        String nombre = "Ian";

        //Length calcula la cnatidad de caracteres del string
        System.out.println(nombre.length());//retorna un entero

        //Convierte en mayusculas y minusculas
        System.out.println(nombre.toLowerCase());//retorna una cadena
        System.out.println(nombre.toUpperCase());//retorna una cadena

        //Comparacion de cadenas por valor (case sensitive)
        System.out.println(nombre.equals("ian"));//retorna un booleano

        //Comparacion de cadenas por valor no case sensitive
        System.out.println(nombre.equalsIgnoreCase("ian"));//retorna un booleano

        //Retorna un caracter segun el indice que se pasa por parametro (inicia en 0)
        System.out.println(nombre.charAt(0));//toma un int y retorna un char
        System.out.println(nombre.charAt(1));//toma un int y retorna un char
        System.out.println(nombre.charAt(2));//toma un int y retorna un char

        //Corta la cadena segun un indice
        System.out.println(nombre.substring(1));//El entero corta caracteres de izqueira a derecha

        String trabalenguas="anticonstitucionalidad";

        //Remplaza un caracter por otro
        System.out.println(trabalenguas.replace('a','-'));

        //Buscar caracteres
        System.out.println(trabalenguas.indexOf('a'));//devuelve la primera ocurrencia de la posicion del caracter
        System.out.println(trabalenguas.lastIndexOf('a'));//deculce la ultima ocurrecia del caracter
        System.out.println(trabalenguas.indexOf('z'));//si no se encuentra devuelve -1
        System.out.println(trabalenguas.contains("t"));//devuleve un boolean si se encontro la cadena del parametro
        System.out.println(trabalenguas.startsWith("a"));//devuleve un boolean si la cadena empieza con el char o string especificado en el parametro
        System.out.println(trabalenguas.endsWith("a"));//devuleve un boolean si la cadena termina con el char o string especificado en el parametro

        //Espacion en blanco
        System.out.println("  hi  ".trim());//elimina espacion en blanco a la izquierda y a la derecha de la cadena

        //convertir en un array
        trabalenguas.toCharArray();

        for(int i=0;i<trabalenguas.length();i++){
            System.out.print(trabalenguas.charAt(i));
        }

        System.out.println();

        //dividir un string en una arreglo de substrings
        String[] arr=trabalenguas.split("c");//cada c de la palabra de la cadaena sera marcado como un divisor para convertirlo en otra cadena
        for(int i=0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
