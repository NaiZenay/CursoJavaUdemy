package POO.Abstract.validador;

abstract public class Validador {
    protected String mensaje;

    public abstract String getMensaje();

    public abstract void setMensaje(String mensaje);

    abstract public boolean esValido(String valor);
}
