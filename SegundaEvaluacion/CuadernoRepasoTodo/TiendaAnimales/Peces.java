package TiendaAnimales;
public class Peces extends Animal {
    private int temperatura;
    private double precioCompra;
    private double precioVenta;

    public Peces(String nombre, int edad, int temperatura) {
        super(nombre, edad);
        this.temperatura = temperatura;
        precioCompra = 1.25;
        precioVenta = 9.75;
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
        return super.toString() + ", Temperatura: " + temperatura + ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta;
    }
}
