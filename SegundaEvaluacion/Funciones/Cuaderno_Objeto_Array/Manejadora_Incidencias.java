package Cuaderno_Objeto_Array;

import java.util.Scanner;


public class Manejadora_Incidencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Incidencias[] incidencia = new Incidencias[30]; // Array para gestionar 30 puestos

        boolean repetir = true;
        while (repetir) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    listado(incidencia);
                    break;
                case 2:
                    alta(sc, incidencia);
                    break;
                case 3:
                    baja(sc, incidencia);
                    break;
                case 4:
                    repetir = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
        sc.close(); // Cerrar el scanner al finalizar
    }

    // Función para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ DE INCIDENCIAS ---");
        System.out.println("1. Listado de incidencias");
        System.out.println("2. Alta de incidencia");
        System.out.println("3. Resolver incidencia (baja)");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para mostrar el listado de incidencias
    public static void listado(Incidencias[] incidencia) {
        boolean hayIncidencias = false;

        for (int i = 0; i < incidencia.length; i++) {
            if (incidencia[i] != null) {
                System.out.println(incidencia[i]);
                hayIncidencias = true;
            }
        }

        if (!hayIncidencias) {
            System.out.println("No existe ninguna incidencia registrada.");
        }
    }

    // Método para dar de alta una nueva incidencia
    public static void alta(Scanner sc, Incidencias[] incidencia) {
        System.out.print("Introduce el puesto (1-30): ");
        int puesto = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        // Verificar si el puesto está dentro del rango válido
        if (puesto < 1 || puesto > 30) {
            System.out.println("Número de puesto inválido. Debe estar entre 1 y 30.");
            return;
        }

        // Ajustar índice porque el array va de 0 a 29 pero los puestos son del 1 al 30
        int index = puesto - 1;

        // Comprobar si ya hay una incidencia en ese puesto
        if (incidencia[index] != null && !incidencia[index].getEstado().equals("RESUELTA")) {
            System.out.println("Ya existe una incidencia pendiente en este puesto. Debe resolverse antes de crear otra.");
        } else {
            System.out.print("Introduce la descripción de la incidencia: ");
            String motivo = sc.nextLine();
            incidencia[index] = new Incidencias(puesto, motivo);
            System.out.println("Incidencia registrada correctamente.");
        }
    }

    // Método para resolver (dar de baja) una incidencia
    public static void baja(Scanner sc, Incidencias[] incidencia) {
        System.out.print("Introduce el puesto a resolver (1-30): ");
        int puesto = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        if (puesto < 1 || puesto > 30) {
            System.out.println("Número de puesto inválido. Debe estar entre 1 y 30.");
            return;
        }

        int index = puesto - 1;

        if (incidencia[index] != null && incidencia[index].getEstado().equals("PENDIENTE")) {
            incidencia[index].setEstado("RESUELTA");
            System.out.println("Incidencia resuelta correctamente.");
        } else {
            System.out.println("No hay incidencia pendiente en este puesto.");
        }
    }
}
