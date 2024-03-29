package POO.Abstract.validador;

public class Numerico extends Validador{
    protected String mensaje="Este campo debe ser un numero";

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
