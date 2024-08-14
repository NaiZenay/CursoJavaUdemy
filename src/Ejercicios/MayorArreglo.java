package Ejercicios;

import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MayorArreglo {
    public static void main(String[] args) {
        int[] nums=new int[5];
        int mayor=0;
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();

        }
//        for (int i = 1; i < nums.length; i++) {
//            mayor=(nums[mayor]>nums[i])?mayor:i;
//
//        }

//        System.out.println(nums[mayor]);

        //calculo del numero mas grande de un arrglo utilizando el API stream y summaryStatistics
        IntStream is=IntStream.of(nums);
        IntSummaryStatistics iss=is.summaryStatistics();
        System.out.println(iss.getMax());

    }
}
