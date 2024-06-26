package EstructurasDatos.MapCollection;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        //igual a un HasMap pero ordenado
        Map<String,Object> personas= new java.util.TreeMap<>();
        personas.put("nombre","John");
        personas.put("apellido","Doe");
        personas.put("edad","30");
        personas.put("correo","correo@correo.com");

        System.out.println(personas);
    }
}
