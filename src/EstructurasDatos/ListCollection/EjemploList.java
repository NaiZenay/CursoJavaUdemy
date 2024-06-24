package EstructurasDatos.ListCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("María", 8.5f));
        alumnos.add(new Alumno("Juan", 7.8f));
        alumnos.add(new Alumno("Ana", 9.2f));
        alumnos.add(new Alumno("Carlos", 6.9f));
        alumnos.add(new Alumno("Lucía", 8.7f));
        alumnos.add(new Alumno("Pedro", 7.3f));
        alumnos.add(new Alumno("Laura", 9.0f));
        alumnos.add(new Alumno("Sofía", 8.2f));
        alumnos.add(new Alumno("Miguel", 7.5f));
        alumnos.add(new Alumno("Elena", 8.8f));

        //Formas de ordenar la lista
//        Collections.sort(alumnos);
        alumnos.sort(Alumno::compareTo);
        alumnos.sort(Comparator.comparing(Alumno::getNombre));//==(Alumno a)->a.getNombre()
        System.out.println(alumnos);
    }
}
