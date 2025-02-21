package CuadernoPolimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Almacen almacen=new Almacen();
		boolean repetir=true;
		while(repetir) {
		repetir= menu(sc,repetir,almacen);
		}
		
		sc.close();
	}
	public static boolean menu(Scanner sc,boolean repetir,Almacen almacen) {
		System.out.println("Introduce opción:\n1-Añadir articulo Software\n2-Añadir articulo Hardware\n3-Mostrar articulos del Almacen\n4-Salir");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion) {
		case 1: almacen.agregarArticulo(almacen.anyadirSoftware(sc));
			break;
		case 2:almacen.agregarArticulo(almacen.anyadirHardware(sc));
			break;
		case 3:almacen.mostrarArticulos();
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
