package Streams;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamInfinito {
    public static void main(String[] args) {
//        .generate es un metodo que genera un stream infinito al cual con el metodo limit puedes restringir un limite
//        toma por parametro un supplier (una lambda q no toma parametro y retorna un generic del tipo que se le haya pasado)
        AtomicInteger count = new AtomicInteger(0);
        Stream.generate(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return count.incrementAndGet();
        })
                .limit(20).
                forEach(System.out::println);
    }
}
