package POO.Abstract.elementos;

/*
Clase abstracta
-No se le puede crear instancia
-Es una clase generica para heredar a otras
-contiene metodos abstractos los cuales no tiene una implementacion ya que todos sus hijos implemetaran el metodo de una forma diferente(obliga el override)
-no puede tener metodos abstractos en una clase no abstracta
 */

import POO.Abstract.validador.Largo;
import POO.Abstract.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementForm {
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;
    public ElementForm() {
        validadores= new ArrayList<>();
        errores= new ArrayList();
    }

    public ElementForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    public ElementForm addValidador(Validador validador){
        validadores.add(validador);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador validador:validadores){
            if(!(validador.esValido(valor))){
                if (validador instanceof Largo){
                    ((Largo)validador).setFormatMessage(this);
                }else {
                    errores.add(String.format(validador.getMensaje(),nombre));
                }
            }
        }
        return errores.isEmpty();

    }
    abstract public String dibujarHTML();
}
