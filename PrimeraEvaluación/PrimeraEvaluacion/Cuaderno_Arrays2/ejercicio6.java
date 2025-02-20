package Cuaderno_Arrays2;

import java.util.Arrays;

/*
 * A partir del siguiente array de caracteres [‘a’, ‘b’, ‘f’, ‘g’, ‘e’, ‘i’, ‘o’, ‘p’, ‘x’], obtener un array de
Strings donde los caracteres del array anterior estén agrupados de 3 en 3. Es decir, obtener
el array [“abf”, “gei”, “opx”]

 */
public class ejercicio6 {

	public static void main(String[] args) {
		char[]caracteres= {'a', 'b', 'f', 'g', 'e', 'i', 'o', 'p', 'x'};
		int partir3=caracteres.length/3;
		String[]nuevoarray=new String [partir3];

		for(int i=0;i<partir3;i++) {
			String añadir=""+caracteres[i*3]+caracteres[i*3+1]+caracteres[i*3+2];
			nuevoarray[i]=añadir;
			
		}
		System.out.print(Arrays.toString(nuevoarray));
	}

}
