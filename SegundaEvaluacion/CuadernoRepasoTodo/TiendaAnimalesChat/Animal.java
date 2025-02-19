package TiendaAnimalesChat;

public class Animal {
    private String nombre;
    private int edad; // En meses

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPrecioCompra() {
        return 0; // Se sobrescribirá en las subclases
    }

    public double getPrecioVenta() {
        return 0; // Se sobrescribirá en las subclases
    }

    public double getBeneficio() {
        return getPrecioVenta() - getPrecioCompra();
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " meses)";
    }
}
