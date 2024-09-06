package PatronesDiseno.observer;

public class EjemploObserver {
    public static void main(String[] args) {

        Coorporacion google= new Coorporacion("Google",1000);
        google.addObserver(
                (o,obj) ->
                        System.out.println("john"+((Coorporacion)o).getNombre()+
                                " Nuevo precio $"+((Coorporacion)o).getPrecio())
        );

        google.addObserver(
                (o,obj) ->
                        System.out.println("andres"+((Coorporacion)o).getNombre()+
                                " Nuevo precio $"+((Coorporacion)o).getPrecio())
        );

        google.addObserver(
                (o,obj) ->
                        System.out.println("maria"+((Coorporacion)o).getNombre()+
                                " Nuevo precio $"+((Coorporacion)o).getPrecio())
        );

        google.modificarPrecio(2000);
    }
}
