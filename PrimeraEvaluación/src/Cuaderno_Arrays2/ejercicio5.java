package Cuaderno_Arrays2;

import java.util.Arrays;

/*
 * Coger el siguiente array [6, 9, 8, 10, 11] y dividirlo por este otro posición a posición [2, 3, 4,
2, 3] y en el array resultado sumarle 10 a todos los valores menores de 4.

 */
public class ejercicio5 {

	public static void main(String[] args) {
		int []array1= {6, 9, 8, 10, 11};
		int []array2= {2, 3, 4,2, 3};
		int []arrayresultado=new int[array1.length];
		for(int i =0;i<array1.length;i++) {
			arrayresultado[i]=array1[i]/array2[i];
			if (arrayresultado[i]<=4) {
				arrayresultado[i]+=10;
			}
		}
		System.out.print(Arrays.toString(arrayresultado));
	}

}
