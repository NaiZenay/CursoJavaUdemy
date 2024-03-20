package POO.basic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Crear instancia de objeto para accder a metodos y atributos
        Automovil automovil= new Automovil();
        Persona persona= new Persona("Ian","Yañez");

        //Invocar metodo estatico con la clase y no con la instancia
        Automovil.setColorPantente("Verde");
        automovil.setColor();
        automovil.setFabricante("Mazda");
        automovil.setModelo("BT-50");
        automovil.setTipo(TipoAutomovil.HATCHBACK);
        automovil.setOwner(persona);



        Automovil automovil2= new Automovil();
        Persona persona1= new Persona("Alex","Flores");
        automovil2.setOwner(persona1);
        automovil2.setFabricante("BMW");
        automovil2.setModelo("R8");
        automovil2.setTipo(TipoAutomovil.CONVERTIBLE);
        automovil2.setColor();



        Automovil[] automoviles= new Automovil[2];
        automoviles[0]=automovil;
        automoviles[1]=automovil2;

        Arrays.sort(automoviles);//libreria de java.util para ordenar elementos de un arreglo

        for (Automovil autos:automoviles){
            System.out.println(autos.toString());
        }

    }
}
