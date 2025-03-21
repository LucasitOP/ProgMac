package CuadernoTryCatch1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Realiza un programa que pida por teclado las dimensiones de un array bidimensional
(validar que la dimensión esté entre 2 y 4), lo rellene con datos que se introduzcan por
teclado con valores numéricos y luego lo muestre.
Si se produce una excepción al introducir un dato, el programa volverá a pedirlo una y
otra vez hasta que el dato sea correcto
 */
public class Programa2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PedirMostrarArrayBidi(sc);
		
		
		sc.close();
	}
	
	public static void PedirMostrarArrayBidi(Scanner sc) {
		System.out.println("Filas:");
		int filas =PedirTamaño(sc);
		System.out.println("Columnas:");
		int columnas=PedirTamaño(sc);
		int [][] ArrayBidiARellenar=new int[filas][columnas];
		ArrayACargar(ArrayBidiARellenar, sc);
		mostrarArray(ArrayBidiARellenar);
		
	}
	public static int PedirTamaño(Scanner sc) {
		int tamaño=0;
		boolean recogido=false;
		while(!recogido)
			{
		try {System.out.println("Introduce el valor del del array:");
			tamaño=Integer.parseInt(sc.next());
			if(tamaño<2||tamaño>4)
				{
				System.out.println("Debes introducir el número entre 2 y 4");
				}
			else {
				recogido=true;
			}
		}catch (NumberFormatException nfe) {
			System.out.println("Error de formateo");
			
		}
		}
		return tamaño;
	}
	public static int[][] ArrayACargar(int [][] arrayARellenar,Scanner sc){
		//bucle para rellenar array fila
		for (int i=0;i<arrayARellenar.length;i++) {
			for (int j=0;j<arrayARellenar[i].length;) {
				try {
					System.out.println("Introduce valor para fila: "+i+" columna:"+j);
					int numero=sc.nextInt();
					arrayARellenar[i][j]=numero;
					j++;
				}catch(InputMismatchException ime) {
					System.out.println("Valor erroneo no capturado.");
					sc.nextLine();
				}
				catch(ArrayIndexOutOfBoundsException aiofb) {
					System.out.println("Nos hemos pasado de rango en el array");
				}
			}
		}
		
		
		return arrayARellenar;
		
	}
	public static void mostrarArray(int [][]arrayAMostrar) {
		
		try{
			for (int i=0;i<arrayAMostrar.length;i++) {
				System.out.println("");
				for(int j=0;j<arrayAMostrar[i].length;j++) {
					System.out.print("["+arrayAMostrar[i][j]+"]");
				}
			}
		}catch(Exception e) {
			
		}
	}
	

}
