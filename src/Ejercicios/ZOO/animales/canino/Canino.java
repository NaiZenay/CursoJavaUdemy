package Ejercicios.ZOO.animales.canino;

import Ejercicios.ZOO.animales.Mamifero;

abstract public class Canino extends Mamifero{

    protected String color;
    protected String tamanoColmillos;

    public Canino(String habitat, float altura, float largo, String nombreCientifico, String color, String tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public String getTamanoColmillos() {
        return tamanoColmillos;
    }



}
