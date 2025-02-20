package ArrayBidimensional3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().trim();
        
        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+"); // Divide por espacios
        
        // Crear el array bidimensional de caracteres
        char[][] arrayBidimensional = new char[palabras.length][];
        
        for (int i = 0; i < palabras.length; i++) {
            arrayBidimensional[i] = palabras[i].toCharArray(); 
        }
        
        
        System.out.println(Arrays.deepToString(arrayBidimensional));
        
        sc.close();
    }
}

