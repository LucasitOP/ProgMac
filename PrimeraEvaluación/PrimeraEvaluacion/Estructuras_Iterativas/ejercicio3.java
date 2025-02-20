package Estructuras_Iterativas;
/*
 * Obtener un listado de todos los números del -30 al 30. Para los números que se
encuentren entre 0 y 8 sólo aparecerán los pares.
 */
public class ejercicio3 {

	public static void main(String[] args) {
		
		for(int i=-30;i<=30;i++) {
			if (i<1 || i>9) {
				System.out.println(i);
			}else {
				i++ ;
				System.out.println(i);
			}
			
			
		}
	}

}
