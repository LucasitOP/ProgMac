package ArrayBidimensional2;

import java.util.Arrays;

public class ejercicio5 {		    public static void main(String[] args) {
		        int filas = 4, columnas = 5;
		        int[][] matriz = new int[filas][columnas];

		        int sumaTotal = 0; 

		        for (int i = 0; i < filas - 1; i++) {
		            int sumaFila = 0;
		            for (int j = 0; j < columnas - 1; j++) {
		                matriz[i][j] = (int) (Math.random() * (999 - 100 + 1) + 100);
		                sumaFila += matriz[i][j]; 
		                matriz[filas - 1][j] += matriz[i][j]; 
		            }
		            matriz[i][columnas - 1] = sumaFila; 
		            sumaTotal += sumaFila;
		        }

		        for (int j = 0; j < columnas - 1; j++) {
		            sumaTotal += matriz[filas - 1][j];
		        }

		        matriz[filas - 1][columnas - 1] = sumaTotal;

		        for (int[] fila : matriz) {
		            System.out.println(Arrays.toString(fila));
		        }
		    }
		}


