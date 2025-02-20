package ArrayBidimensional3;

import java.util.Arrays;

public class ejercicio5 {

	public static void main(String[] args) {
		int arraybidimensional1[][] = { { 9, 7, 3, 4 }, { 2, 5, 2, 1, 9, 7 }, { 1, 9, 8 } };
		int arraybidimensional2[][] = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8, 5 }, { 4, 5 } };
		int maxfilas = 0;
		
		maxfilas=Math.max(arraybidimensional1.length, arraybidimensional2.length);
		
		int [][] suma= new int [maxfilas][];
		
		for (int i=0;i<maxfilas;i++) {
			int[] fila1=(i<arraybidimensional1.length)? arraybidimensional1[i]: new int[0];
			int[] fila2= (i<arraybidimensional2.length) ? arraybidimensional2[i] :new int[0];
			
			int maxcolumnas=Math.max(fila1.length, fila2.length);
			
			suma[i]=new int [maxcolumnas];
			
			for (int j=0;j<maxcolumnas;j++) {
			int valor1=(i<arraybidimensional1.length && j<arraybidimensional1[i].length)? arraybidimensional1[i][j]: 0;
			int valor2= (i<arraybidimensional2.length && j<arraybidimensional2[i].length)? arraybidimensional2[i][j]: 0;
			
			suma[i][j]=valor1+valor2;
			}
		}
		System.out.println(Arrays.deepToString(suma));
		
		
		
	}
	

}
