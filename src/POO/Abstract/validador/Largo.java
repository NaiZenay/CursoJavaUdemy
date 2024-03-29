package POO.Abstract.validador;

import POO.Abstract.elementos.ElementForm;

public class Largo extends Validador {
    private int min = 0;
    private int max = Integer.MAX_VALUE;
    protected String mensaje = "El campo %s de tener minimo:  %d  y maximo: %d";

    public Largo() {
    }

    public Largo(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.length() <= max && valor.length() >= min;
    }

    public void setFormatMessage(ElementForm elementForm){
        this.mensaje=String.format(mensaje,elementForm.getNombre(),min,max);
    }
}
