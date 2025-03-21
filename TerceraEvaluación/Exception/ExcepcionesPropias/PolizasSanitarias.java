package ExcepcionesPropias;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PolizasSanitarias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona mayorEdad = null;
		Persona menorEdad=null;
		int edadmedia=0;
		int totalRecaudado=0;
		int contadorPersonas=0;
		boolean salida=false;
		while(!salida) {
			Persona Nuevapersona=capturarDatos(sc);
			try{
				if(Nuevapersona==null) {
					throw new ExcepcionInvalida("Hemos recogido mal los numeros");
					
				}
				if(contadorPersonas==0) {
			}
				mayorEdad=Nuevapersona;
				menorEdad=Nuevapersona;
				
			}catch(ExcepcionInvalida ei) {
				ei.getMessage();
			}
			Mayor(mayorEdad, Nuevapersona);
			Menor(menorEdad, Nuevapersona);
			SumarMediaEdad(Nuevapersona, edadmedia, contadorPersonas);
		}
	}

	// Metodo para capturar datos
	public static Persona capturarDatos(Scanner sc)throws ExcepcionInvalida {
		try {
			System.out.println("Introduce nombre:");
			String nombre = sc.next();
			//Excepcion para que el nombre contenga letras
			if (nombre == null || !nombre.matches("[A-Za-zÁÉÍÓÚÑáéíóúñ ]+")) {
				throw new ExcepcionInvalida("El nombre ingresado no es válido");
			}

			System.out.println("Introduce NIF:");
			String nif = sc.next();
			//Excepcion para que tengamos 8 digitos y un numero en el NIF
			if (nif == null || !nif.matches("\\d{8}[A-HJ-NP-TV-Z]")) {
				throw new ExcepcionInvalida("el nif ingresado no es válido");
			}
			System.out.println("Introduce edad:");
			int edad = sc.nextInt();
			if (edad < 18) {
				throw new ExcepcionInvalida("Eres muy pequeño, no te podemos realizar la poliza.");
			}
			if (edad > 64) {
				throw new ExcepcionInvalida("Eres muy mayor , no te podemos realizar la poliza");
			}
			return new Persona(nombre,nif,edad);
		} catch (ExcepcionInvalida ei) {
			System.out.println(ei.getMessage());
		} catch (InputMismatchException ime) {
			System.out.println("La edad debe ser un número");
		}
		return null;

	}
	//Metodo para recoger mayor
	public static void Mayor(Persona personaMayor,Persona personaAComparar) {	
		
		try{
			if(personaAComparar==null) {
				throw new ExcepcionInvalida("Ha habido un error en la recogida de algún dato");
			}
			if(personaAComparar.getEdad()>personaMayor.getEdad()) {
			
		personaMayor=personaAComparar;
		}
		}catch(ExcepcionInvalida ei)
		{ ei.getMessage();
			}
		}
	//Metodo para recoger el menor
	public static void Menor(Persona personaMenor,Persona personaAComparar) {
		try {
			if(personaAComparar==null) {
				throw new ExcepcionInvalida("Ha habido un error en la recogida de datos");
			}
		if(personaAComparar.getEdad()<personaMenor.getEdad()) {
			personaMenor=personaAComparar;
		}
	}catch(ExcepcionInvalida ei) {
		ei.getMessage();
	}
	}
	//Metodo para sacar la media de edad, queremos tener un contador de personas y también para la edad
	//Recibe el objeto de la persona la edad y la suma, y el contador
	public static void SumarMediaEdad(Persona personaAgregarEdad,int sumaedadmedia,int contador) {
		sumaedadmedia+=personaAgregarEdad.getEdad();
		contador++;
	}
	

}
