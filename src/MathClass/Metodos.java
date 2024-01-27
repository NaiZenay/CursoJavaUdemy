package MathClass;

public class Metodos {
    public static void main(String[] args) {
        //Calcular el valor absoluto de un numero
        int valorAbsoluto = Math.abs(-3);
        int num = 14;

        //PI
        double pi = Math.PI;

        //El valor mas grande de 2 numero acepta cualquier primitivo numerico
        Math.max(valorAbsoluto, num);

        //El valor mas pequeñó de 2 numero acepta cualquier primitivo numerico
        Math.min(valorAbsoluto, num);

        //redondea un valor hacia arriba
        Math.ceil(pi);

        //redondea un valor hacia abajo
        Math.floor(pi);

        //Logaritmo natural
        Math.log(10);

        //Potencias (base,exponente)
        Math.pow(2,3);

        //Raiz cuadrada
        Math.sqrt(4);

        //Conversion de radianes a grados
        Math.toDegrees(12.3);

        //Conversion de grados a radianes
        Math.toRadians(90);

        //Seno
        Math.sin(90);

        //Coseno
        Math.cos(90);

        //Numero aleatorio 1-10
        double random=Math.round((Math.random())*10);


    }
}
