package Operadores;

public class Logicos {
    public static void main(String[] args) {
        int i =10;
        int j = 12;
        int k =5;
        boolean b= (j > i) && (k < i); //AND (&&) revisa que toda la expresion sea verdadera
        boolean b2= (j > i) || (k < i); //OR (||) revisa que al menos una codicon se cumpla para que la expresion sea verdera

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
