package POO.Herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("ColegioX");
        alumno.setNombre("Julian");
        alumno.setApellido("Luna");
        alumno.email="julian.luna123@gmail.com";//al ser protected el atributo es accesible por clases hijas sin problemas
        alumno.setCalificacionMatematicas(9.8);
        alumno.setCalificacionFisica(10.0);
        alumno.setCalificacionHistoria(6.8);

        AlumnoInternacional alumnoInternacional= new AlumnoInternacional("Alemania");
        alumnoInternacional.setNombre("Hanz");
        alumnoInternacional.setApellido("Wolf");
        alumnoInternacional.email="hanz.wolf765@gmail.com";
        alumnoInternacional.setCalificacionFisica(8.8);
        alumnoInternacional.setCalificacionHistoria(10);
        alumnoInternacional.setCalificacionMatematicas(7.6);
        alumnoInternacional.setNotaIdiomas(9.0);


        Profesor profesor = new Profesor();
        profesor.setNombre("Ricardo");
        profesor.setApellido("Lopez");
        profesor.email="rochard.lopez098@gmail.com";
        profesor.setAsignatura(Asignaturas.MATEMATICAS);

        Persona profesor2=new Profesor();
        //Solo puede acceder a los metodos de Persona
        profesor2.setNombre("Brayan");
        profesor2.setEdad(30);
        //Cast de tipo profesor para poder acceder al metodo de la clase
        ((Profesor)profesor2).setAsignatura(Asignaturas.HISTORIA);

    }
}
