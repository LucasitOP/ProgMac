package Cuaderno_MathR;

import java.io.IOException;
import java.util.Scanner;

/*
 * Capturamos números reales por teclado y queremos redondear al entero más
próximo
 */
public class ejercicio4 {
	public static void main(String[] args) throws IOException   {
		Scanner sc=new Scanner(System.in);
		boolean continuar=false;
		String salidacompara="No";
		while(!
				continuar) {
			System.out.println("Introduce un número:");
			double num=sc.nextDouble();
			sc.nextLine();
			System.out.println("Tu número redondeado hacia arriba es:"+Math.ceil(num));
			
			System.out.println("¿Quieres continuar? (Si/No)");
			String salida=sc.nextLine();
		
			if(salidacompara.equalsIgnoreCase(salida)) {
				continuar=true;
				
			}
			System.out.println("Hasta otra!!");
		}
		
sc.close();}
}
