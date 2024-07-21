package java_8Lambdas;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    //Rules:
    /*
    - Cuando solo hay un parametro en la expresion se pueden omitir los parentesis
    - Cuando solo hay un alinea de codigo de ejecucion se pueden omitir las llaves
    -
     */
    public static void main(String[] args) {
        //Una expresion lambda se puede traducir como la implementacion de una interfaz funcional
        //o como una funcion anonima ya que no es invocable desde otra parte
        Consumer<String> consumidor= System.out::println;
        consumidor.accept("jaja salu2");


        BiConsumer<String , Date> bconsumer = (saludo,fecha) ->{
            SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd HH:mm");
            System.out.println(saludo+" en "+ f.format(fecha));
        };
        bconsumer.accept("jaja salu2",new Date());

        List<String> nombres= Arrays.asList("x","y","z");
        //Metodo de referencia
        //al tener solo una invocacion del elemento este tmb se puede omitir
        nombres.forEach(System.out::println);
        nombres.forEach((nombre)->{
            System.out.print(nombre.toUpperCase()+' ');
        });
    }
}
