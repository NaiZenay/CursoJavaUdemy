package Ejercicios.ZOO.resources.animales.felinos;

public class Leon extends Felino{

    private int numManada;
    private float potenciaRugidoDecibeles;

    public Leon(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
