package Cuaderno_Arrays2;

import java.util.Arrays;

/*
 *  Coger la siguiente frase “Esta es la frase del ejercicio siete” y obtener dos arrays de
 caracteres, uno donde estén todas las consonantes y otro donde estén todas las vocales.
 */
public class ejercicio7 {

	public static void main(String[] args) {
		String frase="Esta es la frase del ejercicio siete";
		int contadorvocales=0,contadorconsonantes=0;
		for(int i=0;i<frase.length();i++) {
			char caracter=frase.charAt(i);
			if (caracter=='a'|caracter=='A'|caracter=='e'|caracter=='E'|caracter=='i'|caracter=='I'|caracter=='o'|caracter=='O'|caracter=='u'|caracter=='U') {
				contadorvocales++;
				//Capamos espacios y numeros
			}else if(Character.isDigit(caracter)|Character.isWhitespace(caracter)) {
				
			}else {
				contadorconsonantes++;
			}
			
		}
		char[]arrayvocales=new char[contadorvocales];
		char[]arrayconsonantes=new char[contadorconsonantes];
		int añadirvocal=0;
		int añadirconsonante=0;
		for(int i=0;i<frase.length();i++) {
			char caracter=frase.charAt(i);
			if (caracter=='a'|caracter=='A'|caracter=='e'|caracter=='E'|caracter=='i'|caracter=='I'|caracter=='o'|caracter=='O'|caracter=='u'|caracter=='U') {
				arrayvocales[añadirvocal]=frase.charAt(i);
				añadirvocal++;
			}else if (Character.isDigit(caracter)|Character.isWhitespace(caracter)) {
				
			}else {
				arrayconsonantes[añadirconsonante]=frase.charAt(i);
				añadirconsonante++;
			}
				
		}
		System.out.println(Arrays.toString(arrayvocales));
		System.out.println(Arrays.toString(arrayconsonantes));
		
	}

}
