package POO.Abstract.validador;

public class NoNulo extends Validador{

    protected String mensaje="El campo %s no puede ser nulo";
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
        return valor!=null;
    }
}
