package POO.Herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    protected String email;


    public Persona() {
        System.out.println("Inicializando una persona");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.print("Hola");
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'';
    }
}
