package Cuaderno_String2;

public class ejercicio2BETA {

	public static void main(String[] args) {
		String frase = "Esta es la frase donde vamos a poner almohadillas";
		String nuevaFrase = "";
		int longitud = frase.length();
		for (int i = 0; i < longitud; i++) {

			if ((i + 1) % 3 == 0) {
				nuevaFrase += "#";
			} else {
				nuevaFrase += frase.charAt(i);
			}
		}

		System.out.println(nuevaFrase);
	}
}