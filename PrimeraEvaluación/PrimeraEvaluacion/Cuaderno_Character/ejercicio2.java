package Cuaderno_Character;

import java.io.IOException;

public class ejercicio2 {

	public static void main(String[] args) throws IOException {
		char letra = 0;
		
		do {
			System.out.println("Escribe tu caracter");
			letra=(char)System.in.read();
			System.in.skip(System.in.available());
		}while (Character.isLetter(letra)!=true) ;
		
	letra=Character.toLowerCase(letra);
	if (letra=='a'|| letra=='e'|| letra=='i'||letra=='o'||letra=='u'){
			System.out.println("Es Vocal");
	}else {
		System.out.println("Es consonante");
	}
	}

}
