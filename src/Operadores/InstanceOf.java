package Operadores;

import java.util.Scanner;

public class InstanceOf {
    public static void main(String[] args) {
        Integer num = 10;
        short number=10;
        String  str= "Cadena de Java";
        Scanner scan = new Scanner(System.in);

        /*
        instanceOf es un operador que devuelve un boolean evaluando si una variable es una instancia de un objeto
        */


        System.out.println(num instanceof Integer);//num es una instancia del Objeto Integer
        System.out.println(str instanceof  String);//str es una instancia del Objeto String
        System.out.println(scan instanceof Scanner);//scan es una instancia del Objeto Scanner

    }
}
