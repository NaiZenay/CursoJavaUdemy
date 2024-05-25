package Ejercicios.CarroSupermercado;

public class NoPerecible extends Producto{
    private String envasado;
    private float peso;

    public NoPerecible(String nombre, double precio, String envasado, float peso) {
        super(nombre, precio);
        this.envasado = envasado;
        this.peso = peso;
    }

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
