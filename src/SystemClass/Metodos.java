package SystemClass;

public class Metodos {
    public static void main(String[] args) {
        System.err.println("Error");//Muestra un mensaje en forma de error
        //Termina la ejecucion del programa
        System.exit(1);//0(termino correctamente),1(termino por un error)
        System.gc();//Invoca al recolector de basura del JVM para eliminar la instancias de objetos q ya no esta en uso
    }
}
