package TiendaAnimales;

import java.util.Scanner;

public class MainTienda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Animal[][] animales = new Animal[3][];
		animales[0] = new Peces[8];
		animales[1] = new Periquitos[5];
		animales[2] = new Tortugas[7];
		double beneficio=0;
		
		
		Menu();
		int opcion=sc.nextInt();
		switch (opcion) {
		case 1:VentaDeUnAnimal(sc, animales,beneficio);
			break;
		case 2:
			break;
		case 3:
			break;
		default:System.out.println("Opción no válida pruebe otra vez.");
			break;
			
		}
		
		
		
		sc.close();
	}
	public static void Menu() {
		System.out.println("Introduce la opción que deseas realizar\n1-Venta Animal\n2-Adquisicion nuevo Animal\n3-Salir");
		
	}
	public static void VentaDeUnAnimal(Scanner sc, Animal[][] animales,double beneficio) {
	    System.out.println("Introduce el animal que quieres vender:\nPez\nPeriquito\nTortuga");
	    String opcionVentaAnimal = sc.next();
	    sc.nextLine(); // Limpiar el buffer
	    
	    int fila = -1;
	    switch (opcionVentaAnimal.toLowerCase()) {
	        case "pez":
	            fila = 0;
	            break;
	        case "periquito":
	            fila = 1;
	            break;
	        case "tortuga":
	            fila = 2;
	            break;
	        default:
	            System.out.println("No has introducido un valor correcto.");
	            return;
	    }
	    int contador = 0;
	    for (int i = 0; i < animales[fila].length; i++) {
	        if (animales[fila][i] != null) {
	            System.out.println((i + 1) + " - " + animales[fila][i]);
	        } else {
	            contador++;
	        }
	    }

	    if (contador == animales[fila].length) {
	        System.out.println("No se ha encontrado ningún animal seleccionado.");
	        return;
	    }

	    System.out.println("Seleccione el número del animal a vender:");
	    int posicion = sc.nextInt();
	    sc.nextLine(); 

	    posicion--; // Convertir a índice base 0	

	    if (posicion < 0 || posicion >= animales[fila].length || animales[fila][posicion] == null) {
	        System.out.println("Selección inválida. No hay un animal en esa posición.");
	        return;
	    }
// Obetenemos el beneficio antes de borrar el animal
	    double beneficioAnimal=CalcularBeneficio(animales, fila, posicion);
	    beneficio+=beneficioAnimal;
	    animales[fila][posicion] = null;
	    System.out.println("Animal vendido con éxito.");
	    System.out.println("El beneficio ha sido:"+beneficioAnimal);
	}

	public static double CalcularBeneficio(Animal[][]animales,int fila, int columna) {
		
		return animales[fila][columna].getBeneficio();
	}

}
