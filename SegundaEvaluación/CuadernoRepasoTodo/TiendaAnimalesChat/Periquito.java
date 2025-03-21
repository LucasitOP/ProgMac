package TiendaAnimalesChat;
public class Periquito extends Animal {
    private String color;
    private double precioCompra;
    private double precioVenta;

    public Periquito(String nombre, String color) {
        super(nombre, 1); // Siempre se adquieren con 1 mes
        this.color = color.toLowerCase();

        if (this.color.equals("verde")) {
            this.precioCompra = 3.0;
            this.precioVenta = 18.0;
        } else if (this.color.equals("azul")) {
            this.precioCompra = 3.5;
            this.precioVenta = 25.0;
        } else {
            this.precioCompra = 0; // Caso inválido
            this.precioVenta = 0;
        }
    }

    public String getColor() {
        return color;
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
        return super.toString() + " - Periquito (Color: " + color + ")";
    }
}
