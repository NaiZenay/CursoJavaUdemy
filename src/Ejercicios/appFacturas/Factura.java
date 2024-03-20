package Ejercicios.appFacturas;

import java.util.Date;

public class Factura {
    private Cliente cliente;
    private ItemFactura itemsFactura[];
    private int indexItemFactura=0;
    private int folio;
    private String descripcion;
    private Date fecha;

    private static final int MAX_ITEMS=10;

    private static int ultimoFolio=0;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.itemsFactura=new ItemFactura[MAX_ITEMS];
        this.folio=++ultimoFolio;
        this.fecha=new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItemsFactura() {
        return itemsFactura;
    }

    public void addItemsFactura(ItemFactura itemFactura) {
        if(!(indexItemFactura>=MAX_ITEMS)){
            this.itemsFactura[indexItemFactura++] = itemFactura;
        }else {
            System.out.println("Se alcanzo el limite de items por factura");
        }
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
