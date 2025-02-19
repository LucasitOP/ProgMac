package ENUM_Cuaderno;

import java.util.Scanner;

public class ManejadoraMes {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el mes");
		String mes=sc.next();
		Mes.valueOf(mes).getEstacion();
		System.out.println("La estación es:"+Mes.valueOf(mes).getEstacion());
		
		
	sc.close();}
}
