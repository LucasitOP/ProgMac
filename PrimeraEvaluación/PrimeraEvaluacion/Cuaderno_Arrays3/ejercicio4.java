package Cuaderno_Arrays3;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array:");
        int tamaño = sc.nextInt();

        int[] array = new int[tamaño]; // Crear array de tamaño especificado
        int posicionesArray = 0;

        while (posicionesArray < tamaño) {
            int numero = (int) (Math.random() * 51 + 50); // Generar número aleatorio entre 50 y 100
            if (esPrimo(numero)) {
                array[posicionesArray] = numero; // Insertar número primo en el array
                posicionesArray++;
            }
        }

        System.out.println("Array generado: " + Arrays.toString(array));
        System.out.println("El mayor número primo es: " + encontrarMayor(array));

        sc.close();
    }

    // Método para comprobar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para encontrar el mayor número en el array
    public static int encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int num : array) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }
}
