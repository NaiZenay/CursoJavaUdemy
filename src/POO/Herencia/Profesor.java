package POO.Herencia;

public class Profesor extends Persona{
    private Asignaturas asignatura;

    public Asignaturas getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }
}
