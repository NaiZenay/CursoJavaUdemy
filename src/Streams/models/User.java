package Streams.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String nombre;
    private String apellido;
    private List<Factura> facturas;

    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        facturas= new ArrayList<>();
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFactura(Factura factura) {
        facturas.add(factura);
        factura.setUsuario(this);
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

    @Override
    public String toString() {
        return  nombre
                +" "+ apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nombre, user.nombre) && Objects.equals(apellido, user.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
