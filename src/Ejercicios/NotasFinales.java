package Ejercicios;

import java.util.Scanner;

public class NotasFinales {
    public static void main(String[] args) {
        /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas . Mostrar el promedio de las notas mayores a 8, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
         */
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double promedionotasMayores8 = 0;
        double promedionotasMenores4 = 0;
        double promedioTotal = 0;
        int notasCon1 = 0;
        int countNotasMenores4 = 0;
        int countNotasMayores8 = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa la nota final del alumno (1-10)");
            notas[i] = scanner.nextDouble();
            promedioTotal += notas[i];

            if (notas[i] > 8) {
                countNotasMayores8++;
                promedionotasMayores8 += notas[i];
            } else if (notas[i] == 1) {
                notasCon1++;
                countNotasMenores4++;
                promedionotasMenores4 += notas[i];

            }else if (notas[i] < 4) {
                countNotasMenores4++;
                promedionotasMenores4 += notas[i];
            }
        }
        promedionotasMayores8 /=countNotasMayores8;
        promedionotasMenores4 /=countNotasMenores4;
        promedioTotal/=notas.length;
        System.out.println("Promedio final total de los alumnos: "+promedioTotal+"\n"+
                "Promedio final de las notas de los alumnos mayores a 8 es de "+promedionotasMayores8+"\n"+
                "Promedio final de las notas de los alumnos menores a 4 es de "+promedionotasMenores4+"\n"+
                "Hubo un total de "+notasCon1+ " alumnos que sacaron de nota final con un 1"
        );

    }
}
