package ENUM_Cuaderno;

public enum TipoPelicula {
NOVEDAD(9),ANTIGUA(5);
	private double precio;
	TipoPelicula(double precio)
	{
		this.precio=precio;
	}
	public double getPrecio() {
		return this.precio;
	}
}
