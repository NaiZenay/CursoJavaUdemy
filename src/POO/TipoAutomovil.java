package POO;

//enumeradores mas complejos
public enum TipoAutomovil {
    //Un constructor para cada constante
    SEDAN("Sedan",4,"Auto mediano"),
    STATION_WAGON("Station Wagon", 4,"Auto Grande"),
    HATCHBACK("Hatchback",4,"Auto compacto"),
    PICKUP("PickUp",4,"Camioneta"),
    COUPE("Coupe",2,"Auto pequeñó"),
    CONVERTIBLE("Convertible",2,"Auto deportivo"),
    FURGON("Furgon",4,"Auto utilitario");

    //DEfinicion de contructor
    TipoAutomovil(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    //Atributos para cada uno
    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
