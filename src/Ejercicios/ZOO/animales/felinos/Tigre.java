package Ejercicios.ZOO.animales.felinos;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad,String especie) {
        super(habitat, altura, largo, nombreCientifico, tamnoGarras, velocidad);
        this.especieTigre=especie;
    }

    @Override
    public String comer() {
        return "El "+nombreCientifico+" tambien conocido como "+especieTigre+" caza su comida utilizando sus garras de "+tamnoGarras+ " pulgadas";
    }

    @Override
    public String dormir() {
        return "El "+nombreCientifico+" tambien conocido como "+especieTigre+" duerme en "+habitat;
    }

    @Override
    public String correr() {
        return "El "+nombreCientifico+" tambien conocido como "+especieTigre+ "corre a una velocidad de "+velocidad +"km/h mididendo este aproximadamente "+largo+"cm de largo y "+altura+"cm de alto";
    }

    @Override
    public String comunicarse() {
        return "El "+nombreCientifico+" tambien conocido como "+especieTigre+ " ruge";
    }
}
