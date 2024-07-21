package java_8Lambdas;

public class EjmploInterfaceFunctional {
    public static void main(String[] args) {
        //implemetacion de interfaz fuincional
        Aritmetica suma=(a,b)-> a+b;
        Aritmetica resta=(a,b)-> a-b;

        Calculadora cal= new Calculadora();
        //uso de la clase creada q usa la implementacion de la interfaz
        System.out.println(cal.computar(10,2,resta));
        System.out.println(cal.computar(10,2,suma));

    }
}
