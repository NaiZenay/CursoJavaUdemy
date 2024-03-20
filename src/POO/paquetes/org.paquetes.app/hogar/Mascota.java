package POO.paquetes.org.paquetes.app.hogar;

public class Mascota {
    Persona owner=new Persona("Juan");
    //Modificador de acceso default(solo accecisble a clases dentro del mismo paquete)



    public String getOwner() {
        return owner.toString();
    }
}
