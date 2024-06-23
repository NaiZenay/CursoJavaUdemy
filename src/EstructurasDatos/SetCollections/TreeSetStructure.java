package EstructurasDatos.SetCollections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStructure {
    public static void main(String[] args) {
        //TreeSet
        //-Almacena datos de objetos que implemetan la interfaz Comparable
        //-Tiene un costo de rendimiento mas alto debido a la funcionalidad de ordenamiento automatico
        //-No permite almacenamiento de elementos repetidos
        Set<Integer> ts= new TreeSet<>();//El constructor toma de parametro un comparador en caso de personalizar la forma de ordenar los datos que se guardan
        Random random= new Random();
        for (int i = 0; i < 15; i++) {
            ts.add(random.nextInt(9000));
        }
        System.out.println(ts);
    }
}
