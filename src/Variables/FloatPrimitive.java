package Variables;

public class FloatPrimitive {
    public static void main(String[] args) {
        float realFloat=1.0f;//Especificar float con una "f" minuscula
        float realFloat1=2.3e4f;//Numero flotante con notación cientifica (e)uso de notacion (4) decimales que se recorre
        System.out.println(realFloat1);

        System.out.println("Tamaño:");
        System.out.println("En bytes de un float:"+Float.BYTES);
        System.out.println("En bits de un float:"+Float.SIZE);
        System.out.println("Maximo de un float:"+Float.MAX_VALUE);
        System.out.println("Minimo de un float:"+Float.MIN_VALUE);

        double doble=3.4028235E38;
        System.out.println("Tamaño:");
        System.out.println("En bytes de un double:"+Double.BYTES);
        System.out.println("En bits de un double:"+Double.SIZE);
        System.out.println("Maximo de un double:"+Double.MAX_VALUE);
        System.out.println("Minimo de un souble:"+Double.MIN_VALUE);

        //Var como float
        var varFloat=2.1416d;//Especificar con la "d" o la "f" para el tipo de dato
        System.out.println(varFloat);


    }
}
