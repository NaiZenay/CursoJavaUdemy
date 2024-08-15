package ClassOptional.models;

public class Procesador {
    private String nombre;
    private Fabricante fabricante;

    public Procesador(String nombre, Fabricante fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }
}
