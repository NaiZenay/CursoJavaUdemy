package Anotaciones.modelos;

import Anotaciones.Init;
import Anotaciones.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {
    @JsonAtributo(capitalizar = false)
    private String nombre;
    @JsonAtributo
    private double precio;
    private LocalDate fecha;

    public Producto() {
    }

    public Producto(String nombre, double precio, LocalDate fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    @Init
    private void init(){
       this.nombre= nombre= Arrays.stream(nombre.split(" "))
                .map( palabra ->String.valueOf(palabra.charAt(0)).toUpperCase()+palabra.substring(1))
                .collect(Collectors.joining(" "));
    }
}
