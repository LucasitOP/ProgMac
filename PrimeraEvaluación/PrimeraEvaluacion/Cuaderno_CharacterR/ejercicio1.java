package Cuaderno_CharacterR;

import java.io.IOException;

public class ejercicio1 {
	public static void main (String[]args)throws IOException{
		char a;
		System.out.println("Escribe una letra,digito o espacio");
		a=(char)System.in.read();
		if(Character.isLetter(a)) {
			System.out.println("Es una letra");
			
		}else if (Character.isDigit(a)) {
			System.out.println("Es un número");
		}else if (Character.isWhitespace(a)) {
			System.out.println("Es un espacio");
		}else {
			System.out.println("Aquí tenemos algo raro");
		}
			
		
	}

}
