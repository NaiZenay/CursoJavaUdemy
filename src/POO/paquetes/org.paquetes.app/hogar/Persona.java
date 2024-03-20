package POO.paquetes.org.paquetes.app.hogar;


 class Persona {
     //Protected (solo accesible desde el mismo paquete y desde la herencia
     protected String nombre;

    Persona (String nombre){
        this.nombre=nombre;
    }

    static void saludar(){
        System.out.println("Persona dice hola");
    }
    @Override
    public String toString() {
        return nombre ;
    }
}
