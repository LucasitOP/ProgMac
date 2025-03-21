package Biblioteca;

public class Usuario {
    private String nombre;
    private Libro[] librosPrestados;
    private int contadorLibros; // Controla cuántos libros tiene prestados

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new Libro[3]; // Máximo 3 libros
        this.contadorLibros = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void listarLibrosPrestados() {
        System.out.println("Libros prestados a " + nombre + ":");
        if (contadorLibros == 0) {
            System.out.println("No tiene libros prestados.");
        } else {
            for (int i = 0; i < contadorLibros; i++) {
                System.out.println("- " + librosPrestados[i].getTitulo());
            }
        }
    }

    public boolean prestarLibro(Libro libro) {
        if (contadorLibros < 3 && libro.isDisponible()) {
            librosPrestados[contadorLibros] = libro;
            contadorLibros++;
            libro.prestar();
            return true;
        }
        return false;
    }

    public boolean devolverLibro(Libro libro) {
        for (int i = 0; i < contadorLibros; i++) {
            if (librosPrestados[i] == libro) {
                libro.devolver();
                librosPrestados[i] = librosPrestados[contadorLibros - 1]; // Mueve el último libro al espacio liberado
                librosPrestados[contadorLibros - 1] = null;
                contadorLibros--;
                return true;
            }
        }
        return false;
    }
}
