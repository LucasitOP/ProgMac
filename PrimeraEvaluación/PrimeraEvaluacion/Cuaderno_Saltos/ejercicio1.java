package Cuaderno_Saltos;
/*
 * Programa que muestra números desde 1 hasta 50. Cuando encuentre el primer número que
sea múltiplo de 3 y de 5 dejará de mostrar números.
 */
public class ejercicio1 {

	public static void main(String[] args) {
		for (int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				break;
			}
			System.out.println(i);
		}
	}

}
