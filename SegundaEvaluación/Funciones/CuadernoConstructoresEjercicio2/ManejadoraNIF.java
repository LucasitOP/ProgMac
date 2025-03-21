package CuadernoConstructoresEjercicio2;

import java.util.Scanner;

public class ManejadoraNIF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NIF nif =new NIF() ;
		nif.leerNIF(sc);
		nif.mostrar();
		
		
		}

}
