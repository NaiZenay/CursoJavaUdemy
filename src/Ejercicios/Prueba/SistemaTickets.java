package Ejercicios.Prueba;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class SistemaTickets {
    private List<Ticket> ticketsExistencia;
    private List<Cliente> listaClientes;
    Cliente clienteEnSesion;

    private char[][] asientos = new char[10][10];
    private Scanner scanner = new Scanner(System.in);

    public void setClienteEnSesion(Cliente clienteEnSesion) {
        this.clienteEnSesion = clienteEnSesion;
        menu();
    }

    public SistemaTickets() {
        ticketsExistencia = new ArrayList<>();
        listaClientes = new ArrayList<>();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                ticketsExistencia.add(new Ticket(i, j));
                asientos[i][j] = 'L';
            }
        }
    }

    private void registrarCliente() {
        System.out.println("Ingrese su nombre");
        String nombreCliente = scanner.next();
        System.out.println("Ingrese su apellido");
        String apellidoCliente = scanner.next();
        System.out.println("Ingrese su DNI");
        String dniCliente = scanner.next();
        Cliente nuevoCliente = new Cliente(nombreCliente, apellidoCliente, dniCliente);
        listaClientes.add(nuevoCliente);
        setClienteEnSesion(listaClientes.getLast());
    }

    private boolean Validarlogin(String nombreCliente, String dniCliente) {
        AtomicBoolean autenticado = new AtomicBoolean(false);
        listaClientes.forEach(cliente -> {
            if (dniCliente.equalsIgnoreCase(cliente.getDni()) && nombreCliente.equalsIgnoreCase(cliente.getNombre())) {
                autenticado.set(true);
                setClienteEnSesion(cliente);
            } else {
                autenticado.set(false);
            }
        });
        return autenticado.get();
    }

    private void login() {
        System.out.println("Ingrese su nombre");
        String nombreCliente = scanner.next();
        System.out.println("Ingrese su DNI");
        String dniCliente = scanner.next();
        if (Validarlogin(nombreCliente, dniCliente)) {
            menu();
        } else {
            System.out.println("No se econtro su registro");
            menuInicio();
        }
    }

    public void menuInicio() {
        clienteEnSesion=null;
        System.out.println("Por favor elija una opcion\n" +
                "1)Iniciar Sesion\n" +
                "2)Registrarse\n" +
                "3)Salir\n");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                login();
                break;
            case 2:
                registrarCliente();
                login();
                break;
            case 3:
                System.out.println("Programa Finalizado");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }


    }


    private void mostrarAsientos() {
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

    private void asientosComprados(Cliente clienteEnSesion) {
        if (clienteEnSesion.getTicketsComprados().isEmpty()){
            System.out.println(clienteEnSesion.getNombre()+" Aun no ha comprado ningun ticket");
        }else {
            clienteEnSesion.getTicketsComprados().forEach(ticket -> {
                System.out.println(ticket.toString());
                System.out.println("//////////////////////////////////////////////////////");
            });
        }
    }

    private void mostrarAsientosLibres() {
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


    public void menu() {
        int option = 0;
        boolean opcionValida;
        do {
            opcionValida = true;
            System.out.println("\nSelecciona la operacion a realizar " + clienteEnSesion.getNombre() + "\n" +
                    "1)Reservar asiento\n" +
                    "2)Mostrar asientos comprados\n" +
                    "3)Mostrar asientos Libres\n" +
                    "4)Cerrar Sesion");
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
                asientosComprados(clienteEnSesion);
                menu();
                break;
            case 3:
                mostrarAsientosLibres();
                menu();
                break;
            case 4:
                System.out.println("Sesion cerrada");
                menuInicio();
            default:
                System.out.println("Eso no es una opcion");
                menu();
        }

    }

    private void reservarAsiento() {
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

    private boolean validarAsiento(int numFila, int numColumna) {
        boolean validacion;
        if (numFila - 1 > 10 || numColumna - 1 > 10) {
            System.out.println("Ese asiento no existe por favor elige otro");
            validacion = false;
        } else if (asientos[numFila - 1][numColumna - 1] == 'X') {
            System.out.println("Este asiento ya ha sido reservado por favor elige otro");
            validacion = false;
        } else {
            buscarTicket(numFila, numColumna).comprado(clienteEnSesion);
            clienteEnSesion.setTicketsComprados(buscarTicket(numFila, numColumna));
            asientos[numFila - 1][numColumna - 1] = 'X';
            System.out.println(buscarTicket(numFila, numColumna).toString());
        }
        mostrarAsientos();
        validacion = true;
        return validacion;
    }

    private Ticket buscarTicket(int numFila, int numColumna) {
        AtomicReference<Ticket> ticketBuscado = new AtomicReference<>(new Ticket());
        this.ticketsExistencia.forEach(ticket -> {
            if (ticket.getNumeroFila() == numFila && ticket.getNumAsiento() == numColumna) {
                ticketBuscado.set(ticket);
            }
        });
        return ticketBuscado.get();

    }

}
