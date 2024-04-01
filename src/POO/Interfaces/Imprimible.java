package POO.Interfaces;

/*
Las interfaces detallan el comportamiento de un grupo de objetos
-permiten la implementacion multiple
-todos sus metodos son abtractos (forza el override)
-todos sus metodos deben ser publicos o default
-su nombre debe terminar con ible
- todos sus metodos son publicos por default
 */
public interface Imprimible {
    //las constantes tambien son permitidos dentro de las interfaces pero por defecto ya son asi (no se permite otro tipo)
    final static String x="x";

    String imprimir();


    //solo aplicable con los metodos que son default
    //los metodos default y static son los q tienen permiso de tener su propia implementacion dentro de la interfaz
    static void metodoOpcional(){
        System.out.println("Metodo que es parte de la interfaz pero no es obligatorio");
    }

    default void imprimible(){
        System.out.println("Metodo propio de la interfaz"+this.getClass().getName());
    }




}
