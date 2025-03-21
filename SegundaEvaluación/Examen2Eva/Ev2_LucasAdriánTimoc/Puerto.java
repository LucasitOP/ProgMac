package Ev2_LucasAdriánTimoc;
//Creamos la clase Puerto donde tendremos el array bidimensional y donde podremos crear los metodos para
// después llamarlos al main.

import java.util.Scanner;



public class Puerto {
	// arraybidimensional con 5 filas y 10 columnas (5 muelles, 10amarres)
	embarcacion [][] embarcaciones=new embarcacion[5][10];
	
	
	public void mostrarEstadoDelPuerto() {
		//Crearemos un for para ver los amarres disponibles y los que no, mostrará el toString de la embarcación que esté situada ahí
		for(int i=0;i<embarcaciones.length;i++) {
			embarcacion[]mostrarEmbarcacion=new embarcacion[10];
			int contadorAmarre=0;

			for (int j=0;j<embarcaciones[i].length;j++) {
			//en caso de que sea nulo se pinta la posicion del muelle y el amarre
				if(embarcaciones[i][j]!=null) {
					mostrarEmbarcacion[j]=embarcaciones[i][j];
				}else {
					contadorAmarre++;
				}
				
			}
			System.out.println("-----------------------\nMuelle "+ i+"->"+contadorAmarre+" amarres libres");
			for (int k=0;k<mostrarEmbarcacion.length;k++) {
				if(mostrarEmbarcacion[k]!=null) {
					System.out.print(i+":");
					
					System.out.println(mostrarEmbarcacion[k].toString());
				}else {
					
				}
			}
		}
	}
	public void EntraEmbarcacion(Scanner sc) {
		System.out.println("Introduce muelle:");
		int muelle=sc.nextInt();
		System.out.println("Introduce amarre:");
		int amarra=sc.nextInt();
		sc.nextLine();
		if(embarcaciones[muelle][amarra]==null) {
			//añadimos el muelle;
			
			System.out.println("Introduce el tipo de embarcación\n1-Velero\n2-Yate\n3-Pesquero");
			int opcionTipoEmbarc=sc.nextInt();
			sc.nextLine();
			switch(opcionTipoEmbarc) {
			case 1:
			embarcaciones[muelle][amarra]=anyadirVelero(sc);
				break;
			case 2:embarcaciones[muelle][amarra]=anyadirYate(sc);
				break;
			case 3:embarcaciones[muelle][amarra]=anyadirPesquero(sc);
				break;
			default:System.out.println("Opción no válida.");
				break;
				
			}
		}else {
			System.out.println("El muelle está ocupado y no se puede anyadir aquí");
		}
	}
	public  Veleros anyadirVelero(Scanner sc) {
		//numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco,String tipoDeVela
		try{
			System.out.println("Introduce numDeRegistro:");
		String numDeRegistro=sc.nextLine();
		System.out.println("Introduce el nombre:");
		String nombre=sc.nextLine();
		System.out.println("Introduce la longitud:");
		int longitud=sc.nextInt();
		System.out.println("Introduce el tipo de casco(P-Plano,R-Redondeado,Q-Quilla):");
		String tipoDeCascoStr=sc.next();
		System.out.println("Introdue el tipo de vela");
		String tipoDeVela=sc.next();
		TipoDeCasco tipoDeCasco=null;
		char caracter=tipoDeCascoStr.charAt(0);
		switch(caracter) {
		case 'P':
			 tipoDeCasco=TipoDeCasco.PLANO;
		 break;
		case 'R': tipoDeCasco=TipoDeCasco.REDONDEADO;
		break;
		case 'Q': tipoDeCasco=TipoDeCasco.QUILLA;	
		break;
			default:     System.out.println("tipoDeCasco inválido.");
				break;
		}
		return new  Veleros(numDeRegistro, nombre, longitud, tipoDeCasco, tipoDeVela);
	 } catch (NumberFormatException e) {
	        System.out.println("Error: Debes ingresar un número válido para el precio y la cantidad.");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return null;
	}
	public  Yates anyadirYate(Scanner sc) {
		//numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco,String tipoDeVela
		try{
			System.out.println("Introduce numDeRegistro:");
		String numDeRegistro=sc.nextLine();
		System.out.println("Introduce el nombre:");
		String nombre=sc.nextLine();
		System.out.println("Introduce la longitud:");
		int longitud=sc.nextInt();
		System.out.println("Introduce el tipo de casco(P-Plano,R-Redondeado,Q-Quilla):");
		String tipoDeCascoStr=sc.next();
		sc.nextLine();
		System.out.println("Introduce numero de camarotes");
		int numCamarotes=sc.nextInt();
		TipoDeCasco tipoDeCasco=null;
		char caracter=tipoDeCascoStr.charAt(0);
		switch(caracter) {
		case 'P':
			 tipoDeCasco=TipoDeCasco.PLANO;
		 break;
		case 'R': tipoDeCasco=TipoDeCasco.REDONDEADO;
		break;
		case 'Q': tipoDeCasco=TipoDeCasco.QUILLA;	
		break;
			default:     System.out.println("tipoDeCasco inválido.");
				break;
		}
		return new  Yates(numDeRegistro, nombre, longitud, tipoDeCasco, numCamarotes);
	 } catch (NumberFormatException e) {
	        System.out.println("Error: Debes ingresar un número válido para el precio y la cantidad.");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return null;
	}
	public  Pesqueros anyadirPesquero(Scanner sc) {
		//numDeRegistro, String nombre, int longitud, TipoDeCasco tipoDeCasco,String tipoDeVela
		try{
			System.out.println("Introduce numDeRegistro:");
		String numDeRegistro=sc.nextLine();
		System.out.println("Introduce el nombre:");
		String nombre=sc.nextLine();
		System.out.println("Introduce la longitud:");
		int longitud=sc.nextInt();
		System.out.println("Introduce el tipo de casco(P-Plano,R-Redondeado,Q-Quilla):");
		String tipoDeCascoStr=sc.next();
		
		sc.nextLine();
		System.out.println("Introdue el tipo de pesca");
		String tipoDePesca=sc.nextLine();
		TipoDeCasco tipoDeCasco=null;
		char caracter=tipoDeCascoStr.charAt(0);
		switch(caracter) {
		case 'P':
			 tipoDeCasco=TipoDeCasco.PLANO;
		 break;
		case 'R': tipoDeCasco=TipoDeCasco.REDONDEADO;
		break;
		case 'Q': tipoDeCasco=TipoDeCasco.QUILLA;	
		break;
			default:     System.out.println("tipoDeCasco inválido.");
				break;
		}
		return new  Pesqueros(numDeRegistro, nombre, longitud, tipoDeCasco, tipoDePesca);
	 } catch (NumberFormatException e) {
	        System.out.println("Error: Debes ingresar un número válido para el precio y la cantidad.");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return null;
	}
	public void SalidaEmbarcacion(Scanner sc) {
		//Intento de recoger las posiciones
		System.out.println("Introduce el número de registro");
		String numRegistro=sc.nextLine();
		for(int i=0;i<embarcaciones.length;i++) {
			for(int j=0;j<embarcaciones[i].length;j++) {
				
				if(numRegistro.equalsIgnoreCase(embarcaciones[i][j].getNumDeRegistro())) {
					System.out.println("introduzca la duración de estancia (Calculado en días)");
					int dias=sc.nextInt();
					sc.nextLine();
					double Importe= CalculoImporte(dias, i, j);  
					 System.out.println("Embarcacion con nº de registro "+numRegistro+" debe pagar:"+Importe+" euros. ¿Abonar? S/N");
					 String abonado=sc.next();
					 sc.nextLine();
					 if(abonado.equalsIgnoreCase(numRegistro)) {
					 embarcaciones[i][j]=null;
					 System.out.println("El amarre "+j+" del muelle "+i+" vuelve a estar disponible");
					 }
					return;
				}else {
					System.out.println("No se ha encontrado ninguna embarcacion con ese registro");
			}
				}
			
		}
	}
	public double CalculoImporte(int dias,int muelle,int amarre) {
		double descuento=embarcaciones[muelle][amarre].getTipoDeCasco().getDescuento();
		
		double importeADescontar=(100*dias)*descuento;
		return (100*dias)-importeADescontar;
	}
	

}


		
	
