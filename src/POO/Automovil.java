package POO;

import java.util.Scanner;

public class Automovil implements Comparable<Automovil> {


    //Atributos
    private int id;
    private TipoAutomovil tipo;
    private String fabricante;
    private String modelo;

    private Persona owner;

    //Valor por default al crear el objeto
    private String color = "gris";

    //atributo que no pertenece a la referencia si no al objeto
    //Los atributos estatics afectan a todas las instancias de la clase
    static String colorPantente = "naranja";
    private static int ultimoID;

    //final se refiere a que este atributo es una constante(por lo general son estaticas)
    //Se escribe en mayusculas y las palbras compuestas se separan con guion bajo
    public final static int VELOCIDAD_MAX_CARRETERA = 120;


    //Constructores
    public Automovil() {
        this.id = ++ultimoID;
    }//Constructor por default

    public Automovil(String fabricante, String modelo, Color color) {//Constructor sobrecargado
        this();//llama al constructor por default
        this.setModelo(modelo);
        this.setColor();
        this.setFabricante(fabricante);
    }

    public Automovil(String fabricante, String modelo) {//Constructor sobrecargado
        this();
        this.setModelo(modelo);
        this.setFabricante(fabricante);
    }

    //getters y setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el numero del color a elegir\n" +
                "1)Rojo\n2)Amarillo\n3)Azul\n4)Gris\n5)Naranja");
        int color = scanner.nextInt();

        switch (color) {
            case 1 ->
                this.color = String.valueOf(Color.ROJO);
            case 2 ->
                this.color = String.valueOf(Color.AMARILLO);
            case 3 ->
                this.color = String.valueOf(Color.AZUL);
            case 4 ->
                this.color = String.valueOf(Color.Gris);
            case 5->
                this.color = String.valueOf(Color.NARANJA);
            default ->
                this.color="gris";
        }
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return this.id;
    }


    //Getter y setter de un atributo estatico
    public static String getColorPatente() {
        return colorPantente;
    }

    public static void setColorPantente(String colorPantente) {
        Automovil.colorPantente = colorPantente;
    }

    public static int getVelocidadMaxCarretera() {
        return Automovil.VELOCIDAD_MAX_CARRETERA;
    }
    //Metodos

    //Modificador de acceso , Tipo de dato a retornar, nombre , (Parametros)
    public void acelerar() {
        System.out.println("El auto " + this.getFabricante() + " comenzo a moverse");
    }

    public void frenar() {
        System.out.println("El auto " + this.getFabricante() + " se detuvo");
    }


    //sobrecarga de metodo (mismo metodo pero con diferente argumento)
    public float ConsumoGas(int kilometros, float gas) {
        return (kilometros / gas);
    }

    public int ConsumoGas(int kilometros, int gas) {
        return (kilometros / gas);
    }


    //Sobreescritura de Equals
    @Override
    public boolean equals(Object obj) {

        Automovil automovil = (Automovil) obj;
        boolean iguales;

        if (this == obj) {
            iguales = true;
        } else if (!(obj instanceof Automovil)) {
            iguales = false;
        }


        if (automovil.getFabricante() != null) {
            iguales = this.getFabricante().equals(automovil.getFabricante());
        } else {
            System.out.println("Fabricante nulo");
            iguales = false;
        }
        return iguales;
    }

    //Sobreescritura de toString
    @Override
    public String toString() {
        return "ID: " + this.getId() + "\n" +
                "Dueño:" +this.owner.toString()+"\n"+
                "Fabricante:" + this.getFabricante() + "\n" +
                "Modelo:" + this.getModelo() + "\n" +
                "Color:" + this.getColor() + "\n" +
                "Color de la Patente " + Automovil.colorPantente + "\n" +
                "Tipo de Auto: "+this.getTipo()+"\n";
    }

    //Implemnetacion del metodo compareTo para ordenar listas en base a un atributo de la clase
    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.getFabricante());
    }
}
