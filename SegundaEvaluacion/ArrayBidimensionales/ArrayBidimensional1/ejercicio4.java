package ArrayBidimensional1;

import java.util.Arrays;

/*
 *  Dadoelarray unidimensional de enteros
 {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3}
 transformarlo en un array bidimensional donde cada cuatro elementos del primer
 array unidimensional forman una fila del segundo.
 */
public class ejercicio4 {

	public static void main(String[] args) {
		int arrayuni[]= {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3};
		int arraybidimensional[][]=new int[arrayuni.length/4][4];
		boolean salida=true;
		int contador=0;
		
		while(salida) {
			if(contador+1==(arrayuni.length/4)){
				salida=false;
			}
		//vamos a realizar un bucle en el que vamos metiendo de 1 en 1 hasta 4(las filas) todos los valores del array 
		//y cuando lleguemos al valor largo del array unidimensional, saldrá del bucle. 
		for (int j=0;j<=(arrayuni.length/4);j++) {
			for(int i=0;i<=4;i++) {
			
			}
		}
		
	}
		System.out.println(Arrays.deepToString(arraybidimensional));
	}

}
