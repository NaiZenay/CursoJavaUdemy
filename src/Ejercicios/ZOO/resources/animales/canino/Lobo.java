package Ejercicios.ZOO.resources.animales.canino;

public class Lobo extends Canino{
    private int numCamanada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, String nombreCientifico, String color, String tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
