package Cuaderno_Composición_De_Clases;

public class Pokemon {
	private String nombre;
	private String descripcion;
	private int generacion;
	private String tipo;
	
	public Pokemon(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getGeneracion() {
		return generacion;
	}

	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", descripcion=" + descripcion + ", generacion=" + generacion + ", tipo="
				+ tipo + "]";
	}
	
}
