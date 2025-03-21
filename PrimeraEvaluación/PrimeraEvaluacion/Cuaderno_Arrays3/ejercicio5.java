package Cuaderno_Arrays3;
/*
 * Calcula la letra de un DNI, para ello pediremos el DNI por teclado (captura un texto
y conviértelo a entero) y el programa calculará la letra y nos mostrará el DNI
completo.
 */
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tabla de letras según el resto de la división por 23
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
                            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};

        System.out.println("Introduce el número del DNI (sin letra):");

        try {
            // Leer el número del DNI
            int numeroDNI = sc.nextInt();

            if (numeroDNI < 0 || String.valueOf(numeroDNI).length() > 8) {
                System.out.println("El número del DNI no es válido.");
            } else {
                // Calcular el resto
                int resto = numeroDNI % 23;

                // Obtener la letra correspondiente
                char letra = letrasDNI[resto];

                // Mostrar el DNI completo con su letra
                System.out.println("El DNI completo es: " + numeroDNI + letra);
            }
        } catch (Exception e) {
            System.out.println("Entrada no válida. Por favor, introduce un número entero.");
        }

        sc.close();
    }
}
