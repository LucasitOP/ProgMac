package TiendaAnimales;

public class Animal {
	private String nombre;
	private int edad;

	public Animal() {

	}

	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public double getPrecioCompra() {
		return 0; // Se sobrescribirá en las subclases
	}

	public double getPrecioVenta() {
		return 0; // Se sobrescribirá en las subclases
	}

	public double getBeneficio() {
		return getPrecioVenta() - getPrecioCompra();
	}

}
