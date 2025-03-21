package Apoyoexamen;

import java.util.Scanner;

public class ParesONones {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Variables principales
        int contadormio = 0;
        int contadorsuyo = 0;
        int contadorpartidas = 0;
        String usuario;
        int suma;

        // Bucle principal del juego
        do {
            System.out.println("Tu (usuario) contador = " + contadorsuyo + ", Mi (máquina) contador = " + contadormio);
            System.out.println("¿Qué prefieres, pares o nones? (par/nones)");
            usuario = lector.next().toLowerCase();

            // Validar la entrada del usuario
            if (!usuario.equals("par") && !usuario.equals("nones")) {
                System.out.println("Entrada no válida. Inténtalo de nuevo.");
                continue;
            }

            // Pedir número al usuario
            System.out.println("Elige un número del 0 al 5:");
            int sunumero = lector.nextInt();

            // Validar el número del usuario
            if (sunumero < 0 || sunumero > 5) {
                System.out.println("Número fuera de rango. Inténtalo de nuevo.");
                continue;
            }

            // Generar número aleatorio para la máquina
            int numeroprop = (int) (Math.random() * 6); // Números entre 0 y 5
            System.out.println("Mi número = " + numeroprop + ", Tu número = " + sunumero);

            // Calcular la suma
            suma = numeroprop + sunumero;
            System.out.println("La suma de los dos números es: " + suma);

            // Verificar si el resultado es par o impar
            boolean esPar = (suma % 2 == 0);
            if ((esPar && usuario.equals("par")) || (!esPar && usuario.equals("nones"))) {
                System.out.println("¡Ganas esta ronda!");
                contadorsuyo++;
            } else {
                System.out.println("Gano esta ronda.");
                contadormio++;
            }

            // Incrementar el contador de partidas
            contadorpartidas++;

        } while (contadormio < 10 && contadorsuyo < 10);

        // Resultado final
        System.out.println("Hemos jugado " + contadorpartidas + " partidas.");
        if (contadormio > contadorsuyo) {
            System.out.println("¡He ganado en total!");
        } else {
            System.out.println("¡Has ganado en total!");
        }

        lector.close();
    }
}
