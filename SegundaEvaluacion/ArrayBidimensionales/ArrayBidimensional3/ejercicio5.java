package ArrayBidimensional3;

import java.util.Arrays;

public class ejercicio5 {

	public static void main(String[] args) {
		int arraybidimensional1[][] = { { 9, 7, 3, 4 }, { 2, 5, 2, 1, 9, 7 }, { 1, 9, 8 } };
		int arraybidimensional2[][] = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8, 5 }, { 4, 5 } };
		int maxfilas = 0,maxcolumnas=0;
		if (arraybidimensional1.length < arraybidimensional2.length) {
			maxfilas = arraybidimensional2.length;
		} else {
			maxfilas = arraybidimensional1.length;
		}
		int arraybidimensionalsuma[][] = new int[maxfilas][];
		for (int i=0;i<arraybidimensionalsuma.length;i++) {
			maxcolumnas=Math.max(arraybidimensional1[i].length, arraybidimensional2[i].length);
		arraybidimensionalsuma[i]=new int[maxcolumnas];
		}
		
		
		boolean suma = true;
		while (suma) {
		

		}

	}
	

}
