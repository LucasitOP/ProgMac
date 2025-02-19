package TiendaAnimalesChat;
public class Pez extends Animal {
    private double temperaturaAgua;
    private static final double PRECIO_COMPRA = 1.25;
    private static final double PRECIO_VENTA = 9.75;

    public Pez(String nombre, double temperaturaAgua) {
        super(nombre, 2); // Siempre se adquieren con 2 meses
        this.temperaturaAgua = temperaturaAgua;
    }

    public double getTemperaturaAgua() {
        return temperaturaAgua;
    }

    @Override
    public double getPrecioCompra() {
        return PRECIO_COMPRA;
    }

    @Override
    public double getPrecioVenta() {
        return PRECIO_VENTA;
    }

    @Override
    public String toString() {
        return super.toString() + " - Pez (Temperatura: " + temperaturaAgua + "°C)";
    }
}
