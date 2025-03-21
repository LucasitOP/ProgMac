package GestionDepartamento;

import java.util.Arrays;

public class Profesor {
private String nombre,apellido;
private Modulo []AsignaturasImparte;

public Profesor(String nombre,String apellido,Modulo[]AsignaturasImparte) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.AsignaturasImparte=AsignaturasImparte;
}

@Override
public String toString() {
	return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", AsignaturasImparte="
			+ Arrays.toString(AsignaturasImparte) + "]";
}

}
