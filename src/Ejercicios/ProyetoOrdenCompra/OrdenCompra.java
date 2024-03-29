package Ejercicios.ProyetoOrdenCompra;

import java.util.Arrays;
import java.util.Date;

/*
La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

-Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental,
 descripcion String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.

-En la clase OrdenCompra, crear constructor que inicialice solo la descripción.

-En la clase OrdenCompra, crear métodos getter para todos los atributos.

-En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.

-Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto (Producto producto),
 nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

-La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.

-Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int,
 inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

-Crear la clase Cliente con dos atributos nombre y apellido,
 inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

-Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:

	Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.

	Para cada una imprimir sus valores en consola usando método getter incluyendo los productos,
	donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio.
	Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
 */
public class OrdenCompra {
    private int id;
    private static int ultimoid;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos=new Producto[4];
    private int indexProducto=0;

    public OrdenCompra() {
        this.id=++ultimoid;
    }


    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getProductos() {
        String productoss="";
        for (Producto producto:productos){
            productoss+=producto.toString()+"\n";
        }
        return productoss;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void addProducto(Producto producto){
        if (indexProducto>=4){
            System.out.println("Lista de productos llena");
        }else {
            productos[indexProducto++]=producto;
        }
    }

    @Override
    public String toString() {
        return
                "Descripcion=" + descripcion + '\n' +
                "Fecha=" + fecha +'\n' +
                "Cliente=" + cliente.getNombre()+" "+cliente.getApellido() +'\n' +
                this.getProductos()+'\n';
    }
}
