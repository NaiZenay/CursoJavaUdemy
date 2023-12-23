package Variables;

public class Caracteres {

    public static void main(String[] args) {
        //Aceptan solo un caracter
        char caractrer = 'a';
        //acepta codigo de la tabla unicode
        char caracterUNICODE = '\u0040';
        //Acepta tambien el numero en la tabla como valor
        char decimal = 64;
        System.out.println("caracter: " + caractrer);
        System.out.println("caracter Unicode: " + caracterUNICODE);
        System.out.println("caracter decimal: " + decimal);

        //clase correspondionte a char
        System.out.println("char correponde en byte"+Character.BYTES);
        System.out.println("char correponde en bites"+Character.SIZE);
        System.out.println("char valor minimo"+Character.MIN_VALUE);
        System.out.println("char valor maximo"+Character.MAX_VALUE);

    }
}

