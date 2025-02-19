package TiendaAnimalesChat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear el array bidimensional de animales
        Animal[][] animales = new Animal[3][];
        animales[0] = new Animal[8]; // Peces
        animales[1] = new Animal[5]; // Periquitos
        animales[2] = new Animal[7]; // Tortugas

        // Bucle del menú principal
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1 - Venta de Animal");
            System.out.println("2 - Adquisición de Nuevo Animal");
            System.out.println("3 - Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                venderAnimal(sc, animales);
            } else if (opcion == 2) {
                adquirirAnimal(sc, animales);
            } else if (opcion == 3) {
                salir(animales);
                break; // Salir del bucle y terminar el programa
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    // Método venderAnimal (ya dado anteriormente)
    // Método adquirirAnimal (ya dado anteriormente)
    // Método salir (ya dado anteriormente)


public static void venderAnimal(Scanner sc, Animal[][] animales) {
    System.out.println("Introduce el animal que quieres vender:\n1 - Pez\n2 - Periquito\n3 - Tortuga");
    int opcion = sc.nextInt();
    sc.nextLine(); // Limpiar buffer

    int fila = -1;
    String tipoAnimal = "";

    switch (opcion) {
        case 1:
            fila = 0;
            tipoAnimal = "Pez";
            break;
        case 2:
            fila = 1;
            tipoAnimal = "Periquito";
            break;
        case 3:
            fila = 2;
            tipoAnimal = "Tortuga";
            break;
        default:
            System.out.println("Opción no válida.");
            return;
    }

    // Mostrar lista de animales disponibles
    System.out.println("Animales disponibles (" + tipoAnimal + "s):");
    boolean hayAnimales = false;
    for (int i = 0; i < animales[fila].length; i++) {
        if (animales[fila][i] != null) {
            System.out.println((i + 1) + " - " + animales[fila][i]);
            hayAnimales = true;
        }
    }

    if (!hayAnimales) {
        System.out.println("No hay " + tipoAnimal + "s disponibles para la venta.");
        return;
    }

    // Seleccionar qué animal vender
    System.out.println("Seleccione el número del animal a vender:");
    int posicion = sc.nextInt() - 1;

    if (posicion < 0 || posicion >= animales[fila].length || animales[fila][posicion] == null) {
        System.out.println("Selección inválida.");
        return;
    }

    // Calcular beneficio y eliminar el animal
    double beneficio = animales[fila][posicion].getBeneficio();
    System.out.println("Beneficio obtenido: " + beneficio + "€");

    animales[fila][posicion] = null;
}
public static void adquirirAnimal(Scanner sc, Animal[][] animales) {
    System.out.println("Introduce el animal que deseas comprar:\n1 - Pez\n2 - Periquito\n3 - Tortuga");
    int opcion = sc.nextInt();
    sc.nextLine(); // Limpiar buffer

    int fila = -1;
    String tipoAnimal = "";
    
    switch (opcion) {
        case 1:
            fila = 0;
            tipoAnimal = "Pez";
            break;
        case 2:
            fila = 1;
            tipoAnimal = "Periquito";
            break;
        case 3:
            fila = 2;
            tipoAnimal = "Tortuga";
            break;
        default:
            System.out.println("Opción no válida.");
            return;
    }

    // Buscar hueco en el array de animales
    boolean huecoDisponible = false;
    for (int i = 0; i < animales[fila].length; i++) {
        if (animales[fila][i] == null) {
            huecoDisponible = true;
            break;
        }
    }

    if (!huecoDisponible) {
        System.out.println("No hay espacio disponible para adquirir un nuevo " + tipoAnimal + ".");
        return;
    }

    // Solicitar los datos necesarios para la compra según el tipo de animal
    if (tipoAnimal.equals("Pez")) {
        System.out.println("Introduce el nombre del pez:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la temperatura del agua (entre 24 y 27°C):");
        double temperaturaAgua = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer

        // Añadir el nuevo pez al array
        for (int i = 0; i < animales[fila].length; i++) {
            if (animales[fila][i] == null) {
                animales[fila][i] = new Pez(nombre, temperaturaAgua);
                System.out.println("Pez adquirido exitosamente.");
                break;
            }
        }

    } else if (tipoAnimal.equals("Periquito")) {
        System.out.println("Introduce el nombre del periquito:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el color del plumaje (verde o azul):");
        String color = sc.nextLine();

        // Añadir el nuevo periquito al array
        for (int i = 0; i < animales[fila].length; i++) {
            if (animales[fila][i] == null) {
                animales[fila][i] = new Periquito(nombre, color);
                System.out.println("Periquito adquirido exitosamente.");
                break;
            }
        }

    } else if (tipoAnimal.equals("Tortuga")) {
        System.out.println("Introduce el nombre de la tortuga:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el tipo de orejas (orejas rojas o orejas amarillas):");
        String tipoOrejas = sc.nextLine();

        // Añadir la nueva tortuga al array
        for (int i = 0; i < animales[fila].length; i++) {
            if (animales[fila][i] == null) {
                animales[fila][i] = new Tortuga(nombre, tipoOrejas);
                System.out.println("Tortuga adquirida exitosamente.");
                break;
            }
        }
    }
}

public static void salir(Animal[][] animales) {
    double beneficioTotal = 0.0;

    System.out.println("\nListado de animales actuales:");
    for (int i = 0; i < animales.length; i++) {
        String tipoAnimal = "";
        if (i == 0) tipoAnimal = "Pez";
        if (i == 1) tipoAnimal = "Periquito";
        if (i == 2) tipoAnimal = "Tortuga";

        System.out.println("\n" + tipoAnimal + "s:");
        for (int j = 0; j < animales[i].length; j++) {
            if (animales[i][j] != null) {
                System.out.println(animales[i][j]);
                beneficioTotal += animales[i][j].getBeneficio();
            }
        }
    }

    System.out.println("\nBeneficio total obtenido por las ventas: " + beneficioTotal + "€");
}

}