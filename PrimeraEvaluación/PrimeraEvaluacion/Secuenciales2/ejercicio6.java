package Secuenciales2;

import java.util.Scanner;

public class ejercicio6 {
	//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
	//desea saber cuánto deberá pagar finalmente por su compra. El comprador introduce
	//el importe del producto.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double compra,descuento=0.85,comprafinal;
		System.out.print("Dime el valor de tu compra");
		compra=sc.nextDouble();
		comprafinal=compra*descuento;
		System.out.println("El valor de tu compra con el descuento es:"+comprafinal+" €");
		
		
		
		
		
	sc.close();}

}
