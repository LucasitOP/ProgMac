package CuadernoThrowYthrows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Programa2 {
    public static void main(String[] args) {
        Random random = new Random();
        int opcion = random.nextInt(5) + 1; 

        try {
            switch (opcion) {
                case 1:
                    lanzaNumberFormatException();
                    break;
                case 2:
                    new Programa2().lanzaIOException();
                    break;
                case 3:
                    new Programa2().lanzaFileNotFoundException();
                    break;
                case 4:
                    lanzaIndexOutOfBoundsException();
                    break;
                case 5:
                    lanzaArithmeticException();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } catch (IOException e) {
            System.out.println("Se capturó una excepción: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public static void lanzaNumberFormatException() {
        try {
            Integer.parseInt("abc"); 
        } catch (NumberFormatException nfe) {
            System.out.println("Se lanzó NumberFormatException: " + nfe.getMessage());
        }
    }

    public void lanzaIOException() throws IOException {
        throw new IOException("Error de entrada/salida simulado.");
    }

    public void lanzaFileNotFoundException() throws FileNotFoundException {
        throw new FileNotFoundException("Archivo no encontrado.");
    }

    public static void lanzaIndexOutOfBoundsException() {
        try {
            int[] array = new int[2];
            int valor = array[5]; 
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Se lanzó IndexOutOfBoundsException: " + iobe.getMessage());
        }
    }

    public static void lanzaArithmeticException() {
        try {
            int resultado = 10 / 0; 
        } catch (ArithmeticException ae) {
            System.out.println("Se lanzó ArithmeticException: " + ae.getMessage());
        }
    }
}
