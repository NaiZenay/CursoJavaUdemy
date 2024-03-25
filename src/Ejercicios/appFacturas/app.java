package Ejercicios.appFacturas;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Empresa Random");
        cliente.setNif("5555-123");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la descripcion de la factura");
        Factura factura = new Factura(cliente,scanner.nextLine());

        Producto producto;
        for (int i = 0; i < 5; i++) {
            producto = new Producto();

            System.out.println("Ingrese el nombre del producto");
            producto.setNombre(scanner.next());

            System.out.println("Ingrese el precio del producto");
            producto.setPrecio(scanner.nextDouble());

            System.out.println("Ingrese la cantidad del producto");
            factura.addItemsFactura(new ItemFactura(producto, scanner.nextInt()));
            System.out.println();
        }

        System.out.println(factura.mostrarDetalle());


    }
}
