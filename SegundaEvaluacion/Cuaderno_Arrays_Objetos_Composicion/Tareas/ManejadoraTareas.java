package Tareas;

import java.util.Scanner;

public class ManejadoraTareas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Tareas[] arraytareas=new Tareas[10];
		arraytareas[0]=new Tareas(100,"Descripcion 1",false);
		arraytareas[1]=new Tareas(101,"Descripcion 2",true);
		arraytareas[2]=new Tareas(102,"Descripcion 3",true);
		arraytareas[3]=new Tareas(103,"Descripcion 4",true);
		arraytareas[4]=new Tareas(104,"Descripcion 5",true);
		arraytareas[5]=new Tareas(105,"Descripcion 6",false);
		arraytareas[6]=new Tareas(106,"Descripcion 7",false);
		arraytareas[7]=new Tareas(107,"Descripcion 8",false);
		arraytareas[8]=new Tareas(108,"Descripcion 9",false);
		arraytareas[9]=new Tareas(109,"Descripcion 10",true);
		
		CambiarEstado(sc, arraytareas);
		MostrarCompletadas(arraytareas);
		MostrarPendientes(arraytareas);
		EliminarTabla(sc,arraytareas);
	}
	public static void CambiarEstado(Scanner sc,Tareas[]tarea) {
		System.out.println("Selecciona el id");
		int compararid=sc.nextInt();
		boolean encontrado=false;
		for (int i=0;i<tarea.length;i++) {
			if(compararid==tarea[i].getId()) {
				encontrado=true;
				if(tarea[i].isCompletada()==true) {
					System.out.println("La tarea ya estaba completada");
				}else {
					tarea[i].setCompletada(true);
					System.out.println("Cambiado!");
				}
			}
			
		}
		if (encontrado==false) {
			System.out.println("No se ha encontrado ninguna coincidencia");
		}
		
	}
	public static void MostrarCompletadas(Tareas[]tarea) {
		for (int i=0;i<tarea.length;i++) {
			if(tarea[i].isCompletada()==true) {
				System.out.println(tarea[i].toString());
			}
		}
	}
	public static void MostrarPendientes(Tareas[]tarea) {
		for (int i=0;i<tarea.length;i++) {
			if(tarea[i].isCompletada()==false) {
				System.out.println(tarea[i].toString());
			}
		}
	}
	//Metodo eliminar:
	//Tenemos que crear un nuevo array en el que copiemos todos las tareas sin la que se quiera eliminar
	public static void EliminarTabla(Scanner sc,Tareas[]tarea) {
		System.out.println("Selecciona el id");
		int compararid=sc.nextInt();
		boolean encontrado=false;
		for (int i=0;i<tarea.length;i++) {
			if(compararid==tarea[i].getId()) {
				encontrado=true;
				tarea[i]=null;
				System.out.println("Eliminada!");
			}
			
		}
		if (encontrado==false) {
			System.out.println("No se ha encontrado ninguna coincidencia");
		}
	}

}
