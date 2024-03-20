package POO.paquetes.org.paquetes.app;

//importacion de clase individual
//import POO.paquetes.org.paquetes.app.hogar.Persona;

///importacion de todos los archivos dentre del paquete hogar
import POO.paquetes.org.paquetes.app.hogar.*;

//importar metodo estatico de una clase en otro paquete
//import static POO.paquetes.org.paquetes.app.hogar.Persona.saludar;

public class Ejemplo {

    public static void main(String[] args) {
        Mascota m=new Mascota();
        System.out.println(m.getOwner());
    }
}
