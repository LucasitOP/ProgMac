package Cuaderno2Ejercicio2;

import java.util.Scanner;

public class CuentaCorriente {
String nombre,apellidos,dni,dirección;
long numcuenta;
double saldo;

double IngresarDinero(double a) {
	
	return saldo+a;
}
double SacarDinero(double a) {
	Scanner sc=new Scanner(System.in);
	/*if(a>saldo) {
		System.out.println("No tienes tanto dinero, introduzca un importe acorde a tu salario");
		a=sc.nextDouble();
	SacarDinero(a); 
	}*/
	return saldo-a;
}
void MostrarSaldo() {
	System.out.println("Tu saldo es:"+saldo);
}
void ModificarDatos() {
	System.out.println("Los datos de la cuenta:"+numcuenta+" son:\n1ºNombre:"+nombre+"\n2ºApellido:"+apellidos+"\3ºDNI:"+"\n4ºDirección:"+dirección);
	System.out.println("Seleccione si desea modificar algún dato, sino pulse 5 para salir.");
}
}
