package POO.Abstract.elementos.select;

public class Opcion {
    private String nombre;
    private String valor;
    private boolean seleccinado;

    public Opcion() {
    }

    public Opcion(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
