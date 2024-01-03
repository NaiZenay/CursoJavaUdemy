package Ejercicios;

import javax.swing.*;

public class MedidorTanqueGasolina {
    /*
    Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo decimal, para una mejor precisión.
Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente
     */
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

