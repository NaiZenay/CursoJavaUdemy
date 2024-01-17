package Wrappers;

import FlujoDeControl.Bucles.For;

import java.sql.SQLOutput;

public class Integers {
    public static void main(String[] args) {
        Integer integer= new Integer(30);//deprecado
        Integer integeer= Integer.valueOf(32);//(boxing)
        Integer integeeer = 30;
        int num = integeeer.intValue();//Convierte un Integer a int
        int num2 = integeeer;//Hace lo de ^ por debajo (Unboxing)

        System.out.println(integer==integeeer);//false
        System.out.println(integer.equals(integeeer));//true

        //Autoboxing = convertir primitivo a objeto (automaticamente)
        //Unboxing = convertir objeto a primitivo


    }
}