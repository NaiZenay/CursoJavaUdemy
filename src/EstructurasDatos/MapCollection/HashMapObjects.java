package EstructurasDatos.MapCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapObjects {
    public static void main(String[] args) {
        Map<String,Object>persona= new java.util.HashMap<>();
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("edad","30");
        persona.put("correo","correo@correo.com");

        Map <String,String> direccion= new HashMap<>();
        direccion.put("pais","Mexico");
        direccion.put("Estado","Jalisco");
        direccion.put("Ciudad","GDL");
        direccion.put("Colonia","Atemajac");
        direccion.put("Calle","Aldama");

        persona.put("direccion",direccion);


        for (Map.Entry<String,Object> par: persona.entrySet()){
            System.out.println(par.getKey()+" ==> "+par.getValue());
        }

    }
}
