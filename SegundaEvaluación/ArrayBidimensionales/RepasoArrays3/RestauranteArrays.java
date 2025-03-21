package RepasoArrays3;

import java.util.Scanner;

public class RestauranteArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	char	ArrayComensales[][]=new char[5][6];
		for (int i=0;i<ArrayComensales.length;i++) {
			for (int j=0;j<ArrayComensales[i].length;j++) {
				ArrayComensales[i][j]='_';
			}
		}
		boolean repetir=true;
		do {
		mostrarEstado(ArrayComensales);
		System.out.println("Ingrese el número de personas (negativo para salir): ");
        int numComensales = sc.nextInt();
        
        //Primero la salida por si introduce un numero negativo
        if(numComensales<0) {
        	repetir=false;
        	System.out.println("Hasta Pronto!!");
        	break;
        }
        //Ahora en caso de que ponga un número más grande que 6 , que serían los comensales permitidos en mi programa
        if(numComensales>6) {
        	System.out.println("No se pueden realizar la reserva a más de 6 personas");
        	continue;
        }
        
        //Realizamos la busqueda de donde añadimos a los comensales
        AsignarMesa(ArrayComensales, numComensales);
        
        //Salida por si nuestro array está completo
        if(RestauranteLleno(ArrayComensales)) {
        	System.out.println("El restaurante se encuentra lleno y no aceptamos más personas.");
        repetir=false;
        }
        
		}while(repetir);
		
		
		sc.close();
	}
	public static void mostrarEstado(char ArrayComensales[][]) {
System.out.print("*********************************\n"
		+ "Estado actual de las mesas:\n"
		+ "*********************************");
for (int i=0;i<ArrayComensales.length;i++) { 
	System.out.println();
	System.out.print("Mesa"+(i+1)+":[");
	for (int j=0;j<ArrayComensales[i].length;j++) {
	System.out.print(ArrayComensales[i][j]+" ");
	if(j==(ArrayComensales.length)){
		System.out.println("]");
	}
	}
	}
System.out.println("*********************************");

	}
	//Comprobar Si hay alguna mesa completamente vacia
	public static int ComprobarMesaVacia(char ArrayComensales[][]) {
		for (int i=0;i<ArrayComensales.length;i++) {
			if(ArrayComensales[i][0]=='_') {
				return i; //Con esto haremos que devuelva el indice de la ubicacion donde la mesa esta libre(la fila)
			}
		}
		return -1; //En caso contrario se devuelve -1
	}
	//Comprobamos sitios para agregar la mesa
	public static int ComprobarSitioLibre(char ArrayComensales[][],int numero) {
		for(int i=0;i<ArrayComensales.length;i++) {
			int contador=0; //lo creamos aquí para machacar la variable contador
			for(int j=0;j<ArrayComensales[i].length;j++) {
				if(ArrayComensales[i][j]=='_') {
					contador++;
				}
			
			}
			if(contador>=numero) {
				return i; //Conseguimos la fila donde se pueden incluir los comensales.
			}
		}
		return -1;
	}
	public static void AsignarMesa(char ArrayComensales[][], int numComensales) {
		int mesavacia= ComprobarMesaVacia(ArrayComensales);
		
		if(mesavacia!=-1) {
			System.out.println("Has sido agregado a la mesa "+(mesavacia+1));
			for (int j=0;j<numComensales;j++) {
				ArrayComensales[mesavacia][j]='*';
				
			}
			return;
		}
		int mesaConEspacio=ComprobarSitioLibre(ArrayComensales, numComensales);
		
		if(mesaConEspacio!=-1) {
			System.out.println("Has sido agregado a la mesa"+(mesaConEspacio+1));
			int asientosOcupados=0;
			for (int j=0;j<ArrayComensales[mesaConEspacio].length && asientosOcupados<numComensales;j++){
				if(ArrayComensales[mesaConEspacio][j]=='_') {
					ArrayComensales[mesaConEspacio][j]='*';
					asientosOcupados++;
				}
			}
			return;
		}
	    System.out.println("No hay mesas disponibles para el grupo.");

	}

	public static boolean RestauranteLleno(char [][]ArrayComensales) {
		for(int i=0;i<ArrayComensales.length;i++) {
			for(int j=0;j<ArrayComensales[i].length;j++) {
				if(ArrayComensales[i][j]=='_') {
					return false;
				}
			}
		}
		return true;
	}
	

}
