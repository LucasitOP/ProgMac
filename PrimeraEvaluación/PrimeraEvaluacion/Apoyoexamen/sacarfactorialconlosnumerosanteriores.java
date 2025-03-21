package Apoyoexamen;

	import java.util.Scanner;

	/*
	 * Desarrolla un programa que solicite un número N por teclado y muestre el factorial de todos
	los números desde 1 hasta N. Por ejemplo, si N=4 se mostrará:
	 */
	public class sacarfactorialconlosnumerosanteriores {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num=0;
			//Bucle do while para que el número sea entero
			do {
				System.out.println("Introduce un número");
				num=sc.nextInt();
			}while (num<=0);
			int contadormulti=1,contadoranterior=1;
			for (int i=1;i<=num;i++) {
				String cadena=i+"!=";
				contadormulti*=i;
				System.out.print(cadena);
				for( int m=1;m<=i;m++) {
					System.out.print(m);
					if(m<i) {
					System.out.print("*");
					}		
				}				
	System.out.print("=");
				for(int j=0;j<=i;) {
					contadoranterior=contadormulti;
					System.out.print(contadoranterior);
					
					System.out.println();
					break;
				}//System.out.println(contadoranterior);
			}
			
			
			
		sc.close();}

	}