package AmbitoVariables;

import java.util.Scanner;

public class ejercicio1error {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero");
		int m=sc.nextInt();
		if (m>=0){
		//	int doble=m;		
		}// EL ERROR ESTÁ AQUÍ YA QUE INTENTO SACAR DOBLE CUANDO ESTÁ DECLARADO DENTRO DEL BUCLE IF
	//	System.out.println(doble);
	sc.close();}

}
