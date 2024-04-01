package Ejercicios.Catalogo;

import Ejercicios.Catalogo.Productos.Electronicos.IPhone;
import Ejercicios.Catalogo.Productos.Electronicos.TVLcd;
import Ejercicios.Catalogo.Productos.Libros.Comics;
import Ejercicios.Catalogo.Productos.Libros.Libro;
import Ejercicios.Catalogo.Productos.Producto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) throws ParseException {
        IProducto[] productos= new Producto[5];
        Calendar calendar= Calendar.getInstance();
        calendar.set(2020, 0, 01);
        Date fecha = calendar.getTime();

        productos[0]=new IPhone(30000,"China","14 PRO MAX","Gris");
        productos[1]=new TVLcd(90000,"Korea",200);
        productos[2]=new Libro(1000, fecha,"Martin","GG","Editorial de Alemania del Este");
        productos[3]=new Comics(20,fecha,"Stan Lee","Spiderman ContraAtq","Marvel STudios","Spiderman");
        productos[4]=new IPhone(19000,"Singapour","SE","ROJO");

        for (IProducto producto:productos){
            System.out.println(producto);
        }

    }
}
