package Ejercicios.ZOO.animales.canino;

public class Lobo extends Canino{
    private int numCamanada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, String nombreCientifico, String color, String tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
    }

    @Override
    public String comer() {
        return "El "+ nombreCientifico+" "+especieLobo+" "+ color+"caza utilizando su comlmillos que en promedio miden "+tamanoColmillos;
    }

    @Override
    public String dormir() {
        return "El "+ nombreCientifico+" "+ especieLobo+" "+ color+" duerme en "+ habitat;
    }

    @Override
    public String correr() {
        return  "El "+nombreCientifico+" "+especieLobo+" "+color+ " corre junto a su camadad de aproximadamente "+numCamanada+" mididendo estos aproximadamente "+largo+" de largo y "+altura+" de alto";
    }

    @Override
    public String comunicarse() {
        return "El "+ nombreCientifico+" "+especieLobo+" "+ color+" aulla";
    }
}
