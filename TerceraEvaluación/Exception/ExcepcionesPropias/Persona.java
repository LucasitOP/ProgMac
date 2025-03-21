package ExcepcionesPropias;

public class Persona {
	//Creamos la clase para guardar datos de las Personas.
private String nombre;
private String nif;
private int edad;
public Persona(String nombre,String nif,int edad) {
	this.nombre=nombre;
	this.nif=nif;
	this.edad=edad;
	
}
public int getEdad() {
	return edad;
}


}
