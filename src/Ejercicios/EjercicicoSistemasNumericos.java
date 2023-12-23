package Variables;

import javax.swing.*;

public class EjercicicoSistemasNumericos {
    public static void main(String[] args) {
        boolean numeroValido;
        int numeroDecimal=0;
        do{
            numeroValido=true;
            String inputNumeroDecimal= JOptionPane.showInputDialog(null,"INGRESE UN NUMERO ENTERO");
            try{
                numeroDecimal = Integer.parseInt(inputNumeroDecimal);
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"INGRESA UN NUMERO VALIDO");
                numeroValido=false;
            }
        }while(numeroValido==false);
        String resultado="Numero Binario de "+numeroDecimal+"="+Integer.toBinaryString(numeroDecimal)+"\n"+
                "Numero Octal de "+numeroDecimal+"="+Integer.toOctalString(numeroDecimal)+"\n"+
                "Numero Hexadecimal de "+numeroDecimal+"="+Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null,resultado);
    }
}
