package Ejercicios.Prueba;

import Dates.Calendars;

import java.util.Calendar;
import java.util.Date;

public class Ticket {
    private int numeroFila;
    private int numAsiento;
    private Date FechaCompra;
    private Date FechaValidez;
    private float precio;

    private Cliente comprador;
    private boolean vendido;

    public Ticket(int numeroFila, int numAsiento) {
        this.numeroFila = numeroFila;
        this.numAsiento = numAsiento;
        //Dia de compra
        FechaCompra = new Date();
        //Asigancion de vencimineto para el mismo dia de la compra
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(FechaCompra);
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 59);
        FechaValidez = calendar.getTime();
        this.precio = 12.99f;
        this.vendido = false;
    }

    public Ticket() {
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void comprado(Cliente comprador){
        this.comprador=comprador;
        vendido=true;
    }
    @Override
    public String toString() {
        return "Ticket "+numeroFila +":"+numAsiento+"\n"+
                "FechaCompra:" + FechaCompra +"\n"+
                "FechaValidez:" + FechaValidez +"\n"+
                "precio:" + precio +"\n"+
                "comprador:" + comprador.getNombre() +"\n";
    }
}
