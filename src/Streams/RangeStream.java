package Streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeStream {
    public static void main(String[] args) {
        //Un stream exclusivo de enteros
        // maneja un rango de 5 a 20 incluye el punto inicial pero no el final
        IntStream num= IntStream.range(5,20).peek(System.out::println);

//        objeto con metodos para calcular estadisticas como el numero mas alto el mas bajo y el promedio
        IntSummaryStatistics stats= num.summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());

    }
}
