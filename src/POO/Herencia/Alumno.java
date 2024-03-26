package POO.Herencia;
//declaracion de la herencia de Persona
public class Alumno extends Persona{
    private double promedio;
    private String colegio;
    private double calificacionHistoria;
    private double calificacionMatematicas;
    private double calificacionFisica;

    public Alumno(String colegio) {
        this.colegio=colegio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getCalificacionHistoria() {
        return calificacionHistoria;
    }

    public void setCalificacionHistoria(double calificacionHistoria) {
        this.calificacionHistoria = calificacionHistoria;
    }

    public double getCalificacionMatematicas() {
        return calificacionMatematicas;
    }

    public void setCalificacionMatematicas(double calificacionMatematicas) {
        this.calificacionMatematicas = calificacionMatematicas;
    }

    public double getCalificacionFisica() {
        return calificacionFisica;
    }

    public void setCalificacionFisica(double calificacionFisica) {
        this.calificacionFisica = calificacionFisica;
    }
}
