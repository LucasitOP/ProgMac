package Cuaderno_Saltos;
/*
 * Escribe por consola los números del 1 al 100 menos los múltiplos de 5

 */
public class ejercicio7 {

	public static void main(String[] args) {
		for (int i=1;i<=50;i++) {
			if (i%5==0) {
				continue;
			}System.out.println(i);
		}
	}

}
