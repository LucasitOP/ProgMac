package Secuenciales2;
import java.util.Scanner;
public class ejercicio1 {
	/****************** PROBLEMA *********************************/
	// Dados dos números calcular y mostrar su suma, resta división y multiplicación
	/****************** ANÁLISIS *********************************/
	// Hay que solicitar 2 números y calcular cada una de las operaciones (suma, resta,
	//multiplicación y división)
	// Datos de entrada: 2 números
	// Información de salida: valor de cada una de las operaciones solicitadas
	// Variables: num1,num2,suma,resta,multiplicación y división (double)

	public static void main(String[] args) {
		/****************** DISEÑO *********************************/
		// 1. Leer 2 números
		// 2. Obtener suma
		// 3. Obtener resta
		// 4. Obtener multiplicación
		// 5. Obtener división
		// 6. Mostrar resultados
		Scanner sc=new Scanner(System.in);
		int num1,num2,suma,resta,multiplicacion;
		double division;
		System.out.println("Escribe dos numeros para realizar la operación de: \n suma \n resta\n multiplicacion\n division \n Primer numero:");
		num1=sc.nextInt();
		System.out.println("Segundo numero:");
		num2=sc.nextInt();
		suma=num1+num2;
		resta=num1-num2;
		multiplicacion=num1*num2;
		division=(double)num1/num2;
		System.out.println("El resultado es: \n suma="+suma+"\n resta="+resta+"\n multiplicacion="+multiplicacion+"\n division="+division);
		
		sc.close();

	}

}
