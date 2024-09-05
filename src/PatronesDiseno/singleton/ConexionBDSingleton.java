package PatronesDiseno.singleton;

public class ConexionBDSingleton {
    static private ConexionBDSingleton instancia;
    private ConexionBDSingleton(){
        System.out.println("Conectando a motor de BD");

    }

    static public ConexionBDSingleton getInstance(){
        if (instancia == null){
            instancia= new ConexionBDSingleton();
        }
        return instancia;

    }
}
