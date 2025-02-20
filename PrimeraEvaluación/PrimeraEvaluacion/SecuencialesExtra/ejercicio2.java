
package SecuencialesExtra;

import java.util.Scanner;

public class ejercicio2 {
	//Dada una cantidad expresada en pies. Pasar dicho valor a las siguientes
	//medidas: pulgadas, yardas, metros y millas por separado.
	//Considera las siguientes equivalencias: 1 milla = 1609 metros, 1 pulgada
	//= 0.0254 metros, 1 yarda = 3 pies, 1 pie = 12 pulgadas.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double pulgadas=12, yardas=1, metros=1 ,millas=0,pies=0;
		
		System.out.print("Dime la cantidad expresada en pies");
		pies=sc.nextInt();
		
		pulgadas=pulgadas*pies;
		
		yardas=(yardas*pies)/3;
		
		metros=0.3048*pies;
		
		millas=pies / 5280;
		
		System.out.println("Cantidad expresada en pulgadas:"+pulgadas);
		System.out.println("Cantidad expresada en yardas:"+yardas);
		System.out.println("Cantidad expresada en metros:"+metros);
		System.out.println("Cantidad expresada en millas:"+millas);
		
		
	sc.close();}

}
