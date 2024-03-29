package POO.Abstract.validador;

public class Email extends Validador{

    protected String mensaje="Esto no es correo";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";
    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
