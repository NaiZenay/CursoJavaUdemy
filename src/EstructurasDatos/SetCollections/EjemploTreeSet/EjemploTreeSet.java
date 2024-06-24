package EstructurasDatos.SetCollections.EjemploTreeSet;

import java.util.*;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<EstructurasDatos.ListCollection.Alumno> alumnos = new TreeSet<>();
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("María", 8.5f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Juan", 7.8f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Ana", 9.2f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Carlos", 6.9f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Lucía", 8.7f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Pedro", 7.3f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Laura", 9.0f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Sofía", 8.2f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Miguel", 7.5f));
        alumnos.add(new EstructurasDatos.ListCollection.Alumno("Elena", 8.8f));
        System.out.println(alumnos);
    }
}



