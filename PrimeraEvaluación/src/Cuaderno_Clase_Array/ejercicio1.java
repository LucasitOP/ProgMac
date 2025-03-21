package Cuaderno_Clase_Array;


import java.util.Arrays;

/*
 * 1. Hacer un programa que ordene el array {23, 1, 45, 2, 87, 1, 22, 4, 8, 9, 12} de
 menor a mayor y lo muestre por consola
 */
public class ejercicio1 {

	public static void main(String[] args) {
		int[] array= {23, 1, 45, 2, 87, 1, 22, 4, 8, 9, 12};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	} 

}
