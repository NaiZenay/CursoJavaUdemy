package ClassOptional;

import java.util.Optional;

public class EjemploOptional {

    /*
    Se puede usar como un contenedor para un objeto que puede o no estar presente.
    Su uso es ideal cuando una función puede devolver un resultado que podría ser nulo,
    y quieres que ese posible valor ausente sea manejado explícitamente.
     */
    public static void main(String[] args) {
        String nombre ="ANDRES";
        Optional<String>opt= Optional.of(nombre);//crea un optional con el valor dado en el genric <> no acepta null

        //similar a un if pero con proagramacion funcional toma un consumer de parametro
        opt.ifPresent(valor -> {
            System.out.println("Hola "+ valor);
        });

        nombre=null;
        opt= Optional.ofNullable(nombre);//crea un optinal q acepta un calor nullo o nonullo


        Optional opt2=Optional.empty();//crea un if vacio q no contiene nigun valor

        //otros metodos
        boolean esta= opt.isPresent();
        boolean noEsta= opt.isEmpty();
        System.out.println(opt2.get());//obtiene el objeto anidado dentro


    }
}
