package Ejercicios.EncontrarVuelo;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo> {

    private String nombre;
    private String origen;
    private Date fechaLlegada;
    private Integer cantidadPasajeros;

    public Vuelo(String nombre, String origen, Date fechaLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.fechaLlegada = fechaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo " +nombre + "\n" +
                "Origen "+ origen+ "\n" +
                "LLegada " + fechaLlegada.toString()+ "\n" +
                "Pasajeros " + cantidadPasajeros+ "\n" +
                "Hacia la ciudad de Santiago" +
                "\n==========================================";
    }

    @Override
    public int compareTo(Vuelo v) {
        return this.getFechaLlegada().compareTo(v.getFechaLlegada());
    }
}
