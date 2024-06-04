package Ejercicios.Prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaTecnica {

    static char[][] asientos = new char[10][10];

    static Scanner scanner = new Scanner(System.in);

    static void mostrarAsientos() {
        System.out.println("-------------------- ");
        System.out.print("1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < asientos.length; i++) {
            System.out.println();
            for (int j = 0; j < asientos.length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.print(i + 1);
        }
    }

    static void mostrarAsientosLibres() {
        System.out.println("-------------------- ");
        System.out.print("1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < asientos.length; i++) {
            System.out.println();
            for (int j = 0; j < asientos.length; j++) {
                if (asientos[i][j] != 'X') {
                    System.out.print(asientos[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print(i + 1);
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                asientos[i][j] = 'L';
            }
        }
        menu();
    }

    static void menu() {
        int option = 0;
        boolean opcionValida;
        do {
            opcionValida = true;
            System.out.println("\nSelecciona la operacion a realizar\n" +
                    "1)Reservar asiento\n" +
                    "2)Mostrar asientos\n" +
                    "3)Mostrar asientos Libres\n" +
                    "4)Salir");
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Opcion invalida");
                opcionValida = false;
                scanner.next();
            }
        } while (!opcionValida);

        switch (option) {
            case 1:
                reservarAsiento();
                menu();
                break;
            case 2:
                mostrarAsientos();
                menu();
                break;
            case 3:
                mostrarAsientosLibres();
                menu();
                break;
            case 4:
                System.out.println("Programa finalizado");
                System.exit(0);
            default:
                System.out.println("Eso no es una opcion");
                menu();
        }

    }

    static void reservarAsiento() {
        boolean opcionValida;
        int asientosAreservar = 0;

        do {
            opcionValida = true;

            System.out.println("Cuantos asientos quieres reservar?");
            try {
                asientosAreservar = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Opcion invalida");
                opcionValida = false;
                scanner.next();
            }
        } while (!opcionValida);

        for (int i = 0; i < asientosAreservar; i++) {
            boolean asientoLibre;
            do {

                System.out.println("\nQue asiento quieres reservar?\n" +
                        "La linea es la pantalla\n" +
                        "Las 'L' son asientos Libres y las 'X' son los asientos ocupados");
                mostrarAsientos();

                int fila = 0;
                int columna = 0;

                System.out.println("\nSelecciona primero una fila y luego la columna");
                boolean filaValida, columnaValida;
                do {
                    try {
                        filaValida = true;
                        columnaValida = true;
                        System.out.print("Fila:");
                        fila = scanner.nextInt();
                        System.out.print("Columna:");
                        columna = scanner.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("Opcion invalida");
                        scanner.next();
                        filaValida = false;
                        columnaValida = false;
                    }
                } while (!filaValida || !columnaValida);

                asientoLibre = validarAsiento(fila, columna);
            } while (!asientoLibre);
        }


    }

    static boolean validarAsiento(int numFila, int numColumna) {
        boolean validacion;
        if (numFila - 1 > 10 || numColumna - 1 > 10) {
            System.out.println("Ese asiento no existe por favor elige otro");
            validacion = false;
        } else if (asientos[numFila - 1][numColumna - 1] == 'X') {
            System.out.println("Este asiento ya ha sido reservado por favor elige otro");
            validacion = false;
        } else asientos[numFila - 1][numColumna - 1] = 'X';
        mostrarAsientos();
        validacion = true;
        return validacion;
    }
}
