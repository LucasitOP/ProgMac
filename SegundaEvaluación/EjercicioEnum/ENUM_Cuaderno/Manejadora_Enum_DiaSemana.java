package ENUM_Cuaderno;

import java.util.Scanner;

public class Manejadora_Enum_DiaSemana {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el día de la semana por su número");
		String sdia=sc.next();
		
		DiaSemana ds=DiaSemana.valueOf(sdia);
		String cadena="";
		switch(ds) {
		case LUNES:
			cadena="Empieza la semana";
			break;
		case MARTES:
			cadena="Día de Ruth";
			break;
		case MIERCOLES:
			cadena="Miercoles de Túria";
			break;
		case JUEVES:
			cadena="POW";
			break;
		case VIERNES:
			cadena="Empieza el sufrimiento";
			break;
		case SABADO:
			cadena="Mejor no te lo digo";
			break;
		case DOMINGO:
			cadena="Cumple de Marcos García";
			break;	
		}
		System.out.println(cadena);
		
		
	sc.close();}

}
