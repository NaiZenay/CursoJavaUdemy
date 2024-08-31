package Anotaciones;

import Anotaciones.modelos.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Procesador {

    static public void inicializarOBjeto(Object object) {
        if (object == null) {
            throw new JsonSerializadorException("El objeto a procesar es nullo");
        }
        Method[] metodos = object.getClass().getDeclaredMethods(); //array de los metodos de la clase
        Arrays.stream(metodos).filter(method -> method.isAnnotationPresent(Init.class)).forEach(method -> {
            method.setAccessible(true);
            try {
                method.invoke(object);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JsonSerializadorException("No se pudo invocar el metodo");
            }
        });

    }

    public static String convertirJSON(Object object) {
        if (object == null) {
            throw new JsonSerializadorException("El objeto a procesar es nullo");
        }
        inicializarOBjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields(); //array de campos de la clase

        return Arrays.stream(atributos).filter(f -> f.isAnnotationPresent(JsonAtributo.class)).map(f -> {//filtracion de todos los campos con la anotacion creda
            f.setAccessible(true);//cambiamos el ripo de encapsulamiento del atributo
            String nombre = f.getAnnotation(JsonAtributo.class)//retorna el tipo de clase del atributo con la anotacion
                    .nombre().equals("") ? //si el campo no tiene un nombre asignado
                    String.valueOf(f.getName().charAt(0)).toUpperCase() + f.getName().substring(1) :    //pasamos el nombre del campo
                    f.getAnnotation(JsonAtributo.class).nombre();   //o el nombre dado en la anotacion
            try {
                Object valor = f.get(object);
                if (f.getAnnotation(JsonAtributo.class).capitalizar() &&
                        valor instanceof String) {


                    String nuevoValor = (String) valor;
                    nuevoValor = Arrays.stream(nuevoValor.split(" "))
                            .map(palabra -> String.valueOf(palabra.charAt(0)).toUpperCase() + palabra.substring(1))
                            .collect(Collectors.joining(" "));
                    f.set(object, nuevoValor);


                }
                return "\"" + nombre + "\":\"" + f.get(object) + "\"";//estructura de jason
            } catch (IllegalAccessException e) {//excepcion en caso de q el atributo no enga los permisos requeridos
                throw new RuntimeException("Erro al serealizar JSON" + e.getMessage());
            }
        }).reduce("{", (a, b) -> { //si es el inicio del json
            if ("{".equals(a)) {
                return a + b;
            }
            return a + ",\n" + b;   //concatenar campos con su valor
        }).concat("\n}");   //cierre del json
    }
}
