package Cuaderno_Arrays1;
/*
 * Ejercicio 4
A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} obtener otro con ceros intercalados entre
sus posiciones {2, 0, 3, 0, 4, 0, …}

 */
public class ejercicio4 {

	public static void main(String[] args) {
		int[]myarray={2, 3, 4, 7, 8, 10, 11};
		int []nuevoarray=new int[myarray.length*2-1];
		int j=0;
		for(int i=0;i<nuevoarray.length;i++) {
			if(i%2==0) {
				nuevoarray[i]=myarray[j];
				j++;
		}else {nuevoarray[i]=0;
			
		}	
			}
		

 	}

}
