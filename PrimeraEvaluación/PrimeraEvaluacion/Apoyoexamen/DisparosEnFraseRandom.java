package Apoyoexamen;

import java.util.Scanner;

public class DisparosEnFraseRandom {

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);
		String frase = ""; 
		
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		
		for (int i = 1; i<=15; i++) {	
			int rando = (int) (Math.random()*frase.length() + 0);
			
			if (frase.charAt(rando)== ' ')
			{
				System.out.println("Disparo "+i +" en la posicion " +rando +" hay un espacio");
			} else
			{
				int pos2 = frase.indexOf(' ', rando);
				int pos1 = frase.lastIndexOf(' ', rando);
				
				if (pos1==-1)
				{
					pos1=0;
				}
				
				if (pos2==-1)
				{
					pos2=frase.length();
				}
				
				String palabra = frase.substring(pos1, pos2);
				System.out.println("Disparo "+i +" en la posicion " +rando +" hay una palabra: " +palabra);
			}
			
		}
		
		System.out.println("Fin.");
		sc.close();
	}
}
