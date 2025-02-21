package EjercicioExamenApoyo;
public class Tablero {
    private TipoCelda[][] celdas;
    private Personaje[][] personajes;

    public Tablero(int filas, int columnas) {
        celdas = new TipoCelda[filas][columnas];
        personajes = new Personaje[filas][columnas];

        // Inicializar el tablero con celdas vacías
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j] = TipoCelda.VACIO;
            }
        }
    }

    // Método para colocar un personaje en el tablero
    public void colocarPersonaje(int fila, int columna, Personaje personaje) {
        if (celdas[fila][columna] == TipoCelda.VACIO) {
            personajes[fila][columna] = personaje;
            celdas[fila][columna] = (personaje instanceof Jugador) ? TipoCelda.JUGADOR : TipoCelda.ENEMIGO;
        }
    }

    // Método para mostrar el tablero
    public void mostrarTablero() {
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                switch (celdas[i][j]) {
                    case JUGADOR:
                        System.out.print(" J "); break;
                    case ENEMIGO:
                        System.out.print(" E "); break;
                    default:
                        System.out.print(" - "); break;
                }
            }
            System.out.println();
        }
    }
}
