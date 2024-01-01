package FlujoDeControl;

public class IfElse {
    public static void main(String[] args) {
        float promedio = 6.7f;
        boolean expresionEvaluada= promedio>7;

        // si la condicion de cumple
        if (expresionEvaluada){
            //resultado positivo(true)
            System.out.println("Promedio aprobatorio");
        }else {
            //resutado negativo(false)
            System.out.println("Promedio reprobatorio");
        }

    }
}
