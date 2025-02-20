package ArrayBidimensional3;

import java.util.Arrays;

/*
 * Crea un programa que administre un array bidimensional irregular de 5 filas. De
manera que la primera fila tenga una columna, la segunda fila tenga dos columnas y
así sucesivamente hasta que la última fila tenga cinco columnas.
Realiza la carga de datos por teclado e imprime posteriormente los valores del array.
 */
public class ejercicio1 {

	public static void main(String[] args) {
		int arrayIrregular[][]=new int[5][];
		for (int i=0;i<arrayIrregular.length;i++) {
			arrayIrregular[i]=new int[i+1];
	
		}System.out.println(Arrays.deepToString(arrayIrregular));
	}
	

}
