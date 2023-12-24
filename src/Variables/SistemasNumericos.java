package Variables;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cualquier numero entero");
        int numeroDecimal=0;
        try{
            //Lee la entrada de datos numerica en la terminal
            numeroDecimal= scanner.nextInt();

            //Excepcion en caso de que el dato ingresado no sea un numero
        }catch (InputMismatchException ime){
            System.out.println("Numero invalido");
            //Finaliza programa
            System.exit(0);
        }
        String resultado=
//Metodo para convertir un numero decimal a Binario
                "Numero Binario de "+numeroDecimal+"="+Integer.toBinaryString(numeroDecimal)+"\n"+
//Metodo para convertir un numero decimal a Octal
                "Numero Octal de "+numeroDecimal+"="+Integer.toOctalString(numeroDecimal)+"\n"+
//Metodo para convertir un numero decimal a Hexadecimal
                "Numero Hexadecimal de "+numeroDecimal+"="+Integer.toHexString(numeroDecimal);
        System.out.println(resultado);
    }

    //Declaracion de sistemas numericos en enteros
    //0b para declarar un numero binario
    int numeroBinario=0b0101010;
    //0 para declara un numero octal
    int numeroOctal=01252;
    //0x para declarar un numero hexadecimal numero Hexadecimal
    int numeroHexadecimal=0x1f42;
}
