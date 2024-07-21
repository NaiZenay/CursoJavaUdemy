package java_8Lambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        //siempre retorna un boolean
        Predicate<Integer> test= num->num<10;
        boolean a= test.test(32);

        Predicate<String> test2= (role) -> role.equalsIgnoreCase("admin");
        boolean b=test2.test("ADMIN");


        BiPredicate<String,String> test3=(x,y)->x.equalsIgnoreCase(y);

    }
}
