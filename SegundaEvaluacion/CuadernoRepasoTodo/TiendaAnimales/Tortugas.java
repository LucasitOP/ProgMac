package TiendaAnimales;
public class Tortugas extends Animal {
    private TipoOreja oreja;
    private double precioCompra;
    private double precioVenta;

    public Tortugas(String nombre, int edad, TipoOreja oreja) {
        super(nombre, edad);
        this.oreja = oreja;
        this.precioCompra = oreja.getPrecioCompra();
        this.precioVenta = oreja.getPrecioVenta();
    }

    @Override
    public double getPrecioCompra() {
        return precioCompra;
    }

    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Oreja: " + oreja + ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta;
    }
}
