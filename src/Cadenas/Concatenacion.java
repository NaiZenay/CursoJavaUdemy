package Cadenas;

public class Concatenacion {
    public static void main(String[] args) {
        String comida="Pan";
        String bebida="Cafe";

        //Operador de suma
        System.out.println(bebida+" con "+comida);//Crea por de bajo una instancia de la clase StringBuilder

        //Metedo concat
        System.out.println(comida.concat(" con ").concat(bebida));//Crea por debajo otro objeto String

        //Metodo transform
        String transform=(comida.transform(c -> {
                    return comida+" con " + bebida;
        }));
        System.out.println("transform = " + transform);

        //String builder
        StringBuilder sb = new StringBuilder();//Objeto string builder
        sb.append(bebida).append(" con ").append(comida);//La forma mas optimizada de concatenar cadenas
    }
}
