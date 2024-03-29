package Ejercicios.ZOO;

import Ejercicios.ZOO.animales.Mamifero;
import Ejercicios.ZOO.animales.canino.Lobo;
import Ejercicios.ZOO.animales.canino.Perro;
import Ejercicios.ZOO.animales.felinos.Guepardo;
import Ejercicios.ZOO.animales.felinos.Leon;
import Ejercicios.ZOO.animales.felinos.Tigre;

public class zoo {
    public static void main(String[] args) {
        Mamifero[] mamiferos= {
                new Leon("llanura",140.0f,2.90f,"Panthera leo", 1.5F,74,7,110),
                new Guepardo("sur de Africa",90f,150,"Acinonyx jubatus",1.2f,120),
                new Tigre("bosque tropical",90f,180f,"Panthera tigris tigris",2.9f,90,"Tigre de Bengala"),
                new Tigre("bosque caducifolios",100f,180f,"Panthera tigris altaica",2.9f,90,"Tigre Siberiano"),
                new Lobo("Desierto de sonora",160f,80f,"Canis lupus baileyi","gris",1.9f,7,"Lobo Mexicano"),
                new Lobo("Tundra Artica",80f,200f,"Canis lupus arctos","blanco",2.5f,8,"Lobo Artico"),
                new Perro("Hogares Domesticos",68f,72f,"Canis lupus familiaris","Negro y cafe",0.5f,245),
        };

        for (Mamifero mamifero:mamiferos){
            System.out.println(mamifero.correr());
        }
    }
}
