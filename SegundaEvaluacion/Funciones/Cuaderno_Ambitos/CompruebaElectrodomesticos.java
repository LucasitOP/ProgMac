package Cuaderno_Ambitos;

import java.util.Scanner;

public class CompruebaElectrodomesticos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Electrodomestico Dyson =new Electrodomestico("Secador", "Dyson", 185 );
		boolean salida=true;
		do {
			System.out.println("Introduce la opción que necesites:\n1ºConsumo del Electrodomestico\n2ºCoste del consumo del electrodomestico\n3ºMostrar datos del electrodomestico\n4ºSalir");
			int opcion=sc.nextInt();
			switch(opcion) {
			case 1:System.out.println("Introduce las horas de funcionamiento:");
			   int horasfunc=sc.nextInt();
			   
			   System.out.println("El consumo es:"+Dyson.getConsumo(horasfunc));
				break;
			case 2:System.out.println("Introduce la cantidad de horas:");
			int cantidadhoras=sc.nextInt();
			System.out.println("Introduce el precio del kW/hora:");
			double costeHora=sc.nextDouble();
			System.out.println("El Coste total del consumo del electrodoméstico en ese tiempo es:"+Dyson.getCosteConsumo(cantidadhoras, costeHora));
				break;
			case 3:System.out.println( Dyson.toString());
				break;
			case 4:System.out.println("Gracias, hasta luego!");
			salida=false;
				break;
			default:System.out.println("Opción incorrecta.");
				break;
			}
		}while (salida);
	sc.close();}

}
