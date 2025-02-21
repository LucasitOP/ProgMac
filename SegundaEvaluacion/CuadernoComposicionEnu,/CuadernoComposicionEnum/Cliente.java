package CuadernoComposicionEnum;
public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;

    public Cliente(String nombre, String apellidos, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + "\nDNI:" + dni + "\nTelefono=" + telefono;
    }
}
