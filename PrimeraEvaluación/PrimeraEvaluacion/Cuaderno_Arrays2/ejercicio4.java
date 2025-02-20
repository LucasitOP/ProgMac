package Cuaderno_Arrays2;

import java.util.Arrays;

/*
 * Repetir el ejercicio anterior utilizando el método split(cadena) de la clase String, donde
cadena es el String por donde vamos a romper la frase.
 */
public class ejercicio4 {

	public static void main(String[] args) {
		String frase="Esta es la frase que vamos a partir";
		frase.trim();
		String[]frasepartida=frase.split(" ");
		System.out.println(Arrays.toString(frasepartida));
	}

}
