package Ejercicios.ZOO.animales.canino;

public class Lobo extends Canino{
    private int numCamanada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
    }

    public Lobo(String habitat, float altura, float largo, String nombreCientifico, String color, Float tamanoColmillos, int numCamanada, String especieLobo) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
        this.numCamanada = numCamanada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El "+ nombreCientifico+" o "+especieLobo+" de color "+ color+" caza utilizando su comlmillos que en promedio miden "+tamanoColmillos+" pulgadas";
    }

    @Override
    public String dormir() {
        return "El "+ nombreCientifico+" o "+ especieLobo+" de color "+ color+" duerme en "+ habitat;
    }

    @Override
    public String correr() {
        return  "El "+nombreCientifico+" o "+especieLobo+" de color "+color+ " corre junto a su camadad de aproximadamente "+numCamanada+" mididendo estos aproximadamente "+largo+"cm de largo y "+altura+"cm de alto";
    }

    @Override
    public String comunicarse() {
        return "El "+ nombreCientifico+" o "+especieLobo+" de color"+ color+" aulla";
    }
}
