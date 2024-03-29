package Ejercicios.ZOO.resources.animales.felinos;

import Ejercicios.ZOO.resources.animales.Mamifero;

abstract public class Felino extends Mamifero {

    protected float tamnoGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, String nombreCientifico, float tamnoGarras, int velocidad) {
        super(habitat, altura, largo, nombreCientifico);
        this.tamnoGarras = tamnoGarras;
        this.velocidad = velocidad;
    }

    public float getTamnoGarras() {
        return tamnoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }


}
