package TiendaAnimalesChat;
public class Tortuga extends Animal {
    private String tipoOrejas;
    private double precioCompra;
    private double precioVenta;

    public Tortuga(String nombre, String tipoOrejas) {
        super(nombre, 1); // Siempre se adquieren con 1 mes
        this.tipoOrejas = tipoOrejas.toLowerCase();

        if (this.tipoOrejas.equals("orejas rojas")) {
            this.precioCompra = 2.5;
            this.precioVenta = 24.0;
        } else if (this.tipoOrejas.equals("orejas amarillas")) {
            this.precioCompra = 2.0;
            this.precioVenta = 20.0;
        } else {
            this.precioCompra = 0; // Caso inválido
            this.precioVenta = 0;
        }
    }

    public String getTipoOrejas() {
        return tipoOrejas;
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
        return super.toString() + " - Tortuga (Tipo: " + tipoOrejas + ")";
    }
}
