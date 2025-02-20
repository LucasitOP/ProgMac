package Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoChat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Película a adivinar
        String pelicula = "Ted";
        pelicula = pelicula.toUpperCase(); // Convertir a mayúsculas para uniformidad
        char[] Pelicula = pelicula.toCharArray();

        // Crear una copia con guiones bajos para mostrar el progreso
        char[] copia = new char[Pelicula.length];
        Arrays.fill(copia, '_');

        // Variables para controlar el juego
        int intentosRestantes = 6; // Intentos permitidos
        boolean ganado = false;

        // Bucle principal del juego
        while (intentosRestantes > 0 && !ganado) {
            // Mostrar el progreso actual
            System.out.println("Progreso: " + Arrays.toString(copia));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Introduce una letra: ");

            String entrada = sc.next().toUpperCase(); // Leer entrada del usuario
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Por favor, introduce solo una letra válida.");
                continue; // Volver a pedir entrada
            }

            char letra = entrada.charAt(0);
            boolean encontrado = false;

            // Buscar la letra en la película
            for (int i = 0; i < Pelicula.length; i++) {
                if (Pelicula[i] == letra && copia[i] == '_') { // Letra no adivinada aún
                    copia[i] = letra;
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Letra incorrecta.");
                intentosRestantes--; // Reducir intentos si no se encontró la letra
            } else {
                System.out.println("¡Buena elección!");
            }

            // Comprobar si se ha ganado
            if (Arrays.equals(Pelicula, copia)) {
                ganado = true;
            }
        }

        // Resultado final
        if (ganado) {
            System.out.println("¡Felicidades! Has adivinado la película: " + pelicula);
        } else {
            System.out.println("Lo siento, has perdido. La película era: " + pelicula);
        }

        sc.close();
    }
}
