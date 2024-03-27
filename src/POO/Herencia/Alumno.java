package POO.Herencia;
//declaracion de la herencia de Persona
public class Alumno extends Persona{
    protected double promedio;
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

    public void calcularPromedio(){
        promedio=(calificacionFisica+calificacionHistoria+calificacionMatematicas)/3;
    }

    //Metodo sobrescrito de la clase padre persona
    @Override
    public void saludar() {
        //Manda a llamar al metodo de la clase padre y luego ejecuta la version de la clase hija
        super.saludar();
        System.out.print(" soy alumno de "+colegio+ " mi nombre es "+getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+"\npromedio=" + promedio +
                ", colegio='" + colegio + '\'' +
                ", calificacionHistoria=" + calificacionHistoria +
                ", calificacionMatematicas=" + calificacionMatematicas +
                ", calificacionFisica=" + calificacionFisica;
    }
}
