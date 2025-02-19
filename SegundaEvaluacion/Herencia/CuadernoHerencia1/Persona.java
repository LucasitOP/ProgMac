package CuadernoHerencia1;

public class Persona {
private String nombre;
private int telefono;
private int edad;

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre,int telefono,int edad) {
		this.nombre=nombre;
		this.telefono=telefono;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona :nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad  ;
	}

}
