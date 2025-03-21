package TiendaAnimales;

public enum ColorPlumaje {
	VERDE(3.00, 18.00), AZUL(3.50, 25.00);

	private double precioCompra;
	private double precioVenta;

	ColorPlumaje(double precioCompra, double precioVenta) {

		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

}
