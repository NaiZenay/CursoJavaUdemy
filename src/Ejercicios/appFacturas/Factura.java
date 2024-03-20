package Ejercicios.appFacturas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private ItemFactura itemsFactura[];
    private int indexItemFactura = 0;
    private int folio;
    private String descripcion;
    private Date fecha;

    private static final int MAX_ITEMS = 10;

    private static int ultimoFolio = 0;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.itemsFactura = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
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
        if (!(indexItemFactura >= MAX_ITEMS)) {
            this.itemsFactura[indexItemFactura++] = itemFactura;
        } else {
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

    public double calcularTotal() {
        double total = 0;
        for (ItemFactura item : this.itemsFactura) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

    public String mostrarDetalle() {
        StringBuilder sb = new StringBuilder("Factura No.");
        sb.append(folio)
                .append("\nCliente:")
                .append(this.getCliente().getNombre())
                .append("\t nif: ")
                .append(this.getCliente().getNif())
                .append("\nDescripcion:")
                .append(this.getDescripcion()).append("\n")
                .append("\n#\tNombre\t$\tCantidad\tTotal\n");

        for (ItemFactura item : this.itemsFactura) {
            if (item != null) {
                sb.append(item.getProducto().getCodigo())
                        .append("\t")
                        .append(item.getProducto().getNombre())
                        .append("\t")
                        .append(item.getProducto().getPrecio())
                        .append("\t")
                        .append(item.getCantidad())
                        .append("\t")
                        .append(item.calcularImporte())
                        .append("\n");
            }
        }
        sb.append("Total: $")
                .append(calcularTotal());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd");
        sb.append("Fecha de Facturazion:\n");
        sb.append(sdf.format(this.getFecha()));

        return sb.toString();
    }
}
