package Ejercicios.ZOO.animales.felinos;

public class Leon extends Felino{

    private int numManada;
    private float potenciaRugidoDecibeles;

    public Leon(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El "+nombreCientifico+" caza junto a su manada de "+numManada+" individuos en "+habitat+" utilizando sus garras de "+tamnoGarras;
    }

    @Override
    public String dormir() {
        return "El "+nombreCientifico+" duerme en "+habitat+" junto a su manda";
    }

    @Override
    public String correr() {
        return "El "+nombreCientifico+ " corre a una velocidad de "+velocidad+"mididendo este aproximadamente "+largo+" de largo y "+altura+" de alto";
    }

    @Override
    public String comunicarse() {
        return "EL "+ nombreCientifico+ " es capaz de rugir a con una potencia de "+potenciaRugidoDecibeles+ "decibeles";
    }
}
