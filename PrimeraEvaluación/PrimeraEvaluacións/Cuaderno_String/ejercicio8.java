package Cuaderno_String;

/*
 * 8.- Hacer un programa que cuente el número de veces que aparece la letra ‘e’
(mayúscula o minúscula). Probarlo con la frase “Este ejercicio es el primero de
cuenta de letras”.
 */
public class ejercicio8 {

	public static void main(String[] args) {
		String frase = "Este ejercicio es el primero de cuenta de letras";
		int contador = 0;
		int j = 1;
		String letra = "e";
		String subfrase;
		int fraselongitud = frase.length();
		for (int i = 0; i <fraselongitud; i++) {
			subfrase=(frase.substring(i, j));
			if (letra.equalsIgnoreCase(subfrase)) {
				contador++;
			}
			j++;
		}
		System.out.println(contador);

	}

}
