package Ejercicios;

import javax.swing.*;

public class MedidorTanqueGasolina {
    public static void main(String[] args) {
        String inputGas = JOptionPane.showInputDialog(null, "Ingrese la cantidad actual de su tanque de gas");
        double gas = Double.parseDouble(inputGas);
        String mensaje="";

        if(gas == 70){
            mensaje=("Tanque lleno");
        }else if (gas>=60 && gas<70){
            mensaje=("Tanque casi lleno");
        } else if (gas>=40 && gas<60 ){
            mensaje=("Tanque a 3/4 de capacidad");
        }else if (gas>=35 && gas<40 ){
            mensaje=("Tanque a media capacidad");
        }else if (gas>=20 && gas<35 ){
            mensaje=("Tanque con suficiente  capacidad");
        }else if (gas>=1 && gas<20 ){
            mensaje=("Tanque insuficiente");
        }else{
            mensaje="La cantidad ingresada no coincide con la capacidad del tanque de gas";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

