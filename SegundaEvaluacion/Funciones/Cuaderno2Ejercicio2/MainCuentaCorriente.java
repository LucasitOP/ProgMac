package Cuaderno2Ejercicio2;

import java.util.Scanner;

public class MainCuentaCorriente {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CuentaCorriente CuentaLucas=new CuentaCorriente();
		System.out.println("Introduce la Tarjeta\n======================");
		CuentaLucas.numcuenta=10062004;
		CuentaLucas.nombre="Lucas";
		CuentaLucas.apellidos="Timoc";
		CuentaLucas.dirección="Paseo de los navegantes";
		CuentaLucas.dni="X9401698B";
		CuentaLucas.saldo=100000000;
		System.out.println("Datos recogidos, bienvenido "+CuentaLucas.nombre+"!");
		boolean salida1menu=true;
		while (salida1menu) {
			System.out.println("Introduce la Opción que desee\n1 Sacar o Ingresar Dinero\n2 Consultar saldo o Modificar datos personales\n3 Terminar");
		int opcionmenu=sc.nextInt();	
		switch(opcionmenu) {
		case 1:
			System.out.println("Introduce la operación que desea realizar\n1 Sacar Dinero\n2 Ingresar Dinero");
		int opcionSacaIngre=sc.nextInt();
		boolean bucleSacaIngre=true;
		while(bucleSacaIngre) {
			if(opcionSacaIngre==1) {
				System.out.println("Dime el dinero que quieres sacar");
				try {
					double sacardinero=sc.nextInt();
					CuentaLucas.SacarDinero(sacardinero);
					System.out.println("Ahora dispones de "+CuentaLucas.saldo+" euros en tu cuenta");
				} catch (Exception e) {
					System.out.println("Ha ocurrido un error:"+e.getMessage());
					System.out.println("Introduce un número válido");
				}
				
			
			
			bucleSacaIngre=false;
		}else if(opcionSacaIngre==2) {
			System.out.println("Dime el dinero que quieres ingresar");
			double ingresardinero=sc.nextInt();
		CuentaLucas.IngresarDinero(ingresardinero);
			bucleSacaIngre=false;
		}else {
			System.out.println("Error, pruebe otra vez");
		}}
			break;
		case 2:
			break;
		case 3:System.out.println("Gracias, hasta la próxima!"); salida1menu=false;;
			break;
		default:System.out.println("ERROR");
			break;
		}
		}
	}

}
