package Operadores;

public class Ternario {
    public static void main(String[] args) {
        int i =10;
        int j =20;
        boolean b1= i<j;
        System.out.println(b1?"aprobado":"reprobado");
                        //if(condicion)?, true : false

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
