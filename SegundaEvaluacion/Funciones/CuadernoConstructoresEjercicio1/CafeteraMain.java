package CuadernoConstructoresEjercicio1;

import java.util.Scanner;

public class CafeteraMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Cafetera cafeteria=new Cafetera();
			
			boolean repeticion=true;
			do {
				System.out.println("Elige opción\n1 AñadirCafe\n2 Servir café\n3 Llenar cafetera\n4 Vaciar Cafetera\n5 SALIR");
				int opcion=sc.nextInt();
			switch(opcion){
			case 1:System.out.println("Vamos a añadir café:");
			int añadocafe=sc.nextInt();
			cafeteria.agregarCafe(añadocafe);
			break;
			case 2: System.out.println("Ahora vamos a servir café");
			int servimostaza=sc.nextInt();
			 cafeteria.sevirTaza(servimostaza);
			 break;
			 
			case 3:System.out.println("LLenamos cafetera");
			 cafeteria.llenarCafetera();
			 break;
			case 4:System.out.println("Vaciamos cafetera");
			 cafeteria.VaciarCafetera();
			 break;
			case 5: System.out.println("Salida");repeticion=false;
			break;
			default:System.out.println("Opción errónea");
			break;
			}
			}while(repeticion);
	sc.close();}

}
