package POO.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private String persona;
    private String carrera;
    private List<String> exp;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.exp=new ArrayList<>();
    }

    public Curriculum(String contenido) {
        super(contenido);
    }

    public Curriculum addExperiencia(String experiencia){
        exp.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre:").append(persona).append("\n");
        sb.append("Resumen:\n").append(contenido).append("\n");
        sb.append("Carrera:").append(carrera).append("\n");
        exp.forEach(xp -> sb.append('-').append(xp).append("\n"));
        return sb.toString();
    }
}
