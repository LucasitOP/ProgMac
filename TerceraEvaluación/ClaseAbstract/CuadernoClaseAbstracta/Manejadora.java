package CuadernoClaseAbstracta;

import java.util.Scanner;

public class Manejadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		MostrarMenu();
		PedidaDatos(sc);
		
		
		
		
		
		
		
	}
public static char MostrarMenu() {
	char caracterSwitch=' ';
	while(true) {
		System.out.println("Selecciona la operación que quieres realizar:\ns ->Suma\nr ->Resta\nm ->Multiplicación\nd ->División");
		try {
			caracterSwitch=(char)System.in.read();
		}catch(Exception e) {
			System.out.println();
		}
	}
}
public static void PedidaDatos(Scanner sc) {
	double sumando1=0;
	double sumando2=0;
	while (true) {
        System.out.print("Introduce el primer número (sumando1): ");
        try {
            sumando1 = Double.parseDouble(sc.nextLine());
            break; 
        } catch (NumberFormatException e) {
            System.out.println("Introduce valores numéricos correctos");
        }
    }

    
    while (true) {
        System.out.print("Introduce el segundo número (sumando2): ");
        try {
            sumando2 = Double.parseDouble(sc.nextLine());
            break; 
        } catch (NumberFormatException e) {
            System.out.println("Introduce valores numéricos correctos");
        }
    }
    
}

}
