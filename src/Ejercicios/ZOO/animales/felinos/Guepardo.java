package Ejercicios.ZOO.animales.felinos;

public class Guepardo extends Felino{
    public Guepardo(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El "+nombreCientifico+" caza utilizando sus garras de "+tamnoGarras;
    }

    @Override
    public String dormir() {
        return "El "+nombreCientifico+" duerme en "+habitat;
    }

    @Override
    public String correr() {
        return "El "+nombreCientifico+ " corre a una velocidad de "+velocidad+" mididendo este aproximadamente "+largo+" de largo y "+altura+" de alto";
    }

    @Override
    public String comunicarse() {
        return "El "+nombreCientifico+ " grune";
    }
}
