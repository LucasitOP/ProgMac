package ArrayBidimensional3;

import java.util.Arrays;

public class ejercicio5Beta {

    public static void main(String[] args) {
        int arraybidimensional1[][] = { { 9, 7, 3, 4 }, { 2, 5, 2, 1, 9, 7 }, { 1, 9, 8 } };
        int arraybidimensional2[][] = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8, 5 }, { 4, 5 } };

        int maxfilas = Math.max(arraybidimensional1.length, arraybidimensional2.length);

        int arraybidimensionalsuma[][] = new int[maxfilas][];

        for (int i = 0; i < maxfilas; i++) {
            int[] fila1 = (i < arraybidimensional1.length) ? arraybidimensional1[i] : new int[0];//operador ternario
            int[] fila2 = (i < arraybidimensional2.length) ? arraybidimensional2[i] : new int[0];

            int maxcolumnas = Math.max(fila1.length, fila2.length);

            arraybidimensionalsuma[i] = new int[maxcolumnas];

            for (int j = 0; j < maxcolumnas; j++) {
                int valor1 = (j < fila1.length) ? fila1[j] : 0;
                int valor2 = (j < fila2.length) ? fila2[j] : 0;
                arraybidimensionalsuma[i][j] = valor1 + valor2;
            }
        }
System.out.println(Arrays.deepToString(arraybidimensionalsuma));
     /* Foreach  
      * System.out.println("Array:");
        for (int[] fila : arraybidimensionalsuma) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }*/
    }
}
