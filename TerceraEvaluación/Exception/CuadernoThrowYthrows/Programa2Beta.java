package CuadernoThrowYthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa2Beta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Filas:");
		int filas = pedirFilas(sc);
		boolean columnaCorrecta = false;
		int columnas=-1;
		while (!columnaCorrecta) {
			try {
				 columnas = pedirColumnas(sc);
				columnaCorrecta = true;
			} catch (InputMismatchException ime) {
				if (ime.getMessage() == null) {
					System.out.println("Controlamos que sea un numerico");

				} else {
					System.out.println(ime.getMessage());

				}
				sc.nextLine();

			}
		}
		System.out.println("Tenemos filas:["+filas+"],columnas:["+columnas+"]");
		int[][]arrayBidi=cargarArray(sc, filas,columnas);
		
		mostrarArray(arrayBidi);
		
		sc.close();
	}

	public static int pedirFilas(Scanner sc) {
		int numfilas = -1;
		
			try {
				System.out.println("Introduce valor de las filas:");
				numfilas = sc.nextInt();
				if (numfilas < 2 || numfilas > 4) {
					throw new InputMismatchException("El numero debe estar entre 2 y 4");
				}
				return numfilas;

			
			} catch (InputMismatchException ime) {// Controlamos que sea número
				System.out.println("Debes introducir un número");
				throw ime;
			}
	}
	

	public static int pedirColumnas(Scanner sc) throws InputMismatchException {
		int numcolumnas = -1;
		while (true) {
			System.out.println("Introduce valor de las columnas:");
			numcolumnas = sc.nextInt();

			if (numcolumnas < 2 || numcolumnas > 4) {
				throw new InputMismatchException("el valor debe estar entre 2 y 4");
			}
			return numcolumnas;
		}

	}

	public static int[][] cargarArray(Scanner sc,int ... numeros) {
		int [][]arrayBidi=new int[numeros[0]][numeros[1]];
		for (int i=0;i<arrayBidi.length;i++) {
			try{
				for (int j=0;j<arrayBidi[i].length;) {
			
				try {
					System.out.println("Introduce valor para fila: "+i+" columna:"+j);
					int numero=sc.nextInt();
					arrayBidi[i][j]=numero;
					j++;
				}catch(InputMismatchException ime) {
					System.out.println("Valor erroneo no capturado.");
					sc.nextLine();
				}
				
			}
			}catch(ArrayIndexOutOfBoundsException aiofb) {
				System.out.println("Nos hemos pasado de rango en el array");
			}
		}
		return arrayBidi;
	}

	public static void mostrarArray(int[][]arrayBidi) {
		try{
			for (int i=0;i<arrayBidi.length;i++) {
				System.out.println("");
				for(int j=0;j<arrayBidi[i].length;j++) {
					System.out.print("["+arrayBidi[i][j]+"]");
				}
			}
		}catch(ArrayIndexOutOfBoundsException aiofb) {
			System.out.println("Control de pasada de rango");

	}

}
}