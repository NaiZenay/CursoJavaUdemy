package POO.Abstract.validador;

public class Largo extends Validador {
    private int min = 0;
    private int max = Integer.MAX_VALUE;
    protected String mensaje = "El campo de tener minimo:" + min + " y maximo:" + max;

    public Largo() {
    }

    public Largo(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public boolean esValido(String valor) {
        return valor.length() <= max && valor.length() >= min;
    }
}
