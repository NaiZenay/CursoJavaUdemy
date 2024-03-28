package POO.Abstract.elementos;

public class TextAreaForm extends ElementForm{
    private int filas;
    private int columnas;

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre,int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHTML() {
        return "<TextArea name='"+nombre+"' rows='"+filas+"' cols='"+columnas+"'> value='"+valor+"'>" ;
    }
}
