package Ejercicios;

import java.util.function.Function;

public class LambdaTrim {
    public static void main(String[] args) {
        Function<String,String> lambdatrim=(a)-> a.replace(" ", "").replace(".", "").replace(",","");
        String frase="Fames class blandit felis augue dictumst tincidunt nostra aenean venenatis leo fringilla, nisi sollicitudin viverra auctor in nascetur non fermentum vulputate vel hendrerit pretium, arcu scelerisque netus donec praesent ultricies fusce sociosqu tristique volutpat";
        System.out.println(lambdatrim.apply(frase));
    }
}