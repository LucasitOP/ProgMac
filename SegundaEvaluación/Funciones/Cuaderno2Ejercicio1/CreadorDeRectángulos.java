package Cuaderno2Ejercicio1;

import java.io.IOException;
import java.util.Scanner;

public class CreadorDeRectángulos {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		boolean salida=true;
		System.out.println("Dame los datos del rectángulo:\n=============================================");
		System.out.println("Base:");
		int base=sc.nextInt();
		System.out.println("Altura:");
		int altura=sc.nextInt();
		Rectángulo rect=new Rectángulo(base,altura);

		while(salida) {
		System.out.println("Introduce la opción\n1ºPintar\n2ºPintarSigno\n3ºInvertir\n4ºCalcular Area\n5ºCalcular Perimetro\n6ºSalir");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:rect.Pintar();
		break;
		case 2:rect.Pintar(rect.altura,rect.base);
		break;
		case 3:rect.Invertir();
		break;
		case 4:rect.CalcularArea();
		break;
		case 5:rect.CalcularPerimetro();
		break;
		case 6:salida=false ;
		System.out.println("Gracias, Hasta luego!");
		break;
		default:System.out.println("No se ha introducido la opción correcta");
		break;
		}
		}
	sc.close();}

}
