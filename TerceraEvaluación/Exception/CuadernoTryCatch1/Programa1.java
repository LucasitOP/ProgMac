package CuadernoTryCatch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numeroMayor=0;
		for (int i=1;i<7;) {
			

			try {
				System.out.println("Introduce numero "+i+":");
				int numero=Integer.parseInt(sc.next());
				if(numero>numeroMayor) {
					numeroMayor=numero;
				}
				i++;
				
			}catch(NumberFormatException nfe){
				System.out.println("No he podido convertirlo a numero");
			}
			catch(InputMismatchException ime) {
				System.out.println("Error controlado");
				//si lo cogemos con sc.nextInt();
				sc.nextLine();
			}
		
		}
		System.out.println("El numero mayor es:"+numeroMayor);
	sc.close();}

}
