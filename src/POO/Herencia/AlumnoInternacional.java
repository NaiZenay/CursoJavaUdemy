package POO.Herencia;

public class AlumnoInternacional extends Alumno {
    public AlumnoInternacional(String pais) {
        //Llama al constructor padre (debe ser la primer linea en el constructor)
        super("Colegio internacional");
        this.pais = pais;
    }

    private String pais;
    private double notaIdiomas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    //API de reflexion de java
    public void detalleHerencia() {
        Class alumnoIternacionalClass = this.getClass();
        while (alumnoIternacionalClass.getSuperclass() != null) {
            String padre = alumnoIternacionalClass.getSuperclass().getName();
            String hija = alumnoIternacionalClass.getName();
            System.out.println("La clase "+ hija+ " es hija de la clase "+padre);
            alumnoIternacionalClass=alumnoIternacionalClass.getSuperclass();
        }

    }
    //Metodo sobrescrito de la clase padre alumno

    @Override
    public void saludar() {
        super.saludar();
        System.out.print(" soy de "+pais+"\n");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }

    @Override
    public void calcularPromedio() {
        promedio=(getCalificacionFisica()+getCalificacionHistoria()+getCalificacionMatematicas()+getNotaIdiomas())/4;
    }
}
