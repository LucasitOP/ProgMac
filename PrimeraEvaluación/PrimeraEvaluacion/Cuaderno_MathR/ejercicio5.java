package Cuaderno_MathR;

import java.util.Scanner;

/*
 * Genera número aleatorios enteros comprendidos entre 100 y 250.
 */
public class ejercicio5 {
	static public void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean bucle=true;
		String salidacomparar="No";
		while(bucle) {
		for (int i=0;i<=20;i++) {
			int num=(int)(Math.random()*151+100);
			System.out.print(num);
			if(i<20) {
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.print("Deseas continuar?Si/No");
		String salida=sc.nextLine();
		if(salida.equalsIgnoreCase(salidacomparar)) {
			bucle=false;
			
		}
		
		}System.out.println("Hasta pronto!");
	sc.close();}

}
