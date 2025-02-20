package Cuaderno_Clase_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Buenas usuario, ¿Qué tamaño quieres para el array?");
		int tamañoarray=sc.nextInt();
		int opcion=0;
		int[]Arrayunidimensional=new int[tamañoarray];
		int contadordentro=0,elementobuscar=0,encontrar0=0;
		do {		System.out.println("Elige la opción que deseas realizar");
  		opcion=sc.nextInt();
		switch(opcion) {
		/*
 1. Agregar un elemento al array: Permitir al usuario ingresar un número que
 se almacenará en la primera posición vacía del array. Si el array está lleno,
 deberá indicarse que no se pueden agregar más elementos.
		 */
		case 1://Idea: es si hay un valor 0 encontrar la posición con Arrays.binarySearch y este significa que esta libre
			/*Arrays.fill(Arrayunidimensional, -1);
			
			encontrar0=Arrays.binarySearch(Arrayunidimensional, -1);
			if(encontrar0>=0) {
				System.out.println("Ingresa el número:");
				Arrayunidimensional[encontrar0]=sc.nextInt();
				System.out.println("Añadido");
			}else {
				System.out.println("El array esta completo.");
			}
			
			/*
			 * Realizaremos un for para recorrer el Array en cuanto el valor sea=0
			 * lo sustituiremos.w
			 */
			for(int i=0;i<Arrayunidimensional.length;i++) {
				if (Arrayunidimensional[i]==0) {
					System.out.println("Vamos a añadir el número en la posición "+i+"\n Introduce numero");
					Arrayunidimensional[i]=sc.nextInt();
					break;
				}else if(i==Arrayunidimensional.length){
					System.out.println("El array está completo");
					
				}
			}
			
			/*if (contadordentro<tamañoarray) {
			System.out.println("Vamos a añadir un número a tu array");
			int numeroañadido=sc.nextInt();
			Arrayunidimensional[contadordentro]=numeroañadido;
			contadordentro++;
			System.out.println("Añadido!");}
			else {
				System.out.println("El array esta completo y no se puede agregar mas");
			}
			*/break;
		/* 
2. Mostrar los elementos del array: Mostrar en pantalla todos los elementos
del array (su posición y valor) hasta el último elemento ingresado, ordenados
de acuerdo a su posición en el arreglo.
			 */
		case 2:System.out.println("Vamos a mostrar el array");
		System.out.println(Arrays.toString(Arrayunidimensional));
			break;
			/*
3. Ordenar array: Ordenar y mostrar en pantalla todos los elementos del array
			 */
		case 3:System.out.println("Vamos a ordenar el Array de menor a mayor");
		Arrays.sort(Arrayunidimensional);
		System.out.println("Aquí se muestra el array:"+Arrays.toString(Arrayunidimensional));
			break;
			/*
4. Buscar un elemento en el array: Solicitar al usuario un número y buscarlo
 en el array. Si el número se encuentra, debe indicarse la posición en la que
 está; si no, debe mostrar un mensaje informando que no se encontró.
			 */
		case 4:System.out.println("Dime el elemento que quieres buscar");
		elementobuscar=sc.nextInt();
		if(Arrays.binarySearch(Arrayunidimensional, elementobuscar)<0) {
		System.out.println("El elemento se encuentra en la posición:"+Arrays.binarySearch(Arrayunidimensional, elementobuscar));
		}else {
			System.out.println("El elemento no se encuentra en el array");
		}
			break;
			/*
5. Eliminar un elemento del array : Permitir al usuario eliminar un número
 específico. Si el número se encuentra en el array, se eliminará y los
elementos posteriores deberán desplazarse para evitar espacios vacíos. Si
 no se encuentra, deberá mostrar un mensaje informando de ello.
			 */
		case 5:
			// Vamos a recorrer el array y en caso de que encuentre el numero lo elimina cambiandolo por 0
			break;
			//6. Salir: Terminar la ejecución del programa.
		case 6:System.out.println("Gracias por usarme!!");
			break;
		default:
			System.out.println("Opción no válida");
			break;
		
		}
		}while (opcion!=6);
		
		

	sc.close();}

}
