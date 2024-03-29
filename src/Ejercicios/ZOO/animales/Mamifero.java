package Ejercicios.ZOO.animales;

abstract public class Mamifero {
    protected  String habitat;
    protected float altura;
    protected float largo;
    protected String nombreCientifico;

    public Mamifero(String habitat, float altura, float largo, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
