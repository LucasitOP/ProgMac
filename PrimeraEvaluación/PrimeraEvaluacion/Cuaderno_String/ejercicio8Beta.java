package Cuaderno_String;
/*
 * 8.- Hacer un programa que cuente el número de veces que aparece la letra ‘e’
(mayúscula o minúscula). Probarlo con la frase “Este ejercicio es el primero de
cuenta de letras”.
 */
public class ejercicio8Beta {

	public static void main(String[] args) {
		String frase="Este ejercicio es el primero de cuenta de letras";
		int contadorE=0;
		for (int i=frase.length()-1;i>=0;i-=1) {
			if (frase.charAt(i)=='e' || frase.charAt(i)=='E') {
				contadorE++;
				
			}
		}
		System.out.println(contadorE);
	}

}
