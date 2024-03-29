package Ejercicios.ZOO.animales.felinos;

public class Guepardo extends Felino{
    public Guepardo(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El "+nombreCientifico+" o Guepardo caza utilizando sus garras de "+tamnoGarras+" pulgadas";
    }

    @Override
    public String dormir() {
        return "El "+nombreCientifico+" o Guepardo duerme en "+habitat;
    }

    @Override
    public String correr() {
        return "El "+nombreCientifico+ " o Guepardo corre a una velocidad de "+velocidad+"km/h mididendo este aproximadamente "+largo+"cm de largo y "+altura+"cm de alto";
    }

    @Override
    public String comunicarse() {
        return "El "+nombreCientifico+ " grune";
    }
}
