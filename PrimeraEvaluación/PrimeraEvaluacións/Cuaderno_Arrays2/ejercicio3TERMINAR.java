package Cuaderno_Arrays2;

import java.util.Arrays;

public class ejercicio3TERMINAR {

    public static void main(String[] args) {
        String frase = "Esta es la frase que vamos a partir";
        frase = frase.trim(); // Eliminar espacios iniciales y finales

        int contador = 0;

        // Contar los espacios para determinar el número de palabras
        for (int u = 0; u < frase.length(); u++) {
            if (Character.isWhitespace(frase.charAt(u))) {
                contador++;
            }
        }

        // El número de palabras es el número de espacios + 1
        String[] partir = new String[contador + 1];
        int indiceSub = 0;
        int inicioFrase = 0;

        // Recorrer la frase para separar las palabras
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isWhitespace(frase.charAt(i))) {
                // Extraer palabra desde inicioFrase hasta i (no inclusive)
                partir[indiceSub] = frase.substring(inicioFrase, i);
                indiceSub++;
                inicioFrase = i + 1; // Actualizar el inicio para la siguiente palabra
            }
        }

        // Añadir la última palabra después del último espacio
        partir[indiceSub] = frase.substring(inicioFrase);

        // Imprimir el array resultante
        System.out.println(Arrays.toString(partir));
    }
}