package Secuenciales2;
import java.util.Scanner;
public class ejercicio10 {
	//Realiza un programa que nos diga el dinero que tenemos en euros y céntimos
		//	después de pedirnos cuantas monedas tenemos de 2 euros, 1 euro, 50 céntimos, 20
		//	céntimos y 10 céntimos.
	
	/*Realizar Analisis
	*
	*
	*
	*Realizar Diseño
	*
	*
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int monedaseurototal,monedascentimostotal,mon2,mon1,mon50,mon20,mon10;
		System.out.print("Dime el número de monedas que tienes según el valor que te vaya diciendo \n 2 euros:");
		mon2=sc.nextInt();
		System.out.print("1 euro:");
		mon1=sc.nextInt();
		System.out.print("50 centimos:");
		mon50=sc.nextInt();
		System.out.print("20 centimos:");
		mon20=sc.nextInt();
		System.out.print("10 centimos:");
		mon10=sc.nextInt();
		

		int centimostotal=(mon2*200)+(mon1*100)+(mon50*50)+(mon20*20)+(mon10*10); //traspaso de todo a centimos
		monedaseurototal= centimostotal/100; //sacamos euros totales
		monedascentimostotal=centimostotal%100;// sacamos centimos restantes
		
		
		
		System.out.print("Tienes "+monedaseurototal+" euros y "+monedascentimostotal+ " centimos en total");
		
		
		
		
	sc.close();}

}
