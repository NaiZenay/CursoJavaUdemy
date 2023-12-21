package Variables;

public class Numeric {
    public static void main(String[] args) {
        byte numByte=127;
        System.out.println("Bytes de un byte:"+Byte.BYTES);
        System.out.println("Bits de un byte:"+Byte.SIZE);
        System.out.println("Valor Maximo byte:"+Byte.MAX_VALUE);
        System.out.println("Valor Minimo de un byte:"+Byte.MIN_VALUE);
        System.out.println("=====================");
        short numShort=32766;
        System.out.println("Bytes de un short:"+Short.BYTES);
        System.out.println("Bits de un short:"+Short.SIZE);
        System.out.println("Valor maximo de un short:"+Short.MAX_VALUE);
        System.out.println("Valor minimo de un short:"+Short.MIN_VALUE);
        System.out.println("=====================");
        int numInt=2147483647;
        System.out.println("Bytes de un int:"+Integer.BYTES);
        System.out.println("Bits de un int:"+Integer.SIZE);
        System.out.println("Valor maximo de un int:"+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int:"+Integer.MIN_VALUE);
        System.out.println("=====================");
        long numLong=9223372036854775807L;//Señalar un long con una "L" Mayus para diferenciar
        System.out.println("Bytes de un long:"+Long.BYTES);
        System.out.println("Bits de un long:"+Long.SIZE);
        System.out.println("Valor maximo de un long:"+Long.MAX_VALUE);
        System.out.println("Valor minimo de un long:"+Long.MIN_VALUE);

        //variable flexible y dinamica
        var numVar=127;//Por default es un entero(int)

    }
}
