package Ejercicios.PersonasEmpresa;
/*
Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable) y a todos los empleados se les puede aumentar el sueldo, se pide una jerarquía de clase de los tipos de persona mencionados, tomando como base la figura del diagrama UML de clases.

Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con sobre-escritura, para Gerente además el método setter de presupuesto.

También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().
 */
public class main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ricardo","Jimenez","B83762910","Monte Olmipo 3303", 9234.43,123);
        gerente.setPresupuesto(800000);
        System.out.println(gerente.toString());
        gerente.aumentarRemuneracion(15);
        System.out.println(gerente.getRemuneracion());
    }
}
