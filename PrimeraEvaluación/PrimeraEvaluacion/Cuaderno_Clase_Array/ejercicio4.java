package Cuaderno_Clase_Array;

import java.util.Arrays;

/*
 *  4. Crea cada uno de los arrays y utiliza el método binarySearch para buscar el valor
 correspondiente en cada uno (Recuerda que antes debes ordenar el array, para ello
 utiliza el método Sort)
 Muestra por pantalla la posición de cada uno de los valores.
 a) Para byte byteArr[] = {10,20,15,22,35} busca el valor byte byteKey = 35;
 b) Para char charArr[] = {'g','p','q','c','i'} busca el valor char charKey = 'g';
 c) Para int intArr[] = {10,20,15,22,35} busca el valor int intKey = 22;
 d) Para double doubleArr[] = {10.2,15.1,2.2,3.5} busca el valor
 double doubleKey = 1.5;
 e) Para float floatArr[] = {10.2f,15.1f,2.2f,3.5f} busca el valor float floatKey =
 35;
 f)
 Para short shortArr[] = {10,20,15,22,35} busca el valor short shortKey =
 5
 */
public class ejercicio4 {

	public static void main(String[] args) {
		byte[] byteArr = {10,20,15,22,35};//casteo
		Arrays.sort(byteArr);
		System.out.println(Arrays.binarySearch(byteArr,(byte) 35));
		
		char charArr[] = {'g','p','q','c','i'};
		Arrays.sort(charArr);
		System.out.println(Arrays.binarySearch(charArr, 'g'));
		
		int intArr[] = {10,20,15,22,35};
		Arrays.sort(intArr);
		System.out.println(Arrays.binarySearch(intArr, 22));
		
		double doubleArr[] = {10.2,15.1,2.2,3.5};
		Arrays.sort(doubleArr);
		System.out.println(Arrays.binarySearch(doubleArr, 1.5));
		
		float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
		Arrays.sort(floatArr);
		System.out.println(Arrays.binarySearch(floatArr, 35));
		
		short[] shortArr = {10,20,15,22,35};//casteo
		Arrays.sort(shortArr);
		System.out.println(Arrays.binarySearch(shortArr,(short) 5));
	}

}
