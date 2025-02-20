package Cuaderno_String;
/*
 * 9.- De cualquier palabra con un número par de letras, conseguir que la
primera mitad esté en mayúsculas y la segunda mitad en minúsculas.
Probarlo con la palabra “LoCoMoToRa”.

 */
public class ejercicio9 {

	public static void main(String[] args) {
		String frase="LoCoMoToRa";
		int numeroletras=frase.length();
		System.out.print(frase.toUpperCase().substring(0, (numeroletras/2)));
		System.out.print(frase.toLowerCase().substring(numeroletras/2, numeroletras));
	}

}
