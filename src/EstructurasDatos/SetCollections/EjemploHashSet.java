package EstructurasDatos.SetCollections;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        String[] caballos={"Árabe", "Pura Sangre", "Andaluz", "Frisón", "Percherón", "Appaloosa", "Árabe", "Cuarto de Milla", "Tennessee Walking Horse", "Shetland Pony", "Lipizzano", "Andaluz", "Mustang", "Haflinger", "Clydesdale"} ;
        Set <String> caballosUnicos= new HashSet<>();
        Set <String> caballosDuplicados= new HashSet<>();

        for (String caballo:caballos){
            if (!(caballosUnicos.add(caballo))){
                caballosDuplicados.add(caballo);
            }
        }

        System.out.println("Caballos Unicos\n"+caballosUnicos );
        System.out.println("Caballos Duplicados\n"+caballosDuplicados );

    }
}
