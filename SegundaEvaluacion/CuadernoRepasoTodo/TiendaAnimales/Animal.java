package TiendaAnimales;
public class Animal {
    protected String nombre;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
