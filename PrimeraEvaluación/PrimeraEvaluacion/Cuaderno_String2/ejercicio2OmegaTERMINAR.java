package Cuaderno_String2;

public class ejercicio2OmegaTERMINAR {

	public static void main(String[] args) {
		String frase = "Esta es la frase donde vamos a poner almohadillas";
		String nuevaFrase = "";
		int longitud = frase.length();
		for (int i = 0; i <= longitud; i+=3) {
			nuevaFrase=frase.substring(i,i+3);
			nuevaFrase+="#";
		}

		System.out.println(nuevaFrase);

	}

}
