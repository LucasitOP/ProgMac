package Estructuras_Iterativas;
/*
 * Obtener un listado de todos los números del 1 al 100 que contengan un 8.
 */
public class ejercicio5 {

	public static void main(String[] args) {
		for (int i=8;i<=100;i+=10) {
			if (i>=80 && i<=89){
				for (int a=80;a<=89;a++) {
					System.out.println(a);
				}
			}else {System.out.println(i);
				
			}
		}
		
		
	}

}
