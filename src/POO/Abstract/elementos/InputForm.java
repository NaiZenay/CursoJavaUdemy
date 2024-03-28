package POO.Abstract.elementos;

public class InputForm extends ElementForm {

    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //implementacion del metodo abstracto de la clase padre
    @Override
    public String dibujarHTML() {
        return "<input type='"+tipo+"' name='"+nombre+"' value='"+valor+"'>";
    }
}
