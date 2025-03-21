package Cuaderno_Composición_De_Clases;

import java.util.Scanner;

public class ManejadoraPokemons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Pack paquete=new Pack("Primer paquete");
	//Figura figura1=new Figura(20,new Dimension(5,5,5),new Pokemon("Pikachu"));
	double valor=0;
	int ancho=0,alto=0,largo=0;
	String nombre="";
	Figura figura1 = new Figura(0,new Dimension(alto, ancho, largo),new Pokemon(nombre)) ;
	boolean salida=true;
	do {
	System.out.println("Introduce opcion\n1:Añadir pokemon\n2:Figura Valiosa\n3:Valor Coleccion\n4:Volumen Coleccion");
	int opcion=sc.nextInt();
	switch(opcion) {
	case 1: 
		
		System.out.println("Vamos a intentar añadir los pokemons");
	System.out.println("Introduce valor del pokemon");
	valor=sc.nextDouble();
	figura1.setPrecio(valor);
	sc.nextLine();
	System.out.println("Dimensiones:\nAncho:");
	ancho=sc.nextInt();
	System.out.println("Alto:");
	alto=sc.nextInt();
	System.out.println("Largo:");
	largo=sc.nextInt();
	figura1.setDimension(new Dimension(ancho,alto,largo));
	sc.nextLine();
	System.out.println("Nombre del pokemon:");
	nombre=sc.nextLine();
	figura1.setPoke(new Pokemon(nombre));
	
	paquete.AnyadirFigura(figura1);
	break;
	case 2: paquete.masValioso();
	break;
	case 3:paquete.getValorColeccion();
	break;
	case 4:paquete.getVolumenColeccion();
	break;
	}
	}while (salida);
	}

}
