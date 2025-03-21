package Apoyoexamen;
import java.util.Arrays;
import java.util.Scanner;

public class MenuArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas usuario, ¿Qué tamaño quieres para el array?");
        int tamañoarray = sc.nextInt();
        int opcion = 0;
        int[] Arrayunidimensional = new int[tamañoarray];
        Arrays.fill(Arrayunidimensional, 0); // Inicializar el array con ceros (vacío)

        do {
            System.out.println("\nElige la opción que deseas realizar:");
            System.out.println("1. Agregar un elemento al array");
            System.out.println("2. Mostrar los elementos del array");
            System.out.println("3. Ordenar array");
            System.out.println("4. Buscar un elemento en el array");
            System.out.println("5. Eliminar un elemento del array");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // Agregar un elemento al array
                    boolean añadido = false;
                    for (int i = 0; i < Arrayunidimensional.length; i++) {
                        if (Arrayunidimensional[i] == 0) { // Encontrar la primera posición vacía
                            System.out.println("Introduce un número para agregar:");
                            Arrayunidimensional[i] = sc.nextInt();
                            System.out.println("Número añadido en la posición " + i);
                            añadido = true;
                            break;
                        }
                    }
                    if (!añadido) {
                        System.out.println("El array está lleno, no se pueden agregar más elementos.");
                    }
                    break;

                case 2: // Mostrar los elementos del array
                    System.out.println("Elementos del array:");
                    for (int i = 0; i < Arrayunidimensional.length; i++) {
                        System.out.println("Posición " + i + ": " + Arrayunidimensional[i]);
                    }
                    break;

                case 3: // Ordenar array
                    System.out.println("Ordenando el array...");
                    Arrays.sort(Arrayunidimensional);
                    System.out.println("Array ordenado: " + Arrays.toString(Arrayunidimensional));
                    break;

                case 4: // Buscar un elemento en el array
                    System.out.println("Introduce el elemento que quieres buscar:");
                    int elementoBuscar = sc.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < Arrayunidimensional.length; i++) {
                        if (Arrayunidimensional[i] == elementoBuscar) {
                            System.out.println("Elemento encontrado en la posición: " + i);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El elemento no se encuentra en el array.");
                    }
                    break;

                case 5: // Eliminar un elemento del array
                    System.out.println("Introduce el elemento que quieres eliminar:");
                    int elementoEliminar = sc.nextInt();
                    boolean eliminado = false;
                    for (int i = 0; i < Arrayunidimensional.length; i++) {
                        if (Arrayunidimensional[i] == elementoEliminar) {
                            System.out.println("Eliminando el elemento en la posición: " + i);
                            // Desplazar los elementos hacia la izquierda para evitar espacios vacíos
                            for (int j = i; j < Arrayunidimensional.length - 1; j++) {
                                Arrayunidimensional[j] = Arrayunidimensional[j + 1];
                            }
                            Arrayunidimensional[Arrayunidimensional.length - 1] = 0; // Último elemento a 0
                            eliminado = true;
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("El elemento no se encuentra en el array.");
                    }
                    break;

                case 6: // Salir
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, por favor elige una opción del menú.");
                    break;
            }
        } while (opcion != 6);

        sc.close();
    }
}
