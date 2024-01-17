package Wrappers;

public class Booleans {
    public static void main(String[] args) {
        int num1=1,num2 =2;

        boolean primitivoBoolean= num1>num2;
        Boolean objetoBoolean= Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2= Boolean.valueOf("false");

        System.out.println(objetoBoolean==objetoBoolean2);//iguales
        

    }
}
