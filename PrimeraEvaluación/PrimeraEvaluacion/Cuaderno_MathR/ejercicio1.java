package Cuaderno_MathR;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		int numero=0,contadorconvertidos=0,contadornumeros=0;
		char bucle = 'S';
		
		while(bucle=='S'| bucle=='s'){
			System.out.print("Dime un numero");
			numero=sc.nextInt();
		
			if (numero<0) {
				Math.abs(numero);
				contadorconvertidos++;
				contadornumeros++;
			}else {
				contadornumeros++;
			}
			System.out.println("Deseas continuar S/N");  
			bucle=(char) System.in.read();
		}
		System.out.print("Tienes "+contadornumeros+" numeros y se han transformado "+contadorconvertidos+" numeros");
		
	sc.close();}

}
