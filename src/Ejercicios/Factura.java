package Ejercicios;
import javax.swing.*;
public class Factura {
    public static void main(String[] args) {
        double total;
        double producto1=0;
        double producto2=0;
        String resultado;
        boolean preciosValidos;

        String nombreFactura = JOptionPane.showInputDialog(null, "Ingrese el nombre o descripcion de la factura");

        do{
            preciosValidos=true;
            String inputPrecioProducto1 = JOptionPane.showInputDialog(null, "Ingrese el precio del primer producto a facturar");
            String inputPrecioProducto2 = JOptionPane.showInputDialog(null, "Ingrese el precio del segundo producto a facturar");

            try {
                producto1 = Double.parseDouble(inputPrecioProducto1);
                producto2 = Double.parseDouble(inputPrecioProducto2);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "El precio de uno de los productos no es valido");
                preciosValidos=false;
            }
        }while (!preciosValidos);

        total = producto1 + producto2 + (producto1 + producto2) * 0.19;

        resultado ="Factura: --" + nombreFactura + "--\n"+
                "Producto 1:        " + producto1 + "\n" +
                "Producto 2:        " + producto2 + "\n" +
                "Total bruto:         " + String.valueOf(producto2 + producto1) + "\n" +
                "Impuestos (19%)\n"+
                "Total neto:           " + String.valueOf(total);
        JOptionPane.showMessageDialog(null,resultado);

    }
}
