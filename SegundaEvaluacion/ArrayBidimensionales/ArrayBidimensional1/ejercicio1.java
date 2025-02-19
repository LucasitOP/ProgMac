package ArrayBidimensional1;

import java.util.Arrays;

/*
 * Sumar los elementos de las matrices
{{3,6,8,5}, {4,7,1,9}} y
{{2,5,6,3}, {7,-7,3,4}}
cuando la suma de las dos posiciones de cada elemento sea par

 */
public class ejercicio1 {

	public static void main(String[] args) {
		int array1[][] = { { 3, 6, 8, 5 }, { 4, 7, 1, 9 } };
		int array2[][] = { { 2, 5, 6, 3 }, { 7, -7, 3, 4 } };
		int i=0,j=0;
		


		for ( i = 0; i < array1.length; i++) {
			for (j = 0; j < array1[i].length; j++) {
				if((i+j)%2==0) {
				array1[i][j]=array1[i][j]+array2[i][j];
			}else {
				array1[i][j]=0;
			}
				}
		
		}
		 System.out.println(Arrays.deepToString(array1));
	}
}
