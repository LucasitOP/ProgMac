package Cuaderno2Ejercicio1;

import java.io.IOException;

public class Rectángulo {
	int base,altura;



	public Rectángulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	void Pintar() {
		
		char Array[][]=new char[altura][base];
		System.out.println("Pintamos:");

		for(int i=0;i<Array.length;i++) {
			for(int j=0;j<Array[i].length;j++) {
				
				//Array[i][j]='+';
				System.out.print("+");
			}System.out.println();
		}
		//System.out.println(Arrays.deepToString(Array));
		
	}
	void Pintar(int a,int b) throws IOException {
		
		char Array[][]=new char[a][b];
		System.out.println("ESCRIBE EL SIMBOLO A PINTAR");
		char Simbolo=(char) System.in.read();
		System.out.println("Pintamos con el signo seleccionado");
		for(int i=0;i<Array.length;i++) {
			for(int j=0;j<Array[i].length;j++) {
				System.out.print(Simbolo);
			}
		System.out.println();}
	}
	void Invertir() {
		

		char Array[][]=new char[base][altura];

	/*	int invertir;
		invertir=base;
		base=altura;
		altura=invertir;*/		
		System.out.println("Invertimos y pintamos");

		for(int i=0;i<Array.length;i++) {
			for(int j=0;j<Array[i].length;j++) {
				System.out.print("+");
			}System.out.println();
		}
		
	}
	void CalcularArea() {
		System.out.println(base*altura);
	}
	void CalcularPerimetro() {
		System.out.println( (altura*2)+(base*2));
	}
}

