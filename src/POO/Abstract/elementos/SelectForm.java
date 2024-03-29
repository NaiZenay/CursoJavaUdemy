package POO.Abstract.elementos;

import POO.Abstract.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm {
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion) {
        opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHTML() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='").append(nombre).append("'>");

        for (Opcion opcion : opciones) {
            sb.append("\n <option value='").append(opcion.getValor());
            sb.append("'");
            if (opcion.isSeleccinado()) {
                sb.append(" selected");
                this.setValor(opcion.getValor());
            }
            sb.append(">");
            sb.append(opcion.getValor()).append("</option>");
        }
        sb.append("\n</select>");
        return sb.toString();
    }

}
