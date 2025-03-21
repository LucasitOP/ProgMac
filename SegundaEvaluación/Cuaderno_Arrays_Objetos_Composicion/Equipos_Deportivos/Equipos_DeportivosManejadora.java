package Equipos_Deportivos;

import java.util.Scanner;

public class Equipos_DeportivosManejadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean repetir = true;
        Equipo equipo = new Equipo();

        do {
            System.out.println("Introduce opción:\n1. Crear Equipo\n2. Añadir jugador al equipo\n3. Imprimir la lista de jugadores\n4. Buscar un jugador por número\n5. Salir");
            
            while (!sc.hasNextInt()) { 
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); 
            }
            
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearEquipo(sc, equipo);
                    break;
                case 2:
                    anadirJugador(sc, equipo);
                    break;
                case 3:
                    imprimirJugadores(equipo);
                    break;
                case 4:
                    buscarJugador(sc, equipo);
                    break;
                case 5:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
                    break;
            }
        } while (repetir);
        sc.close();
    }

    public static void crearEquipo(Scanner sc, Equipo equipo) {
        System.out.println("Añade el nombre del equipo:");
        equipo.setNombre(sc.nextLine());
        System.out.println("Equipo creado correctamente: " + equipo.getNombre());
    }

    public static void anadirJugador(Scanner sc, Equipo equipo) {
        System.out.println("Vamos a añadir un jugador:");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Posición: ");
        String posicion = sc.nextLine();

        System.out.print("Número: ");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido.");
            sc.next();
        }
        int numero = sc.nextInt();
        sc.nextLine();

        Jugador nuevoJugador = new Jugador(nombre, posicion, numero);

        boolean jugadorAnadido = false;
        Jugador[] jugadores = equipo.getJugadores();
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = nuevoJugador;
                jugadorAnadido = true;
                System.out.println("Jugador añadido correctamente.");
                break;
            }
        }
        if (!jugadorAnadido) {
            System.out.println("No se puede añadir más jugadores, el equipo está lleno.");
        }
    }

    public static void imprimirJugadores(Equipo equipo) {
        Jugador[] jugadores = equipo.getJugadores();
        boolean hayJugadores = false;

        for (Jugador jugador : jugadores) {
            if (jugador != null) {
                System.out.println(jugador);
                hayJugadores = true;
            }
        }

        if (!hayJugadores) {
            System.out.println("No hay jugadores en el equipo.");
        }
    }

    public static void buscarJugador(Scanner sc, Equipo equipo) {
        System.out.print("Introduce el número del jugador a buscar: ");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido.");
            sc.next();
        }
        int numero = sc.nextInt();
        sc.nextLine();

        for (Jugador jugador : equipo.getJugadores()) {
            if (jugador != null && jugador.getNumero() == numero) {
                System.out.println("Jugador encontrado: " + jugador);
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }
}


