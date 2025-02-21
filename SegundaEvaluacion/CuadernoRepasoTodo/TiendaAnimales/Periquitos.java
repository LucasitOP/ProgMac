package TiendaAnimales;
public class Periquitos extends Animal {
    private ColorPlumaje color;
    private double precioCompra;
    private double precioVenta;

    public Periquitos(String nombre, int edad, ColorPlumaje color) {
        super(nombre, edad);
        this.color = color;
        this.precioCompra = color.getPrecioCompra();
        this.precioVenta = color.getPrecioVenta();
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
        return super.toString() + ", Color: " + color + ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta;
    }
}


