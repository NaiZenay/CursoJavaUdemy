package POO.Abstract.elementos.select;

public class Opcion {
    private int id;
    private String valor;
    private boolean seleccinado;

    public Opcion() {
    }

    public Opcion(int id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isSeleccinado() {
        return seleccinado;
    }

    public void setSeleccinado(boolean seleccinado) {
        this.seleccinado = seleccinado;
    }
    public Opcion setSeleccinado() {
        this.seleccinado = true;
        return this;
    }

}
