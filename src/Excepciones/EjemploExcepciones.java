package Excepciones;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        String valor= JOptionPane.showInputDialog("Ingrese un numero entero");
        int divisor;
        try {
            divisor=Integer.parseInt(valor);
            double division = calc.dividir(10,divisor);
            System.out.println("division = " + division);//ArithmeticException Excepcion Unchecked(RunTimeExcetion)
        }catch (NumberFormatException nfe){
            System.out.println("El valor ingresado no es un numero");
        }
        catch (DivisionPorZeroException d){
            System.out.println(d.getMessage());
        }

    }
}
