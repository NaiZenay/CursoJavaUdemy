package POO;

public class Main {
    public static void main(String[] args) {
        //Crear instancia de objeto para accder a metodos y atributos
        Automovil automovil= new Automovil();

        //Invocar metodo estativo con la clase y no con la instancia
        Automovil.setColorPantente("Verde");
        automovil.setColor();
        automovil.setFabricante("Mazda");
        automovil.setModelo("BT-50");
        automovil.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println(automovil.toString());

        TipoAutomovil.getTipos();


    }
}
