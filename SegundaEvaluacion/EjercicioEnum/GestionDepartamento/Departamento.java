package GestionDepartamento;

import java.util.Arrays;

public class Departamento {
private String nombre;
private Profesor[] profesores;

public Departamento(String nombre,int numeroprofesores) {
	this.nombre=nombre;
	this.profesores=new Profesor[numeroprofesores];
}
public int anyadirProfesor(Profesor profesor) {
	for (int i=0;i<this.profesores.length;i++) {
		if(profesores[i]==null) {
			profesores[i]=profesor;

			return i;
		}
	}return -1;
}
public int profesoresAsignados() {
	int totalprofesores=0;
	for (int i=0;i<this.profesores.length;i++) {
		if(profesores[i]==null) {
			totalprofesores++;
		}
	}
	return totalprofesores;
}
//Arreglar el toString
@Override
public String toString() {
	return "Departamento [nombre=" + nombre + ", profesores=" + Arrays.toString(profesores) + "]";
}

}
