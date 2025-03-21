package RepasoFunciones;

import java.io.IOException;
import java.util.Scanner;

/*
 * 2. Crea el método mostrarTablaMultiplicar que muestre por pantalla la tabla de multiplicar del número recibido como parámetro.
 *   Escribe también un programa que pruebe la función.
public static void  mostrarTablaMultiplicar (int num)
 */
public class ejercicio2TablaMultiplicar {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		boolean bucle=true;
		String introducido="";
		while(bucle) {
		System.out.println("1ºMostrar tabla de multiplicar\n2ºEs dígito\n3ºHipotenusa\n4ºMenu calculadora\n5ºPerimetro y Área\n6ºSalir");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
		System.out.println("Introduce un numero:");
		 introducido=sc.next();
		
		int numero=Integer.parseInt(introducido);
		
		for (int i=0;i<=10;i++) {
		System.out.println(mostrarTablaMultiplicar((int)numero,i));
		}
		break;
		
		case 2:System.out.println("Introduce un numero:");
		char caracter=(char) System.in.read();
			System.out.println(esDigito(caracter));
		break;
		case 3:
			System.out.println("Introduce cateto 1:");
			int catet1=sc.nextInt();
			System.out.println("Introduce cateto 2:");
			int catet2=sc.nextInt();
			System.out.println("Hipotenusa:"+hipotenusa(catet1, catet2));
			break;
		case 4:MenuCalculador();
			break;
		case 5:MenuFigura();
			break;
		case 6:System.out.println("Gracias, Hasta luego!");
		bucle=false;
			break;
		}	
		}	
	
		}
	public static String  mostrarTablaMultiplicar (int num,int i) {
		String mensaje="";
			mensaje=num+"*"+i+"="+i*num;
		return mensaje;
		
	}
	public static void mostrarTablaMultiplicar(int num) {
		
	}
	public static boolean  esDigito (char letra) {
		boolean esonoes=true;
		if (Character.isDigit(letra)) {
			esonoes=true;
		}else {
			esonoes=false;
		}
		return esonoes;
		
	}
	public static double hipotenusa(double a, double b) {
		double resultado=0;
		resultado=(double)(Math.sqrt((Math.pow(a, 2)+(Math.pow(b, 2)))));
		
		return resultado;
		
	}
	public static void MenuCalculador() {
		Scanner sc=new Scanner(System.in);
	
		mostrarMenu();
		int opcion=sc.nextInt();
		
		System.out.println("Introduce numero 1:");
		int num1=sc.nextInt();
		System.out.println("Introduce numero 2:");
		int num2=sc.nextInt();
		switch(opcion) {
		case 1:System.out.println("Suma:"+ suma(num1, num2));
			break;
		case 2:System.out.println("Resta:"+ resta(num1, num2));
			break;
		case 3:System.out.println("Multiplicación:"+ multiplicacion(num1, num2));
			break;
		case 4:System.out.println("División:"+ division(num1, num2));
			break;
		default:System.out.println("No has introducido el valor correcto");
			break;
		}
		
		
	}
	public static void mostrarMenu() {
		String mensaje="1ºSuma\n2ºResta\n3ºMultiplicación\n4ºDivisión";
		System.out.println(mensaje);

	}
	public static int suma(int a, int b) {
		return a+b;
	}
	public static int resta(int a, int b) {
		return a-b;
	}
	public static int multiplicacion(int a ,int b) {
		return a*b;
	}
	public static double division(double a,double b) {
		Scanner sc=new Scanner(System.in);

		//Bucle para validar que el divisor no sea 0
		while(b==0) {
			System.out.println("No puedo dividir entre 0");
				System.out.println("Introduce otro numero que no sea 0");
				b=sc.nextDouble();
			
		}
		return a/b;
	}

	public static void MenuFigura() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca 1er lado:");
		 double lado1=sc.nextDouble();
		System.out.println("Introduzca 2º lado:");
		 double lado2=sc.nextDouble();
		 System.out.println("Introduzca 3er lado");
		 double lado3=sc.nextDouble();
		 System.out.println("Introduzca 4º lado");
		 double lado4=sc.nextDouble();
		 
		if (EsUnCuadrado(lado1,lado2,lado3,lado4)) { 
			//Pedimos 1 lado y calculamos área
			System.out.println("Se trata de un cuadrado");

			System.out.println("Área:"+CalcularÁrea(lado1,lado2,lado3,lado4)+"cm²");
			System.out.println("Perímetro:"+CalcularPer(lado1,lado2,lado3,lado4)+"cm");
			
		}else if(EsUnRectángulo(lado1, lado2, lado3, lado4)){
			System.out.println("Se trata de un rectángulo:");
			
			System.out.println("Área:"+CalcularÁrea(lado1,lado2,lado3,lado4)+"cm²");
			System.out.println("Perímetro:"+CalcularPer(lado1,lado2,lado3,lado4)+"cm");
		
			
		}else {
			System.out.println("Has introducido algo que no es ni un Cuadrado ni un rectángulo.");
		}
			 
	}
	public static boolean EsUnCuadrado(double a,double b,double c,double d) {
		boolean EsUnCuadrado=false;
		if((a==b)&&(a==c)&&(a==d)) {
			EsUnCuadrado=true;
		}
		
		
		return EsUnCuadrado;
	}
	public static boolean EsUnRectángulo(double a,double b,double c,double d) {
		boolean EsUnRect=false;
		if((a==b)&&(c==d)) {
			EsUnRect=true;
		}else if((a==c)&&(b==d)) {
			EsUnRect=true;
			
		}else if((a==d)&&(b==c)) {
			EsUnRect=true;
		}else {
	}
		return EsUnRect;
		}
	
		public static double CalcularÁrea(double a,double b,double c,double d) {		
		if(a!=b) {
			return a*b;
		}else if(a!=c){
			return a*c;
		}else if(a!=d) {
			return a*d;
		}else {
		return a*b;
		}
	}
	public static double CalcularPer(double a,double b,double c,double d) {
		if(a!=b) {
			return (a*2)+(b*2);
		}else if(a!=c){
			return (a*2)+(c*2);
		}else if(a!=d) {
			return (a*2)+(d*2);
		}else {
		return (a*2)+(b*2);
		}
	}

}

