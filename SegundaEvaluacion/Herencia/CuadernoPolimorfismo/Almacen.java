package CuadernoPolimorfismo;
import java.util.Scanner;
public class Almacen {
	Scanner sc=new Scanner(System.in);
	Articulos[] articulosDelAlmacen=new Articulos[100];
	
	public  Hardware anyadirHardware(Scanner sc) {
		try{
			System.out.println("Introduce codigo:");
		
		String codigo=sc.nextLine();
		if(codigo.length()!=3) {
			throw new IllegalArgumentException("Tienes que escribir un codigo de 3 caracteres");
		}
		System.out.println("Introduce el nombre:");
		String nombre=sc.nextLine();
		System.out.println("Introduce el precio:");
		int precio=sc.nextInt();
		System.out.println("Introduce la cantidad de stock que tendremos:");
		int stock=sc.nextInt();
		sc.nextLine();
		System.out.println("¿Es un periferico? (t/f)");
		String perifericoString=sc.nextLine();
		boolean periferico=false;
		if(perifericoString.equalsIgnoreCase("T")) {
			periferico=true;
		}
		return new Hardware(codigo, nombre, precio,stock, periferico);
		
	} catch (NumberFormatException e) {
        System.out.println("Error: Debes ingresar un número válido para el precio y la cantidad.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
		return null;
	}
	public  Software anyadirSoftware(Scanner sc) {
		try{
			System.out.println("Introduce codigo:");
		String codigo=sc.nextLine();
		if(codigo.length()!=3) {
			throw new IllegalArgumentException("El coódigo tiene que tener 3 caracteres");
		}
		System.out.println("Introduce el nombre:");
		String nombre=sc.nextLine();
		System.out.println("Introduce el precio:");
		int precio=sc.nextInt();
		System.out.println("Introduce la cantidad de stock que tendremos:");
		int stock=sc.nextInt();
		sc.nextLine();
		System.out.println("Introdue el tipo de software");
		String tipo=sc.nextLine();
		
		return new Software(codigo, nombre, precio,stock, tipo);
	 } catch (NumberFormatException e) {
	        System.out.println("Error: Debes ingresar un número válido para el precio y la cantidad.");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return null;
	}
	public void agregarArticulo(Articulos articulo) {
		for (int i=0;i<articulosDelAlmacen.length;i++) {
			if(articulosDelAlmacen[i]==null) {
				articulosDelAlmacen[i]=articulo;
				return;
			}
		}
		System.out.println("No se ha encontrado ningún hueco");
	}
	public void mostrarArticulos() {
		for (Articulos articulo:articulosDelAlmacen) {
			if(articulo==null) {
			}else{
				System.out.println(articulo);
			}	}
		}
	}

