package Operadores;

public class Aritemeticos {
    public static void main(String[] args) {

        int num=34;
        int num2=21;
        System.out.println(num+num2);//Suma
        System.out.println(num-num2);//Resta
        System.out.println(num*num2);//Nultiplicaion
        System.out.println(num/num2);//Division
        System.out.println(num%num2);//Resto o modulo

        System.out.println("A"+"B");//concatenacion

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
