package EjercicioExamenApoyo;
public class Juego {
    public static void main(String[] args) {
        Tablero tablero = new Tablero(5, 5);

        // Crear personajes
        Jugador jugador1 = new Jugador("Heroe");
        Enemigo enemigo1 = new Enemigo("Orco");

        // Colocar personajes en el tablero
        tablero.colocarPersonaje(1, 1, jugador1);
        tablero.colocarPersonaje(3, 3, enemigo1);

        // Mostrar tablero
        tablero.mostrarTablero();

        // Ejemplo de polimorfismo
        System.out.println("\nAtaques:");
        jugador1.atacar();
        enemigo1.atacar();
    }
}
