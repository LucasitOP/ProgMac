package Estructuras_Iterativas;
/*
 * Sin utilizar la sentencia FOR hacer un listado de 10 al -10 seguido a continuación de
otro de -10 a 10.
 */
public class ejercicio7 {

	public static void main(String[] args) {
		int i=10;
		while (i>=-9) {
			System.out.println(i);
			i-=2;
		}
		while (i<=10){
			System.out.println(i);
			i+=2;
			
		}
	}
}


