package Estructuras_Iterativas;
/*
 * Obtener un listado de todos los números múltiplos de 4 entre 4 y 40.
 */
public class ejercicio6 {

	public static void main(String[] args) {
		for (int i=0;i<=40;i++) {
			if (i%4==0 || i%40==0 ) {
				System.out.println(i);
			}
		}
		
	}

}
