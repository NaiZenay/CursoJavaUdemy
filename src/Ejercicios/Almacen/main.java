package Ejercicios.Almacen;
/*
Para la tarea se pide desarrollar un diseño orientado a objetos para un almacén y verdulería,
como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el nombre (string) y precio (double) que deben heredar de la clase padre Producto,
pero ademas cada una van a tener dos atributos propios adicionales, sus métodos getter y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).

Para el ejemplo de la clase main se pide crear dos objetos por cada tipo de producto que deben ser almacenados en un arreglo del tipo Producto,
se debe mostrar iterando el arreglo, por cada uno el detalle completo, el precio, nombre y los atributos adicionales.
 */
public class main {
    public static void main(String[] args) {
        Fruta fruta=new Fruta("Manzana",10,0.4,"rojo");
        Fruta fruta2=new Fruta("Limon",3,0.2,"verde");

        Lacteo lacteo=new Lacteo("Leche",12,1,3);
        Lacteo lacteo2=new Lacteo("Queso",20,3,25);

        Limpieza limpieza=new Limpieza("Cloro",12,"HCI",5);
        Limpieza limpieza2=new Limpieza("Jabon",8,"KOH",3);

        NoPerecible noPerecible=new NoPerecible("Atun Enlatado",5,100,240);
        NoPerecible noPerecible2=new NoPerecible("Arroz",12,1000,1300);

        Producto[] productos={fruta,fruta2,lacteo,lacteo2,limpieza,limpieza2,noPerecible,noPerecible2};

        for(Producto producto:productos){
            System.out.println(producto.toString());
        }
    }
}
