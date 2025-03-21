package TiendaAnimalesChat;

public enum ColorPeriquito {
    VERDE(3.0, 18.0),
    AZUL(3.5, 25.0);

    private final double precioCompra;
    private final double precioVenta;

    ColorPeriquito(double precioCompra, double precioVenta) {
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
