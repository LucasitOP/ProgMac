package Biblioteca;

public class BibliotecaManejadora {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros
        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", "Editorial X", 500));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "Editorial Y", 400));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", "Editorial Z", 350));

        // Registrar usuarios
        Usuario usuario1 = new Usuario("Juan Pérez");
        biblioteca.registrarUsuario(usuario1);

        Usuario usuario2 = new Usuario("Ana Gómez");
        biblioteca.registrarUsuario(usuario2);

        // Consultar lista de libros existentes en la biblioteca
        biblioteca.listarLibros();

        // Consultar los libros prestados a un usuario
        biblioteca.listarLibrosPrestadosAUsuario("Juan Pérez");

        // Prestar libros
        biblioteca.prestarLibro("1984", "Juan Pérez");
        biblioteca.prestarLibro("El Quijote", "Juan Pérez");

        // Consultar los libros prestados a Juan después de los préstamos
        biblioteca.listarLibrosPrestadosAUsuario("Juan Pérez");

        // Consultar lista de libros disponibles después de los préstamos
        biblioteca.listarLibros();

        // Devolver un libro
        biblioteca.devolverLibro("1984", "Juan Pérez");

        // Consultar lista de libros prestados a Juan después de la devolución
        biblioteca.listarLibrosPrestadosAUsuario("Juan Pérez");

        // Consultar lista de libros disponibles después de la devolución
        biblioteca.listarLibros();
    }
}