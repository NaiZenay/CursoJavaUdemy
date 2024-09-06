package PatronesDiseno.observer;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio users = new UsuarioRepositorio();
        users.addObserver((o,obj) -> System.out.println("Enviando correo de notificacion"));
        users.addObserver((o,obj) -> System.out.println("Enviando correo de notificacion al admin"));
        users.addObserver((o,obj) -> System.out.println("Guardando info del usuario"));
        users.crear("Alex");
        users.crear("Alex");

    }
}
