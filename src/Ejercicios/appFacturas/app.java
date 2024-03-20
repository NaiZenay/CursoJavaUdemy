package Ejercicios.appFacturas;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        cliente.setNombre("Empresa Random");
        cliente.setNif("5555-123");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura");
        String descripcion= scanner.nextLine();
        Factura factura=new Factura(cliente,descripcion);
        Producto producto;
        for (int i = 0; i < 5; i++) {
            producto= new Producto();
            System.out.println("Ingrese el nombre del producto");
            String nombre=scanner.next();
            producto.setNombre(nombre);
            System.out.println("Ingrese el precio del producto");
            double precio=scanner.nextDouble();
            producto.setPrecio(precio);
            System.out.println("Ingrese la cantidad del producto");
            int cantidad=scanner.nextInt();
            ItemFactura itemFactura=new ItemFactura(producto,cantidad);
            factura.addItemsFactura(itemFactura);
            System.out.println();
        }

        System.out.println(factura.mostrarDetalle());


    }
}
