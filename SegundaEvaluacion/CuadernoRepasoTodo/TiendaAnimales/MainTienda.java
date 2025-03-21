package TiendaAnimales;

import java.util.Scanner;

public class MainTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[][] animales = new Animal[3][];
        animales[0] = new Peces[8];
        animales[1] = new Periquitos[5];
        animales[2] = new Tortugas[7];

        double beneficioTotal = 0;
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    beneficioTotal += venderAnimal(sc, animales);
                    break;
                case 2:
                    agregarNuevoAnimal(sc, animales);
                    break;
                case 3:
                    mostrarInventario(animales);
                    System.out.println("Beneficio total obtenido: " + beneficioTotal);
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nIntroduce la opción que deseas realizar:");
        System.out.println("1 - Venta de un Animal");
        System.out.println("2 - Adquisición de un nuevo Animal");
        System.out.println("3 - Salir");
        System.out.print("Opción: ");
    }

    public static double venderAnimal(Scanner sc, Animal[][] animales) {
        System.out.print("\nIntroduce el animal que quieres vender (Pez, Periquito, Tortuga): ");
        String tipo = sc.next().toLowerCase();
        sc.nextLine(); // Limpiar buffer

        int fila = obtenerFilaAnimal(tipo);
        if (fila == -1) {
            System.out.println("Tipo de animal no válido.");
            return 0;
        }

        // Mostrar animales disponibles
        int disponibles = 0;
        for (int i = 0; i < animales[fila].length; i++) {
            if (animales[fila][i] != null) {
                System.out.println((i + 1) + " - " + animales[fila][i]);
                disponibles++;
            }
        }

        if (disponibles == 0) {
            System.out.println("No hay animales de este tipo disponibles.");
            return 0;
        }

        System.out.print("Seleccione el número del animal a vender: ");
        int posicion = sc.nextInt() - 1;
        sc.nextLine(); // Limpiar buffer

        if (posicion < 0 || posicion >= animales[fila].length || animales[fila][posicion] == null) {
            System.out.println("Selección inválida.");
            return 0;
        }

        double beneficio = animales[fila][posicion].getBeneficio();
        System.out.println("Animal vendido con éxito. Beneficio obtenido: " + beneficio);
        animales[fila][posicion] = null;
        return beneficio;
    }

    public static void agregarNuevoAnimal(Scanner sc, Animal[][] animales) {
        System.out.print("\nIntroduce el tipo de animal que quieres agregar (Pez, Periquito, Tortuga): ");
        String tipo = sc.next().toLowerCase();
        sc.nextLine();

        int fila = obtenerFilaAnimal(tipo);
        if (fila == -1) {
            System.out.println("Tipo de animal no válido.");
            return;
        }

        for (int i = 0; i < animales[fila].length; i++) {
            if (animales[fila][i] == null) {
                animales[fila][i] = crearAnimal(sc, tipo);
                System.out.println("Animal agregado con éxito.");
                return;
            }
        }
        System.out.println("No hay espacio para más " + tipo + "s.");
    }

    public static void mostrarInventario(Animal[][] animales) {
        System.out.println("\nInventario de la tienda:");
        for (Animal[] fila : animales) {
            for (Animal a : fila) {
                if (a != null) {
                    System.out.println(a);
                }
            }
        }
    }

    public static int obtenerFilaAnimal(String tipo) {
        return switch (tipo) {
            case "pez" -> 0;
            case "periquito" -> 1;
            case "tortuga" -> 2;
            default -> -1;
        };
    }
    public static Animal crearAnimal(Scanner sc, String tipo) {
        System.out.print("Introduce el nombre del animal: ");
        String nombre = sc.nextLine();

        switch (tipo) {
            case "pez":
                System.out.print("Introduce la temperatura del agua: ");
                int temperatura = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                return new Peces(nombre, 2, temperatura);

            case "periquito":
                System.out.print("Introduce el color del periquito (VERDE/AZUL): ");
                String colorStr = sc.next().toUpperCase();
                sc.nextLine(); // Limpiar buffer

                try {
                    ColorPlumaje color = ColorPlumaje.valueOf(colorStr);
                    return new Periquitos(nombre, 1, color);
                } catch (IllegalArgumentException e) {
                    System.out.println("Color inválido. Se asignará VERDE por defecto.");
                    return new Periquitos(nombre, 1, ColorPlumaje.VERDE);
                }

            case "tortuga":
                System.out.print("Introduce el tipo de oreja de la tortuga (ROJO/AMARILLO): ");
                String orejaStr = sc.next().toUpperCase();
                sc.nextLine(); // Limpiar buffer

                try {
                    TipoOreja oreja = TipoOreja.valueOf(orejaStr);
                    return new Tortugas(nombre, 1, oreja);
                } catch (IllegalArgumentException e) {
                    System.out.println("Tipo de oreja inválido. Se asignará ROJO por defecto.");
                    return new Tortugas(nombre, 1, TipoOreja.ROJO);
                }

            default:
                System.out.println("Tipo de animal no válido.");
                return null;
        }
    }

}
