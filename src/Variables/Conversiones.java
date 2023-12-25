package Variables;

public class Conversiones {
    public static void main(String[] args) {
//        String a Primitivos
        String numeroStr="10";
    int numero=Integer.parseInt(numeroStr);

        String doubleStr="2347.12";
    double numeroDecimal=Double.parseDouble(doubleStr);

        String logicoStr="false";
    boolean logico=Boolean.parseBoolean(logicoStr);


//    Primitivo a String
        int numeroNum=10;
//        Formas diferentes de convertir un primitivo a un cadena
        String numeroCadena=Integer.toString(numeroNum);//Metodo del Objeto del primitivo
        String numeroCadena2=String.valueOf(numeroNum);//Metodo del Objeto string

//        Conversion entre primitivos
        int otroNum=(short)1234567;//Cast de un int a short (Forza a valor a ser guardado como short en vez de un int)
//      Un short es incapaz de almacenar un int ya que el int tien mayor capacidad de memoria
//        short s =otroNum;

        short s=(byte)123;//Cast de short a byte


    }
}
