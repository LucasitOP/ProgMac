package Cuaderno_Arrays1;
/*
 * Ejercicio 3
Imprimir en pantalla los elementos del siguiente array {2, 3, 4, 7, 8, 10, 11} indicando para
cada uno de ellos si es par o impar.
 */
public class ejercicio3 {

	public static void main(String[] args) {
		int[]myarray={2, 3, 4, 7, 8, 10, 11};
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]%2==0) {
				System.out.println("El numero "+myarray[i]+" en la posición "+i+" es par");
				
			}else {
				System.out.println("El numero "+myarray[i]+" en la posición "+i+" es impar");
			}
	}

}
}