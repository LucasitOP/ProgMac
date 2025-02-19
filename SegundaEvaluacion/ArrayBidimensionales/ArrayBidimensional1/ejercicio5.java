package ArrayBidimensional1;

import java.util.Arrays;

public class ejercicio5 {

	public static void main(String[] args) {

		int matriz[][]={{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}};
		int nuevamatriz[][]=new int[matriz.length/2][matriz[0].length];
		int constante=-1;
		for(int k=0;k<matriz.length;k+=2) {
			constante++;
		for(int i=0;i<nuevamatriz.length;i++) {
		nuevamatriz[constante][i]=(matriz[k][i]+matriz[k+1][i]);
		nuevamatriz[constante][i]=(matriz[k][i]+matriz[k+1][i]);
		nuevamatriz[constante][i]=(matriz[k][i]+matriz[k+1][i]);
		}
		}
		System.out.println(Arrays.deepToString(nuevamatriz));
		
	}

}
