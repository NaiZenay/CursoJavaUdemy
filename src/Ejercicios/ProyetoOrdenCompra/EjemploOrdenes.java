package Ejercicios.ProyetoOrdenCompra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EjemploOrdenes {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Primer orden
        Cliente cliente = new Cliente("Andrea","Nuñez");
        Date fecha = simpleDateFormat.parse("2024-11-01");
        Producto producto = new Producto("China", "Termo", 23);
        Producto producto1 = new Producto("Taiwan", "Vaso", 34);
        Producto producto2= new Producto("Mexico", "Aguacate", 3);
        Producto producto3= new Producto("China", "Paraguas", 15);
        OrdenCompra orden1=new OrdenCompra("Compra de articulos");
        orden1.setCliente(cliente);
        orden1.setFecha(fecha);
        orden1.addProducto(producto);
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);

        //Segunda orden
        Cliente cliente1 = new Cliente("Jetzemani", "Ortega");
        Date fecha1 = simpleDateFormat.parse("2024-05-22");
        Producto producto4 = new Producto("Francia", "Crossaint", 2);
        Producto producto5 = new Producto("EU", "Teclado", 52);
        Producto producto6= new Producto("China", "Lentes", 60);
        Producto producto7= new Producto("Italia", "Pizza", 12);
        OrdenCompra orden2=new OrdenCompra("Compra de articulos");
        orden2.setCliente(cliente1);
        orden2.setFecha(fecha1);
        orden2.addProducto(producto4);
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);


        //Tercer Orden orden
        Cliente cliente2 = new Cliente("Alex","Flores");
        Date fecha2 = simpleDateFormat.parse("2024-01-08");
        Producto producto8 = new Producto("China", "Audifonos", 35);
        Producto producto9 = new Producto("China", "Bocina", 23);
        Producto producto10 = new Producto("China", "Monitor", 69);
        Producto producto11 = new Producto("Mexico", "Tequila", 20);
        OrdenCompra orden3=new OrdenCompra("Compra de articulos");
        orden3.setCliente(cliente2);
        orden3.setFecha(fecha2);
        orden3.addProducto(producto8);
        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);

        OrdenCompra[] ordenCompras=new OrdenCompra[3];
        ordenCompras[0]=orden1;
        ordenCompras[1]=orden2;
        ordenCompras[2]=orden3;

        for (OrdenCompra ordenCompra:ordenCompras) System.out.println(ordenCompra.toString());
    }
}
