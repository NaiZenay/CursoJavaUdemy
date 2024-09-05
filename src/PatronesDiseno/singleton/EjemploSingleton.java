package PatronesDiseno.singleton;

public class EjemploSingleton
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ConexionBDSingleton conexionBDSingleton=ConexionBDSingleton.getInstance();
            System.out.println("conexionBDSingleton = " + conexionBDSingleton);
        }
        ConexionBDSingleton conexionBDSingleton=ConexionBDSingleton.getInstance();
        ConexionBDSingleton conexionBDSingleton2=ConexionBDSingleton.getInstance();
        ConexionBDSingleton conexionBDSingleton3=ConexionBDSingleton.getInstance();
        System.out.println(conexionBDSingleton2==conexionBDSingleton3);
        System.out.println(conexionBDSingleton==conexionBDSingleton3);

    }
}
