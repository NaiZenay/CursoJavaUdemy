package Variables;
import javax.swing.*;
public class SistemasNumericos {
    public static void main(String[] args) {
      String inputNumero= JOptionPane.showInputDialog(null,"Ingreesa un numero Decimal");
      int numeroDecimal=Integer.parseInt(inputNumero);
      String resultado=
//Metodo para convertir un numero decimal a Binario
                "Numero Binario de "+numeroDecimal+"="+Integer.toBinaryString(numeroDecimal)+"\n"+
//Metodo para convertir un numero decimal a Octal
                "Numero Octal de "+numeroDecimal+"="+Integer.toOctalString(numeroDecimal)+"\n"+
//Metodo para convertir un numero decimal a Hexadecimal
                "Numero Hexadecimal de "+numeroDecimal+"="+Integer.toHexString(numeroDecimal);

      JOptionPane.showMessageDialog(null,resultado);
    }

    //Declaracion de sistemas numericos en enteros
    //0b para declarar un numero binario
    int numeroBinario=0b0101010;
    //0 para declara un numero octal
    int numeroOctal=01252;
    //0x para declarar un numero hexadecimal numero Hexadecimal
    int numeroHexadecimal=0x1f42;
}
