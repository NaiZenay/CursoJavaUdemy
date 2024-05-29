package Excepciones;

public class Calculadora {
    //Propaga la excepcion donde se llame este metodo
    public double dividir (int num1 , int num2) throws DivisionPorZeroException {
        if (num2==0){
            throw new DivisionPorZeroException("No se pueden dividir numero entre 0");
        }
        return num1/(double)num2;
    }
    public double dividir(String num1, String num2) throws FormatoException {
        int numero1;
        int numero2;
        try{
             numero1=Integer.parseInt(num1);
            numero2=Integer.parseInt(num2);
            return this.dividir(numero1,numero2);
        }catch (Exception fe){
            throw new FormatoException("error esto no es un numero");
        }
    }
}
