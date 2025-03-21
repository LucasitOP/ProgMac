package Ev2_LucasAdriánTimoc;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Puerto puerto=new Puerto();
	
		boolean repetir=true;
		while(repetir) {
		repetir= menu(sc,repetir,puerto);
		
		}
		sc.close();
	}
	public static boolean menu(Scanner sc,boolean repetir,Puerto puerto) {
		System.out.println("Selecciona una opción:\n1-Mostrar estado del puerto \n2-Entrada de embarcación\n3-Salida de embarcación\n4-Salir");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion) {
		case 1: puerto.mostrarEstadoDelPuerto();
			break;
		case 2:puerto.EntraEmbarcacion(sc);
			break;
		case 3:puerto.SalidaEmbarcacion(sc);
			break;
		case 4:repetir=false;
		System.out.println("Salida...");
			break;
		default:System.out.println("Opción errónea");
			break;
		
		}		
		return repetir;
	}
	

}
