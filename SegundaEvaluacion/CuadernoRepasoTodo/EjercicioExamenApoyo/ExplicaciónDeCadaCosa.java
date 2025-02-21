package EjercicioExamenApoyo;

public class ExplicaciónDeCadaCosa {
	/*
	    **Funcionalidades Implementadas:**

	    1. **Uso de Arrays Bidimensionales (Matriz de Celdas)**:
	        - Se ha creado un tablero representado como una matriz bidimensional de tipo `TipoCelda[][]`, que es un array de celdas.
	        - El tablero tiene un tamaño configurado de 5x5 (aunque puedes modificarlo).
	        - Se utiliza el array bidimensional para organizar las posiciones de los personajes dentro del tablero.

	    2. **Uso de Enum (`TipoCelda`)**:
	        - Se ha definido un `enum` llamado `TipoCelda`, que tiene tres posibles valores: `VACIO`, `JUGADOR` y `ENEMIGO`.
	        - Este enum se utiliza para asignar y verificar los tipos de las celdas en el tablero, representando las posiciones vacías y ocupadas por personajes.

	    3. **Encapsulación**:
	        - Los atributos `nombre` y `vida` de la clase `Personaje` están encapsulados como **privados**. Esto significa que no pueden ser accedidos directamente desde fuera de la clase.
	        - Se proporcionan **métodos públicos** como `getNombre()`, `getVida()` y `recibirDanio(int cantidad)` para obtener valores y modificar el estado de los objetos.

	    4. **Herencia**:
	        - Se ha utilizado la **herencia** al crear las clases `Jugador` y `Enemigo`, que **heredan de la clase base `Personaje`**.
	        - Ambas clases especializan el comportamiento del personaje base, pero con sus propias características. Por ejemplo, cada una tiene una implementación personalizada del método `atacar()`.

	    5. **Polimorfismo**:
	        - El **polimorfismo** se aplica cuando creamos objetos de tipo `Personaje` que en realidad son instancias de las clases `Jugador` o `Enemigo`.
	        - El método `atacar()` es sobrescrito en ambas subclases (`Jugador` y `Enemigo`), lo que permite que el mismo método tenga un comportamiento diferente según el tipo de objeto que lo invoque.
	        - Ejemplo: cuando se invoca `atacar()` en un objeto de tipo `Personaje`, el comportamiento será diferente si el objeto es un `Jugador` o un `Enemigo`.

	    6. **Funciones y Métodos**:
	        - Se han utilizado **métodos** como `atacar()`, `colocarPersonaje()`, `mostrarTablero()`, etc.
	        - El método `atacar()` de la clase base `Personaje` es sobrescrito en `Jugador` y `Enemigo`, permitiendo que cada tipo de personaje tenga su propio comportamiento de ataque.
	        - El método `colocarPersonaje()` en la clase `Tablero` coloca personajes en celdas específicas y actualiza las celdas correspondientes en el array bidimensional.
	        - El método `mostrarTablero()` imprime la representación visual del tablero en la consola, mostrando a los jugadores como "J" y a los enemigos como "E".

	    7. **Representación del Tablero**:
	        - El tablero se muestra en consola usando caracteres representativos:
	          - **"J"** para las celdas ocupadas por un **jugador**.
	          - **"E"** para las celdas ocupadas por un **enemigo**.
	          - **"-"** para las celdas vacías.

	    8. **Modularización**:
	        - Se ha modularizado el código separando las clases en archivos individuales, lo que facilita su mantenimiento, reutilización y comprensión.

	    **En resumen:**
	    - El código implementa un juego básico de tablero con personajes que pueden atacar. La estructura está basada en la programación orientada a objetos utilizando clases, herencia, polimorfismo y encapsulación. El tablero está representado por una matriz bidimensional, y los personajes son colocados en él usando el `enum` para controlar el tipo de celda.

	*/


}
