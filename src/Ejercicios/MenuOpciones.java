package Ejercicios;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Scanner;

public class MenuOpciones {
    /*
    Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.
    Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.

    "Actualizar", 1
    "Eliminar", 2
    "Agregar", 3
    "Listar", 4
    "Salir", 5

     Según el numero ingresado implementar cada una de las 4 operaciones y 5 para salir.
    Dentro de cada sentencia un texto relacionado a la opción, por ejemplo para actualizar:
    "Usuario actualizado correctamente"
    Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.
    iterar hasta que la opción sea salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje "Haz salido con exito!" y finalizar el programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean opcionValida;
        boolean salir;
        int opcion=0;
        do {
            salir=false;
            System.out.println("Ingresa la operacion a realizar\n" +
                    " 1)ACTUALIZAR \n 2)ELIMINAR \n 3)AGREGAR \n 4)LISTAR \n 5)SALIR");
            do {
                try {
                    opcionValida=true;
                    opcion = scanner.nextInt();

                }catch (NumberFormatException NFE){
                    System.out.println("Eso no es un numero");
                    opcionValida=false;
                }
                if (opcion<0 ||opcion >5){
                    opcionValida=false;
                }
                switch (opcion) {
                    case 1:
                        System.out.println("Usuario actualizado");
                        salir=false;
                        break;
                    case 2:
                        System.out.println("Usuario Eliminado");
                        salir=false;
                        break;
                    case 3:
                        System.out.println("Usuario Agregado");
                        salir=false;
                        break;
                    case 4:
                        System.out.println("Lista de usuarios:");
                        salir=false;
                        break;
                    case 5:
                        System.out.println("Programa finalizado");
                        salir=true;
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        System.out.println("Ingrese una de las 5 opciones \n"+
                                " 1)ACTUALIZAR \n 2)ELIMINAR \n 3)AGREGAR \n 4)LISTAR \n 5)SALIR");
                        opcionValida=false;
                        break;
                }
            }while (!opcionValida);
        }while (!salir);


    }


}
