package RepasoFunciones;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner sc=new Scanner(System.in);
		//do
	//	{
		char opc=mostrarMenu(sc);		
		double [] numeros=SolicitarNumeros(sc);
		System.out.println("El resultado de la operación es "+Operar(opc, numeros));
		//}
	//	while(); //criterio de parada que queráis
	}
	
	public static double Operar(char opc, double [] numeros)
	{
		double res=0;
		switch(opc)
		{
		// cada una de las opciones en un case	
		  case '+':
			  res=CalcularSuma(numeros [0], numeros[1]);
			break;
		  case '-':
			  res=CalcularResta(numeros [0], numeros[1]);
			break;
		  case '*':
			  res=CalcularMultiplicacion(numeros [0], numeros[1]);
				break;
		  case '/':
			  res=CalcularDivision(numeros [0], numeros[1]);
				break;		
		}
		return res;
	}
 
	public static double CalcularMultiplicacion(double num1, double num2)
	{
		return num1*num2;
	}
	public static double CalcularDivision(double num1, double num2)
	{
		if(num2==0)
		{
			//bucle que solicite num2 repetidamente hasta que sea >0
			 
		}
		return num1/num2;
	}
	
	public static double CalcularSuma(double num1, double num2)
	{
		return num1+num2;
	}
	public static double CalcularResta(double num1, double num2)
	{
		return num1-num2;
	}
	
	public static char mostrarMenu(Scanner sc)
	{
		char opc=0;
		System.out.println("Selecciona la opción");
		// aquí mostraríamos las opciones 
		//capturar con scanner el valor y devolverlo
		return opc;
	}
	
	public static double [] SolicitarNumeros(Scanner sc)
	{
		double[] nums = new double [2]; // en la 1ª pos 1er nº y en la 2ª pos del arry el segundo
		//	Capturar con scanner cada uno de los números, guardarlos en array y devolverlos
		return nums;
	}
	
	
}
