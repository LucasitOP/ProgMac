package TiendaAnimales;

public enum TipoOreja {
ROJO(2.50,24.00),AMARILLO(2.00,20.00);
	private double precioCompra;
	private double precioVenta;
	TipoOreja(double precioCompra,double precioVenta){
		
		this.precioCompra=precioCompra;
		this.precioVenta=precioVenta;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	
}
