package Ejercicios.ZOO.animales.canino;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, String nombreCientifico, String color, String tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
    }

    @Override
    public String comer() {
        return "El "+ nombreCientifico+" "+ color+" caza a sus presas con el osico el cual tiene una fuerza de mordida de "+fuerzaMordida;
    }

    @Override
    public String dormir() {
        return "El "+ nombreCientifico+" "+ color+" duerme en "+habitat;
    }

    @Override
    public String correr() {
        return "El "+ nombreCientifico+" "+ color+"corre mididendo estos aproximadamente "+largo+" de largo y "+altura+" de alto";
    }

    @Override
    public String comunicarse() {
        return "El" + nombreCientifico+" "+color+" ladra";
    }
}
