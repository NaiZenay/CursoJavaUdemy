package POO;

public class Main {
    public static void main(String[] args) {
        //Crear instancia de objeto para accder a metodos y atributos
        Automovil automovil= new Automovil();
        Persona persona= new Persona("Ian","Yañez");

        //Invocar metodo estativo con la clase y no con la instancia
        Automovil.setColorPantente("Verde");
        automovil.setColor();
        automovil.setFabricante("Mazda");
        automovil.setModelo("BT-50");
        automovil.setTipo(TipoAutomovil.HATCHBACK);
        automovil.setOwner(persona);

        System.out.println(automovil.toString());



    }
}
