package examen1EV;

import java.util.Arrays;

public class Informe {

	public static void main(String[] args) {
		//función 3 del informe
		//Crearemos dos arrays directamente con los nombres de los agentes y sus intentos fallidos.
		String Agentes[] = {"Hermione","Harry","Draco","Ron","Luna","Sirus","Dobby"};
		int IntentosFallido[]= {2,3,6,4,3,1,3};
		
		//Realizaremos primero el total de todos los fallos y de la media
		int totalfallos=0;
		//Creo unos contadores para que más adelante podamos separar los agentes en normal,sospechoso e critico.
		int contadornormal=0,contadorsospechoso=0,contadorcritico=0;
		for(int i =0;i<IntentosFallido.length;i++) {
		totalfallos=IntentosFallido[i]+totalfallos;
		//Aquí empiezo a crear unos contadores para mas adelante
		if(IntentosFallido[i]<=3) {
			contadornormal++;
		}else if(IntentosFallido[i]<=5) {
			contadorsospechoso++;
		}else {
			contadorcritico++;
		}
		}
		double media=totalfallos/IntentosFallido.length;
		//Sacamos por pantalla y realizamos media
		System.out.println("Se han realizado un total de "+totalfallos+" intentos fallidos.");
		System.out.println("La media es de "+media+ " intentos fallidos por persona.");
		// Aquí terminamos la primera parte del Informe.
		// Ahora realizaremos la clasificación de los agentes.
		
		//Volveré atrás en el bucle for e utilizare una variable para guardar  los que están por encima y etc.
		
		//Ya he creado y tengo los contadores con las personas normales,sospechosas y criticas. Ahora hay que plasmarlo en un bucle y enlazar el Array Agentes
		System.out.println(contadorcritico +" usuarios están por encima de esta media");
		//Realizamos un bucle para agentes normales
		System.out.print("Agentes normales:");
		//Reutilizaremos y machamos el bucle for ya que crearé otro array con ellos independientes.
		//Creamos nuevos arrays con el tamaño idóneo para sacar únicamente los 3 tipos que tenemos
		String agentesnormales[]=new String[contadornormal];
		String agentessospechosos[]=new String[contadorsospechoso];
		String[] agentescriticos=new String[contadorcritico];
		//int para tener la posición en el array correctamente
		int posnormal=0,possospecho=0,poscritic=0;
		//Reutilizamos el bucle para agregar el array Agentes + el guión + el nº de intentos
		for(int i =0;i<IntentosFallido.length;i++) {
			
			if(IntentosFallido[i]<=3) {
				agentesnormales[posnormal]=(Agentes[i]+"-"+(IntentosFallido[i]));
				posnormal++;
			}else if(IntentosFallido[i]<=5) {
				agentessospechosos[possospecho]=(Agentes[i]+"-"+(IntentosFallido[i]));
				possospecho++;
			}else {
				agentescriticos[poscritic]=(Agentes[i]+"-"+(IntentosFallido[i]));
				poscritic++;
			}
			}
		//Ahora los sacamos por pantalla
		System.out.println("Intentos normales:"+Arrays.toString(agentesnormales));
		System.out.println("Intentos sospechosos:"+Arrays.toString(agentessospechosos));
		System.out.println("Intentos críticos:"+Arrays.toString(agentescriticos));
		
		
		
		
	}

}
