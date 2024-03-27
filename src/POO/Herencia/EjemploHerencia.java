package POO.Herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("ColegioX");
        alumno.setNombre("Julian");
        alumno.setApellido("Luna");
        alumno.email = "julian.luna123@gmail.com";//al ser protected el atributo es accesible por clases hijas sin problemas
        alumno.setCalificacionMatematicas(9.8);
        alumno.setCalificacionFisica(10.0);
        alumno.setCalificacionHistoria(6.8);
//        imprimir(alumno);
        alumno.calcularPromedio();
        System.out.println(alumno.getPromedio());
        alumno.saludar();

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Alemania");
        alumnoInternacional.setNombre("Hanz");
        alumnoInternacional.setApellido("Wolf");
        alumnoInternacional.email = "hanz.wolf765@gmail.com";
        alumnoInternacional.setCalificacionFisica(8.8);
        alumnoInternacional.setCalificacionHistoria(10);
        alumnoInternacional.setCalificacionMatematicas(7.6);
        alumnoInternacional.setNotaIdiomas(9.0);
        alumnoInternacional.saludar();
        alumnoInternacional.calcularPromedio();
        System.out.println(alumnoInternacional.getPromedio());


        Profesor profesor = new Profesor();
        profesor.setNombre("Ricardo");
        profesor.setApellido("Lopez");
        profesor.email = "rochard.lopez098@gmail.com";
        profesor.setAsignatura(Asignaturas.MATEMATICAS);
        profesor.saludar();

        Persona profesor2 = new Profesor();
        //Solo puede acceder a los metodos de Persona
        profesor2.setNombre("Brayan");
        profesor2.setEdad(30);
        //Cast de tipo profesor para poder acceder al metodo de la clase
        ((Profesor) profesor2).setAsignatura(Asignaturas.HISTORIA);

    }

    public static void imprimir(Persona persona) {
        System.out.println("nombre: " + persona.getNombre() + "\n" +
                "apellido: " + persona.getApellido() + "\n" +
                "edad: " + persona.getEdad() + "\n" +
                "email: " + persona.email);

        if (persona instanceof Alumno) {
            System.out.println("Colegio: " + (((Alumno) persona).getColegio()) + "\n" +
                    "promedio:" + (((Alumno) persona).getPromedio()) + "\n" +
                    "calificacion de Historia:" + (((Alumno) persona).getCalificacionHistoria()) + "\n" +
                    "calificacion de Matematicas:" + (((Alumno) persona).getCalificacionMatematicas()) + "\n" +
                    "calificacion de Fisica:" + (((Alumno) persona).getCalificacionFisica()) + "\n"
            );
            if (persona instanceof AlumnoInternacional) {
                System.out.println("pais: " + ((AlumnoInternacional) persona).getPais() + "\n" +
                        "calificacion de idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
            }
        } else if (persona instanceof Profesor) {
            System.out.println("asignatura: " + ((Profesor) persona).getAsignatura());

        }
    }
}
