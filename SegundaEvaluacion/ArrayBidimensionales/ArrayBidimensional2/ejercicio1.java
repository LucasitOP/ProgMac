package ArrayBidimensional2;

import java.util.Arrays;

/*
 * 1. Define un array de String de 3 filas por 6 columnas con nombre num y asigna los valores
según la siguiente tabla:
 */
public class ejercicio1 {

	public static void main(String[] args) {
		int arraynum[][]=new int [3][6];
		arraynum[0][0]=0;
		arraynum[0][1]=30;
		arraynum[0][2]=2;
		arraynum[0][5]=5;
		arraynum[1][0]=75;
		arraynum[1][4]=0;
		arraynum[2][2]=-2;
		arraynum[2][3]=9;
		arraynum[2][5]=11;
		System.out.println(Arrays.deepToString(arraynum));
	}

}
