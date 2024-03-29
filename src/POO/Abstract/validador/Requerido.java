package POO.Abstract.validador;

public class Requerido extends Validador{
    protected String mensaje="El campo %s es obligatorio";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return !(valor.isBlank());
    }
}
