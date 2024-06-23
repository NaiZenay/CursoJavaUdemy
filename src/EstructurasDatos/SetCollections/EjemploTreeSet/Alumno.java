package EstructurasDatos.SetCollections.EjemploTreeSet;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Float promedio;

    public Alumno(String nombre, Float promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public int compareTo(Alumno a) {
        return a.promedio.compareTo(promedio);
    }

    @Override
    public String toString() {
        return nombre+" "+promedio+ " ";
    }
}
