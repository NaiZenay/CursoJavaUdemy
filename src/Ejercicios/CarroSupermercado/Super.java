package Ejercicios.CarroSupermercado;

public class Super {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> bolsaFrutas=new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos=new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoperecibles=new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza=new BolsaSupermercado<>();

        Limpieza cloro = new Limpieza("cloro",12.4,2,"Varias");
        Limpieza cloro1 = new Limpieza("cloro",12.4,2,"Varias");
        Limpieza cloro2 = new Limpieza("cloro",12.4,2,"Varias");
        Limpieza cloro3 = new Limpieza("cloro",12.4,2,"Varias");

        Fruta manzana = new Fruta("Manzana",2.3,"roja",3.1);
        Fruta manzana2 = new Fruta("Manzana",2.3,"roja",3.1);
        Fruta manzana3= new Fruta("Manzana",2.3,"roja",3.1);
        Fruta manzana4 = new Fruta("Manzana",2.3,"roja",3.1);
        Fruta manzana5 = new Fruta("Manzana",2.3,"roja",3.1);
        Fruta manzana6 = new Fruta("Manzana",2.3,"roja",3.1);

        NoPerecible lata= new NoPerecible("Elote",6.3,"Latas",123.12f);
        NoPerecible lata2= new NoPerecible("Elote",6.3,"Latas",123.12f);

        Lacteo lacteo1= new Lacteo("Leche",12.2, "de vaca",123.12f);

        bolsaFrutas.add(manzana)
                .add(manzana2).
                add(manzana3).
                add(manzana5).
                add(manzana4).
                add(manzana6);

        bolsaLimpieza.add(cloro)
                .add(cloro2)
                .add(cloro3);
        
        bolsaLacteos.add(lacteo1);
        
        bolsaNoperecibles.add(lata2).add(lata);
        
        for (Producto producto: bolsaLimpieza.getData()){
            System.out.println("producto: = " + producto.getNombre());
        }
        




    }
}
