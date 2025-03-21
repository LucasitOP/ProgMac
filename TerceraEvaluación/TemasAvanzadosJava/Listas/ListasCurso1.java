package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasCurso1 {

	public static void main(String[] args) {
		List<String> miLista= new ArrayList<String>();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		for (String elemento:miLista) {
			System.out.println(elemento);
		}
		//Funciones lambda (funcion anonima de un codigo compacto) se conoce tambien como programacion funcional
		miLista.forEach(numeros ->{
			System.out.println("Elemento:"+numeros);
		}  );//operador flecha ->
		
		//Métodos de referencia
		miLista.forEach(System.out::println);
		
		
		
		List<String>nombres= Arrays.asList("Pedro","Lucas","Gabriela");
		nombres.forEach(System.out::println);
	
	
	}

}
