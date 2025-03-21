package Secuenciales2;
import java.util.Scanner;
public class ejercicio5 {
	//Una tortilla de patatas lleva 200 gramos de patatas por persona. Por cada kilo de
	//patatas se necesitan 5 huevos y 300 gramos de cebolla. Escribe un programa que
	//dado el número de comensales calcule y muestre las cantidades de ingredientes
	//necesarias.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int 	HUEVOS=5,GRAMOSCEBOLLA=300,GRAMOSPATATA=200,TORTILLA=1000;
		int persona,huevosneces,gramoscebollaneces,totalpatata;
		System.out.print("¿Cuantos comensales vais a ser?");
		persona=sc.nextInt();
		
		totalpatata=persona*GRAMOSPATATA;
		
		huevosneces=totalpatata*HUEVOS/TORTILLA;
		gramoscebollaneces=totalpatata*GRAMOSCEBOLLA/TORTILLA;
		
		
		
		
		System.out.println("Vas a necesitar:"+huevosneces+" huevos y "+gramoscebollaneces+" gramos de cebolla \n para realizar:"+totalpatata+ " gramos de patata");
			
			
	
	sc.close();}

}
