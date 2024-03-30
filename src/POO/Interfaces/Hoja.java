package POO.Interfaces;

/*
Las interfaces detallan el comportamiento de un grupo de objetos
-permiten la implementacion multiple
-todos sus metodos son abtractos (forza el override)
-
 */
abstract public class Hoja{
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();

}
