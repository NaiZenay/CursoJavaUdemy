package EstructurasDatos.SetCollections.EjemploTreeSet;

import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<Alumno> alumnos = new TreeSet<>();
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
        System.out.println(alumnos);
    }
}
