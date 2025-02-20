package Cuaderno_Arrays2;

/*
 * Ejercicio 2
Separar el siguiente array [2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18] en otros tres. El primero
tiene que contener todos los elementos menores de 10, el segundo los elementos entre 11 y
20 y el tercero los elementos entre 21 y 30. Los elementos mayores de 30 serán
descartados y los arrays no pueden tener posiciones vacías.

 */
public class ejercicio2 {

	public static void main(String[] args) {
		int[] arrayprincipal = { 2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18 };
		// int[]array1,array2,array3;
		int contador1 = 0, contador2 = 0, contador3 = 0;
		for (int i = 0; i < arrayprincipal.length; i++) {
			if (arrayprincipal[i] <= 10) {
				contador1++;
			} else if (arrayprincipal[i] <= 20) {
				contador2++;
			} else if (arrayprincipal[i] <= 30) {
				contador3++;
			} else {

			}
		}
		int[] array1 = new int[contador1], array2 = new int[contador2], array3 = new int[contador3];
		int pos1=0,pos2=0,pos3=0;
		for (int j = 0; j < arrayprincipal.length; j++) {
			if (arrayprincipal[j] <= 10) {
				
				array1[pos1] = arrayprincipal[j];
				pos1++;
			} else if (arrayprincipal[j] <= 20) {
				array2[pos2] = arrayprincipal[j];
				pos2++;

			} else if (arrayprincipal[j] <= 30) {
				array3[pos3] = arrayprincipal[j];
				pos3++;
			}
		}
	}

}
