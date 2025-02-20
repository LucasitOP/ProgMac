package Cuaderno_Arrays1;
/*
 * Ejercicio 2
Obtener la suma de los elementos del siguiente array: {1, 4, 6, 10, -3, 4, 6, -5}

 */
public class ejercicio2 {

	public static void main(String[] args) {
		int[]myarray={1, 4, 6, 10, -3, 4, 6, -5};
		int contador=0;
		for(int i=0;i<myarray.length;i++) {
			contador+=myarray[i];
		}System.out.print(contador);
	}

}	
