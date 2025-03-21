package TiendaAnimales;

public class Tortugas extends Animal {
private TipoOreja oreja;
private double precioCompra;
private double precioVenta;
public Tortugas(String nombre, int edad,TipoOreja oreja, double precioCompra, double precioVenta) {
	super(nombre, 1);
	this.oreja=oreja;
	this.precioCompra=oreja.getPrecioCompra();
	this.precioVenta=oreja.getPrecioVenta();
}


}
