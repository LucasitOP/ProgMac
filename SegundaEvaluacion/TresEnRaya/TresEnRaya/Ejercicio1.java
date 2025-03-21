package TresEnRaya;


		import java.util.Scanner;
		import java.util.Random;

		public class Ejercicio1 {

		    public static void main(String[] args) {
		        char[][] tablero = {
		            {'1', '2', '3'},
		            {'4', '5', '6'},
		            {'7', '8', '9'}
		        };

		        Scanner scanner = new Scanner(System.in);
		        boolean turnoUsuario = true;
		        int movimientos = 0;
		        boolean ganador = false;

		        while (movimientos < 9 && !ganador) {
		            MostrarPosicion(tablero);
		            int posicion = 0;

		            if (turnoUsuario) {
		                System.out.println("Tu turno (X). Elige una posición:");
		                posicion = SolicitarPosicion(scanner, tablero);
		                ActualizarTablero(tablero, posicion, 'X');
		            } else {
		                System.out.println("Turno de la máquina (O)...");
		                posicion = GenerarPosicionAleatoria(tablero);
		                ActualizarTablero(tablero, posicion, 'O');
		            }

		            ganador = VerificarSiGanador(tablero);
		            if (ganador) {
		                MostrarPosicion(tablero);
		                if (turnoUsuario) {
		                    System.out.println("¡Felicidades! Has ganado.");
		                } else {
		                    System.out.println("La máquina ha ganado.");
		                }
		                return;
		            }

		            turnoUsuario = !turnoUsuario;
		            movimientos++;
		        }
		        
		        MostrarPosicion(tablero);
		        System.out.println("¡Empate!");
		    }

		    public static void MostrarPosicion(char[][] tablero) {
		        System.out.println();
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(" " + tablero[i][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();
		    }

		    public static int SolicitarPosicion(Scanner scanner, char[][] tablero) {
		        int posicion = 0;
		        boolean posicionValida = false;

		        while (!posicionValida) {
		            if (scanner.hasNextInt()) {
		                posicion = scanner.nextInt();
		                if (posicion >= 1 && posicion <= 9 && !ComprobarPosicion(posicion, tablero)) {
		                    posicionValida = true;
		                } else {
		                    System.out.println("Posición inválida. Intenta de nuevo:");
		                }
		            } else {
		                scanner.next();
		                System.out.println("Debes ingresar un número entre 1 y 9.");
		            }
		        }
		        return posicion;
		    }

		    public static boolean ComprobarPosicion(int posicion, char[][] tablero) {
		        int fila = (posicion - 1) / 3;
		        int columna = (posicion - 1) % 3;
		        
		        if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
		            return true;
		        } else {
		            return false;
		        }
		    }

		    public static boolean VerificarSiGanador(char[][] tablero) {
		        for (int i = 0; i < 3; i++) {
		            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
		                return true;
		            }
		            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
		                return true;
		            }
		        }

		        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
		            return true;
		        }
		        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
		            return true;
		        }
		        
		        return false;
		    }

		    public static int GenerarPosicionAleatoria(char[][] tablero) {
		        Random random = new Random();
		        int posicion = 0;
		        boolean posicionValida = false;

		        while (!posicionValida) {
		            posicion = random.nextInt(9) + 1;
		            if (!ComprobarPosicion(posicion, tablero)) {
		                posicionValida = true;
		            }
		        }

		        return posicion;
		    }

		    public static void ActualizarTablero(char[][] tablero, int posicion, char simbolo) {
		        int fila = (posicion - 1) / 3;
		        int columna = (posicion - 1) % 3;
		        tablero[fila][columna] = simbolo;
		    }
		}
