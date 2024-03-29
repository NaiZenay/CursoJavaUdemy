package Ejercicios.ZOO.animales.canino;

import Ejercicios.ZOO.animales.Mamifero;

abstract public class Canino extends Mamifero{

    protected String color;
    protected Float tamanoColmillos;

    public Canino(String habitat, float altura, float largo, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }



}
