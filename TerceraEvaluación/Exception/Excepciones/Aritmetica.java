package Excepciones;

public class Aritmetica {
	
	public static int division(int numerador, int denominador)throws ArithmeticException{
		if(denominador ==0) {
			throw new ArithmeticException ("División entre 0");//RunTimeException, únicamente cuando se ejecute nuestro programa
			// si fuese Exception sería conocida como excepcion en tiempo de compilación, se tendría que agregar a nuestro método al final el throws Exception
		} 
		return numerador/denominador;
	}
	
	
	
	public void imprimirDivision(int ... numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
}
