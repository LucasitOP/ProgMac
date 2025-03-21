package Funciones;
import java.util.Scanner;

public class ejercicio1Charlie {

    // 1. Solicita al usuario un número y lo devuelve
    public static int solicitarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }

    // 2. Devuelve verdadero si el número que se pasa como parámetro es capicúa
    public static boolean esCapicua(int numero) {
        int numeroinvertido = 0, original = numero;

        // Invierte el número
        while (numero > 0) {
            int digito = numero % 10;
            numeroinvertido = numeroinvertido * 10 + digito;
            numero /= 10;
        }

        // Compara el original con el invertido
        return original == numeroinvertido;
    }

    // 3. Devuelve verdadero si el número que se pasa como parámetro es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 4. Devuelve el menor primo que es mayor al número que se pasa como parámetro
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;

        // Busca el siguiente número primo
        while (!esPrimo(siguiente)) {
            siguiente++;
        }

        return siguiente;
    }

    // 5. Le da la vuelta a un número y lo devuelve
    public static int voltea(int numero) {
        int numeroVolteado = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroVolteado = numeroVolteado * 10 + digito;
            numero /= 10;
        }

        return numeroVolteado;
    }

    // 6. Muestra por pantalla la cadena que le llega como parámetro
    public static void pintarPorPantalla(String mensaje) {
        System.out.println(mensaje);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Solicita un número al usuario
        int numero = solicitarNumero();

        // Muestra los resultados usando pintarPorPantalla
        pintarPorPantalla("Es capicúa: " + esCapicua(numero));
        pintarPorPantalla("Es primo: " + esPrimo(numero));
        pintarPorPantalla("Siguiente primo: " + siguientePrimo(numero));
        pintarPorPantalla("Número invertido: " + voltea(numero));
    }
}
