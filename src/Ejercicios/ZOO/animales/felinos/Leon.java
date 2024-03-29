package Ejercicios.ZOO.animales.felinos;

public class Leon extends Felino{

    private int numManada;
    private float potenciaRugidoDecibeles;

    public Leon(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
    }

    public Leon(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad, int numManada, float potenciaRugidoDecibeles) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibeles = potenciaRugidoDecibeles;
    }

    @Override
    public String comer() {
        return "El "+nombreCientifico+" caza junto a su manada de "+numManada+" individuos en "+habitat+" utilizando sus garras de "+tamnoGarras+" pulgadas";
    }

    @Override
    public String dormir() {
        return "El "+nombreCientifico+" duerme en "+habitat+" junto a su manda";
    }

    @Override
    public String correr() {
        return "El "+nombreCientifico+ " corre a una velocidad de "+velocidad+"km/h mididendo este aproximadamente "+largo+"cm de largo y "+altura+"cm de alto";
    }

    @Override
    public String comunicarse() {
        return "EL "+ nombreCientifico+ " es capaz de rugir a con una potencia de "+potenciaRugidoDecibeles+ " decibeles";
    }
}
