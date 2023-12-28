package Operadores;

public class Relacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 12.3f;
        double l = 2.1234455d;
        boolean m = false;

        System.out.println(i == j);//comparaciom
        System.out.println(!m);//negacion de
        System.out.println(i != j);//distinto de
        System.out.println(i > j);//mayor que
        System.out.println(i < j);//menor que
        System.out.println(i >= j);//mayor o igual que
        System.out.println(i <= j);//meor o igual que

        //Jerarquia de operaciones
        /*
        | Operador | Significado |
        | ++,--,+,-,! | incremento,decremento,suma,resta,negacion |
        | () | parentesis |
        | *,/,% | Operaciones aritmeticas |
        | >,>=,<,<= intanceof | relacionales |
        | ==, != | comparacion,disntito de |
        | && | AND |
        | || | or |
        | ()?: | ternario |
        | +,+=,-=,*=,/=,%= | asignacion |
        */

    }
}
