package examen1EV;

import java.util.Scanner;

public class ejemplo_while_switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean salida=true;
		String opcion="";
		while(salida) {
		System.out.println("Este es mi menu elige opcion\nA :Chupar\nB: Lamer\nC: Tocar\nS:Salida");
		opcion=sc.next();
		opcion=opcion.toUpperCase();
		switch(opcion) {
		case "A":
			break;
		case "B":
			break;
		case "C":
			break;
		case "S": salida=false;
			break;
	
		
		default:
			break;
		}
		}
		
sc.close();	}

}
