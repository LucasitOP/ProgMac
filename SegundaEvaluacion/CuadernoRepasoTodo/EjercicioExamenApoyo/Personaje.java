package EjercicioExamenApoyo;
public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void atacar() {
        System.out.println(nombre + " ataca!");
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public void recibirDanio(int cantidad) { this.vida -= cantidad; }
}
