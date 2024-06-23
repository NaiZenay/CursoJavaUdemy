package EstructurasDatos.SetCollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetStructure {
    public static void main(String[] args) {
        //HashSet
        //-Alamacena elementos no duplicados en uan tablado con hash(practicamente ids)
        //-Almacena objetos nullos
        //-No tiene un orden asegurado de almacenamiento(no pueden ser ordenados)
        //-Hija de la Collection SET
        Set<String> hs= new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        hs.add("cinco");//retorna false ya q no se agrega (Los HasSet no pueden tener elementos duplicados)
        System.out.println(hs);//[cinco, uno, dos, tres, cuatro]

    }
}
