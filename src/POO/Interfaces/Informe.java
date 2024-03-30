package POO.Interfaces;

public class Informe extends Hoja implements Imprimible{
    private String autor;
    private String revisor;

    public Informe(String contenido) {
        super(contenido);
    }

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }
@Override
    public String imprimir() {
        return "El Informe fue escrito por "+autor+ " y revisado por "+revisor+"\n" +contenido;
    }
}
