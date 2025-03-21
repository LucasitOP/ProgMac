package EjercicioExamenApoyo;
public class Enemigo extends Personaje {
    public Enemigo(String nombre) { 
        super(nombre, 50); 
    }

    @Override
    public void atacar() { 
        System.out.println(getNombre() + " lanza una bola de fuego!"); 
    }
}
