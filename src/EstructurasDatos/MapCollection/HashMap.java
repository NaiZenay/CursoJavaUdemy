package EstructurasDatos.MapCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {
        //Estructura que gurda info llava,valor
        //<Tipo llave,Tipo valor>
        //utiliza un hashset por debajo
        Map<String,String>persona= new java.util.HashMap<>();
        //agrega un elemento (llave,valor)
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("edad","30");
        persona.put("correo","correo@correo.com");

        //Obtiene un elemento en base a la llave que tiene asiganda el valor
        String nombrePersona= persona.get("nombre");
        //elimina un elemento en base a la llave(retorna el elemento eliminado)
        persona.remove("edad");

        //booleano retorna si existe un elemento por llave o valor
        persona.containsKey("nombre");
        persona.containsValue("30");

        //retorna una coleccion con los valores del map
        Collection <String> valores= persona.values();
        for (String v:valores){
            System.out.println(v);
        }

        //retorna un set con las key del map
        Set<String> llaves= persona.keySet();
        for (String k:llaves){
            System.out.println(k);
        }

        System.out.println();
        //retorna un set con la llave y el valor del map
        for (Map.Entry<String,String> par: persona.entrySet()){
            System.out.println(par.getKey()+" ==> "+par.getValue());
        }

        persona.replace("correo","Doe@correo.com");

        for (Map.Entry<String,String> par: persona.entrySet()){
            System.out.println(par.getKey()+" ==> "+par.getValue());
        }
    }
}
