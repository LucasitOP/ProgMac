package Estructuras_Iterativas;

/*
 * Obtener un listado con los números del 1 al 10. En la posición del cinco en lugar de
salir el número ha de salir la palabra ‘CINCO’.
 */
public class ejercicio2 {

	public static void main(String[] args) {
	for (int i=1;i<=10;i++) {	
		if (i==5){
			System.out.println("CINCO");

		}else System.out.println(i);
		}

	}
}

