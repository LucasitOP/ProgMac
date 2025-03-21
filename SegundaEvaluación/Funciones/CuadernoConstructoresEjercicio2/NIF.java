package CuadernoConstructoresEjercicio2;

import java.util.Scanner;

public class NIF {
private long numerodni;
private char letra;

public NIF() {
	this.numerodni=0;
	this.letra=' ';
	
}
public NIF(long numerodni,char letra) {
	this.letra=letra;
	this.numerodni=numerodni;
}
public static char CalcularLetra(long numerodni) {
	char[] letras= {'T','R', 'W','A' ,'G', 'M' ,'Y' ,'F' ,'P' ,'D' ,'X' ,'B' ,'N' ,'J' ,'Z', 'S', 'Q', 'V', 'H' ,'L' ,'C' ,'K' ,'E'};
int sacarletra=(int)(numerodni%23);
return letras[sacarletra];
}

public  void leerNIF(Scanner sc) {
System.out.println("Introduce el número del DNI");
this.numerodni = sc.nextLong();
this.letra=	CalcularLetra(numerodni);
	
}
public  void mostrar() {
	System.out.println("NIF:"+numerodni+"-"+letra);
}


}
