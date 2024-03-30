package POO.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Hoja> paginas;
    private String autor;
    private Genero genero;
    public String titulo;

    public Libro(String autor, Genero genero, String titulo) {
        this.autor = autor;
        this.genero = genero;
        this.titulo = titulo;
        this.paginas=new ArrayList<>();
    }

    public void addPagina(Hoja hoja) {
        paginas.add(hoja);
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor:").append(autor).append('\n')
                .append("Genero:").append(genero).append('\n')
                .append("Contenido:").append('\n');

        paginas.forEach(pag -> sb.append(pag.contenido).append('\n'));
        return sb.toString();
    }
}
