package POO.Herencia;

public class AlumnoInternacional extends Alumno{
    public AlumnoInternacional(String pais){
        //Llama al constructor padre (debe ser la primer linea en el constructor)
        super("Colegio internacional");
        this.pais=pais;
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
}
