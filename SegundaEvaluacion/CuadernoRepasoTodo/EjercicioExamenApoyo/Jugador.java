package EjercicioExamenApoyo;
public class Jugador extends Personaje {
    public Jugador(String nombre) { 
        super(nombre, 100); 
    }

    @Override
    public void atacar() { 
        System.out.println(getNombre() + " ataca con una espada!"); 
    }
}
