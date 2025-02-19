package ArrayBidimensional3;

import java.util.Scanner;

/*
 *  Solicita al usuario una frase, después crea un array bidimensional que contenga
 todos los caracteres y donde cada fila contenga los caracteres de cada palabra de la
 frase introducida por el usuario
 Por ejemplo para la frase “Hola me llamo Lola” tendremos el array:
 [[H, o, l, a], [m, e], [l, l, a, m, o], [L, o, l, a]]
 (Nota: utiliza el método split de la clase String para obtener las palabras
 */
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase=sc.nextLine();
		frase=frase.trim();
		int cuentaespacios=0;
		
		//Bucle para obtener los espacios para la creación del array.
		for(int i=0;i<frase.length();i++) {
			char caracter=frase.charAt(i);
			if(Character.isSpaceChar(caracter)) {
				cuentaespacios++;
			}
		}
		//Creación del bidimensional sin columnas
		int [][]arraybidimensional=new int [cuentaespacios+1][];
		//Bucle para obtener el número de columnas necesarias para la palabra
		
		int i=0;
		for(int j=0;j<arraybidimensional.length;j++) {
			char caracter=frase.charAt(j);
			if(Character.isAlphabetic(caracter)) {
				arraybidimensional[i][j]=caracter;
			}else if(Character.isWhitespace(caracter)) {
				i++;
			}
		}

	sc.close();}

}
