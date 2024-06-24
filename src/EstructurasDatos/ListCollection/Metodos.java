package EstructurasDatos.ListCollection;

import java.util.ArrayList;
import java.util.List;

public class Metodos {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno=new Alumno("Carlos", 6.9f);
        alumnos.add(new Alumno("María", 8.5f));
        alumnos.add(new Alumno("Juan", 7.8f));
        alumnos.add(new Alumno("Ana", 9.2f));
        alumnos.add(alumno);
        alumnos.add(new Alumno("Lucía", 8.7f));
        alumnos.add(new Alumno("Pedro", 7.3f));
        alumnos.add(new Alumno("Laura", 9.0f));
        alumnos.add(new Alumno("Sofía", 8.2f));
        alumnos.add(new Alumno("Miguel", 7.5f));
        alumnos.add(new Alumno("Elena", 8.8f));

        //Cantidad de elemntos de la lista
        alumnos.size();
        //Si la lista esta vacia
        alumnos.isEmpty();
        //Inserta un elemento nuevo en la lista con un indice especifico
        alumnos.add(2, (new Alumno("Lucía", 8.7f)));
        //Modifica el elemento de la lista con un indice especifico
        alumnos.set(2, (new Alumno("Lucía", 8.7f)));
        //Eliminar un elemento
        alumnos.remove(alumno);
        //Eliminar un elemento por indice
        alumnos.remove(4);
        //Retorna si existe un elemento dentro de la lista
        alumnos.contains(alumno);

        //Convertir una lista a un array del tipo object
        Object[] alumnos2 = alumnos.toArray();

        System.out.println(alumnos);
    }
}
