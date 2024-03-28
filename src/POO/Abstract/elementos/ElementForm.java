package POO.Abstract.elementos;

/*
Clase abstracta
-No se le puede crear instancia
-Es una clase generica para heredar a otras
-contiene metodos abstractos los cuales no tiene una implementacion ya que todos sus hijos implemetaran el metodo de una forma diferente(obliga el override)
-no puede tener metodos abstractos en una clase no abstracta
 */

abstract public class ElementForm {
    protected String valor;
    protected String nombre;

    public ElementForm() {
    }

    public ElementForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHTML();
}
