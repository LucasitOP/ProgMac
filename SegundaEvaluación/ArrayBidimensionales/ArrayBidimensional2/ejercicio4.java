package ArrayBidimensional2;

import java.util.Arrays;

/*
 *  Dada una matriz cuadrada obtener cual es la suma de todos los elementos que
componen las dos diagonales.
Probarlo con:
{{1, 2, 3, 4, 5},
{ 6, 7, 8, 9,10},
{11,12,13,14,15},
{16,17,18, 9,20},
{21,22,23,24,25}}

 */
public class ejercicio4 {

	public static void main(String[] args) {
		int [][]matriz={{1, 2, 3, 4, 5},
				{ 6, 7, 8, 9,10},
				{11,12,13,14,15},
				{16,17,18, 19,20},
				{21,22,23,24,25}};
		int diagonal1=0;
		int diagonal2=0;
		
		for (int i=0;i<matriz.length;i++) {
		diagonal1 += matriz[i][i];	
		}
		for (int j=0;j<matriz.length;j++) {
			diagonal2 += matriz[(matriz.length-1)-j][j];
		}
		System.out.println(Arrays.deepToString(matriz));
		System.out.println("1ª Diagonal:"+diagonal1);
		System.out.println("2ªDiagonal:"+diagonal2+"\n Suma total:"+(diagonal1+diagonal2));
	}

}
