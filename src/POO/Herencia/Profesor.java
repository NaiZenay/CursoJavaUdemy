package POO.Herencia;

public class Profesor extends Persona {
    private Asignaturas asignatura;

    public Asignaturas getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }
    //Metodo sobrescrito de la clase padre persona

    @Override
    public void saludar() {
        super.saludar();
        System.out.println(" soy profesor de " + asignatura + " mi nombre es " + getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nasignatura=" + asignatura;
    }
}
