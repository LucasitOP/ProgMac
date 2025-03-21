package Ahorcado;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		//Agregamos el String y creamos el array de la pelicula
		String pelicula="Ted";
		pelicula.toUpperCase();
		char[]Pelicula=new char[pelicula.length()];
		//Realizo un UpperCase para tenerlo en mayúscula a futuro
		//Realizamos un bucle para meter las posiciones al array
		
		for (int i=0;i<pelicula.length();i++) {
			Pelicula[i]=pelicula.charAt(i);
		}
		//Copiamos el array y creamos otro lleno de _
		char[]copia=Arrays.copyOf(Pelicula, Pelicula.length);
		Arrays.fill(copia, '_');
		
		//Creamos un bucle para pedir la petición del caracter y mostrar el Array de barrabajas
		boolean peticion=false,ganado=false,perdido=false;
		char caractercomparar = '\0';
	//	int contadorparacreararraycoincidencias=0;
		while(!ganado||!perdido) {
			
		
		while(!peticion) {
			//Comento el try catch por que no me acuerdo de como se realiza
			//En el Try irá el bucle donde vamos a recoger por pantalla
			try {
				System.out.println("Nuestra pelicula es:"+Arrays.toString(copia)+"\n Ingrese un caracter para adivinarlo:");
			String caracterusuario=sc.next();
			//En caso de que nuestro String sea más largo de 1 caracter sacaremos esta excepcion
			if(caracterusuario.length()!=1) {
				 throw new IllegalArgumentException("Debe ser un caracter, has puesto mas de 1");
			
			}
			//Recogemos el caracter en un char y comparamos si es una letra, en caso de que no lo sea sacamos excepcion
			caractercomparar=caracterusuario.charAt(0);
			if(!Character.isLetterOrDigit(caractercomparar)) {
				throw new IllegalArgumentException("El caracter debe ser una letra o posible número, has puesto algo raro");
			}
			//Si salta las excepciones significa que es correcto y salimos del bucle 
			peticion=true;
			//Por si se encuentra otra excepcion el catch tendrá un bloque con la excepcion
			}catch (IllegalArgumentException e) {
				System.out.println("Error:"+e.getMessage());
			 }
			//Aquí tenemos el caracter recogido, ahora debemos comparar el caracter con la Cadena de String
			//Crear un bucle donde conseguir todas las coincidencias
			/*
			 * IDEA Del bucle:
			 * Realizar un array donde se guardan las coincidencias utilizando el indexOf() y en caso de que se encuentre 
			 * una posicion diferente a -1 seguir buscando a partir de la posicion que se había encontrado hasta encontrar -1
			 * 
			 */
			
			for(int i=0;i<pelicula.length();i++) {
				int posicion=pelicula.indexOf(caractercomparar);
				if(posicion==-1) {
					System.out.println("No hemos encontrado nada");
					i=pelicula.length();
				}
				else {
					System.out.println("Hemos encontrado en la posicion:"+posicion);
		//			contadorparacreararraycoincidencias++;
					
				}
				
			}
			
		}			peticion=false;

		}
		
	sc.close();}

}
