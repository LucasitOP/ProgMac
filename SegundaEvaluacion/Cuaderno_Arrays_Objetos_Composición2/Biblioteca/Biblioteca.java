package Biblioteca;

public class Biblioteca {
    private Libro[] libros;
    private Usuario[] usuarios;
    private int numLibros;
    private int numUsuarios;

    public Biblioteca() {
        this.libros = new Libro[50]; // Máximo 50 libros
        this.usuarios = new Usuario[25]; // Máximo 25 usuarios
        this.numLibros = 0;
        this.numUsuarios = 0;
    }

    public void agregarLibro(Libro libro) {
        if (numLibros < 50) {
            libros[numLibros] = libro;
            numLibros++;
        } else {
            System.out.println("La biblioteca está llena. No se pueden agregar más libros.");
        }
    }

    public void registrarUsuario(Usuario usuario) {
        if (numUsuarios < 25) {
            usuarios[numUsuarios] = usuario;
            numUsuarios++;
        } else {
            System.out.println("No se pueden registrar más usuarios.");
        }
    }

    public void listarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        if (numLibros == 0) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (int i = 0; i < numLibros; i++) {
                System.out.println(libros[i]);
            }
        }
    }

    public void listarLibrosPrestadosAUsuario(String nombreUsuario) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario != null) {
            usuario.listarLibrosPrestados();
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public void prestarLibro(String titulo, String nombreUsuario) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        Libro libro = buscarLibro(titulo);

        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
        } else if (libro == null) {
            System.out.println("Libro no encontrado.");
        } else {
            boolean prestado = usuario.prestarLibro(libro);
            if (prestado) {
                System.out.println("Libro '" + titulo + "' prestado a " + nombreUsuario);
            } else {
                System.out.println("No se pudo prestar el libro. Puede que ya esté prestado o que el usuario tenga el máximo permitido.");
            }
        }
    }

    public void devolverLibro(String titulo, String nombreUsuario) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        Libro libro = buscarLibro(titulo);

        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
        } else if (libro == null) {
            System.out.println("Libro no encontrado.");
        } else {
            boolean devuelto = usuario.devolverLibro(libro);
            if (devuelto) {
                System.out.println("Libro '" + titulo + "' devuelto por " + nombreUsuario);
            } else {
                System.out.println("El usuario no tiene este libro prestado.");
            }
        }
    }

    private Usuario buscarUsuario(String nombre) {
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].getNombre().equalsIgnoreCase(nombre)) {
                return usuarios[i];
            }
        }
        return null;
    }

    private Libro buscarLibro(String titulo) {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return libros[i];
            }
        }
        return null;
    }
}
