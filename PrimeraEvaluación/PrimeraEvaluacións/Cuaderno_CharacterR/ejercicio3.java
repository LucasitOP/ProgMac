package Cuaderno_CharacterR;

import java.util.Scanner;

public class ejercicio3 {
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		String frase="";
		char a;
		int contadorletra=0,contadornum=0,contadorespacio=0;
		System.out.println("Escribe una frase");
		frase=sc.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			a= frase.charAt(i);
		if(Character.isLetter(a)) {
			//System.out.println("Es una letra");
			contadorletra++;
		}else if (Character.isDigit(a)) {
			//System.out.println("Es un número");
			contadornum++;
		}else if (Character.isWhitespace(a)) {
			//System.out.println("Es un espacio");
			contadorespacio++;
		}
		}
		System.out.println("Letras:"+contadorletra+",Numeros:"+contadornum+",Espacios:"+contadorespacio);
		
	sc.close();}

}
