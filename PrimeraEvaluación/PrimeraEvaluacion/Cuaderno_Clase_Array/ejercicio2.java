package Cuaderno_Clase_Array;

import java.util.Arrays;

/*
 * 2. Crear un array de números de tipo int y tamaño 10.
 Usando el método fill de Arrays modifica todos los valores del array con el valor 2
 Muestra el array por consola
 Usando el método fill de Arrays dale a los 5 primeros elementos el valor 10
 Muestra el array por consola
 */
public class ejercicio2 {

	public static void main(String[] args) {
		int[]array=new int[10];
		Arrays.fill(array, 2);
		System.out.println(Arrays.toString(array));
		Arrays.fill(array,0,5,10);
		System.out.println(Arrays.toString(array));
	}

}
