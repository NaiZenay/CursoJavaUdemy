package Operadores;

public class incrementales {
    public static void main(String[] args) {
        int i=0;
        int j= ++i;//PreIncremeto previo a la asignacion de valor la variable
        j= --i;//PreDecremeto previo a la asignacion de valor la variable
        j= i++;//PostIncremeto Despues de la asignacion de valor la variable
        j= i--;//PostDencremeto Despues de la asignacion de valor la variable

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

