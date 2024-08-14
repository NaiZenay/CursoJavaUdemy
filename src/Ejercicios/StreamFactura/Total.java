package Ejercicios.StreamFactura;

import java.util.ArrayList;
import java.util.List;

public class Total {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(2, 1.5));
        productos.add(new Producto(3, 0.8));
        productos.add(new Producto(1, 1.2));
        productos.add(new Producto(1, 2.0));
        productos.add(new Producto(1, 1.8));
        
        double total=productos.stream()
                .mapToDouble(producto -> producto.getCantidad()* producto.getPrecio())
                .reduce(0.0, Double::sum);
        System.out.println("total = " + Math.ceil(total));
    }
}
