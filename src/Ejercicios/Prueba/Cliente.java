package Ejercicios.Prueba;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Ticket> ticketsComprados;

    public Cliente(String nombre, String apellido,String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
        ticketsComprados=new ArrayList<>();
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public List<Ticket> getTicketsComprados() {
        return ticketsComprados;
    }

    public void setTicketsComprados(Ticket ticketComprado) {
        this.ticketsComprados.add(ticketComprado);
    }

    public String getDni() {
        return dni;
    }
}
