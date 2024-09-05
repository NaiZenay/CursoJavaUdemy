package Ejercicios;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

/*
Obtener el numero mayor en un arreglo con programación funcional lambda y api stream
 */

public class NumeroMayoArrayStream {
    public static void main(String[] args) {
        Random r= new Random();
        List<Integer> RandomNums = new ArrayList<>();
        int RandomNumsLength= r.nextInt(10,30);
        for (int i=0;i<RandomNumsLength;i++) {
            RandomNums.add(r.nextInt());
        }
        RandomNums.forEach(System.out::println);
        IntSummaryStatistics results=RandomNums.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Numero mas grande:"+results.getMax());

    }
}
