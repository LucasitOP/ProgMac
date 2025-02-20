package Apoyoexamen;
import java.util.Scanner;

/*
 * Construir un programa que pida al usuario 10 números enteros, los almacene en un array, e
indique en pantalla si dicho array es capicúa, es decir, si la secuencia de sus elementos es
igual vista de delante hacia atrás y de detrás hacia delante.
 */
public class capicua {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array1[]=new int[10];
		System.out.println("Introduce 10 números enteros:");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
			
		}
		//Comparamos
		int recorrido=(array1.length-1);
		boolean comprobación=true;
		for(int x=0;x<(array1.length/2);x++){
			int ultimo=array1[recorrido];
			if(array1[x]==ultimo) {
			
			}else {
				comprobación=false;
			}
			recorrido--;
			
		}
		if(comprobación==true) {
			System.out.print("El array es capicua");
		}else {
			System.out.print("El array no es capicua");
		}
		
		
		
		
		
		sc.close();
		
	}
	

}
