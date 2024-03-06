package POO;

public class Main {
    public static void main(String[] args) {
        //Crear instancia de objeto para accder a metodos y atributos
        Automovil automovil= new Automovil();

        //Invocar metodo estativo con la clase y no con la instancia
        Automovil.setColorPantente("Verde");
        System.out.println(Automovil.getVelocidadMaxCarretera());


        automovil.setColor();
        automovil.setFabricante("Mazda");
        automovil.setModelo("BT-50");

        System.out.println(automovil.toString());
        automovil.acelerar();
        automovil.frenar();

        Automovil automovil1= new Automovil("Mazada","BT-40");
        System.out.println(automovil1.toString());

        Automovil automovil2= new Automovil("Mazada","BT-40","rojo");
        System.out.println(automovil2.toString());


        System.out.println(automovil1.equals(automovil2));
    }
}
