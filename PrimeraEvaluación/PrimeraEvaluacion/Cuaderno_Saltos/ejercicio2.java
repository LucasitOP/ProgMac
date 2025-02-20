package Cuaderno_Saltos;
/*
 * Programa que muestra los números desde el 1 hasta el 50 excepto los que sean múltiplos de
3 y de 5.

 */
public class ejercicio2 {

	public static void main(String[] args) {
		for (int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				continue;
			}
		System.out.println(i);}
	}

}
