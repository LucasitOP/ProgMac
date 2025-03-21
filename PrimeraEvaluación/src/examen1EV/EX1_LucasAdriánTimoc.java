package examen1EV;

import java.util.Arrays;
import java.util.Scanner;

/*Analisis:
 * Vamos a realizar un menu de una Agencia Nacional de Ciberseguridad para que tenga una mejor protección.
 * Tendra un inicio con su contraseña, y a partir de ahí mostraremos el menu:
 * 1-Realiza un cifrado César
 * 2-Genera una contraseña segura
 * 3-Contiene un informe de actividades sospechosas(agentes que han fallado en el acceso con la contraseña)
 * 
 * Diseño:
 * Para empezar vamos a tener una contraseña fija que va a ser:D6a1M24. En ella realizaremos un bucle para que la pida
 * repetidamente la contraseña, en caso de que el agente introduzca una contraseña erronea tendremos un contador de 3 que irá
 * disminuyendo, al llegar a 0 saltará el bloqueo y un mensaje para contactar con un administrador.
 * 
 * Proseguimos con el menú, limitaremos con un switch para que en caso de que el agente introduzca una opción errónea lo describa por
 * pantalla y elija una opción correcta. Este bucle se realizará hasta que el agente introduzca 4 que será la salida.
 *  
 * para la primera funcion (cifrado César) tendremos que pedir al agente dos datos, un String y un Int.
 * En el String guardaremos el mensaje que quiere cifrar el cuál tendremos que utilizar un replace ya que el cifrado se basa en un
 * movimiento en el abecedario de posiciones. En el Int se introduce las posiciones que se mueven para cifrar el mensaje.
 * Se dará por hecho que el agente introduce un int correcto.
 * 
 * Segunda función(Contraseña segura), para ello realizaremos una contraseña aleatoria que cumpla las condiciones del enunciado:
 * letras mayusculas, minusculas, números y caracteres especiales, teniendo almenos una letra un número y un carácter especial, teniendo también 
 * una longitud entre 8 y 20.
 * 
 * Tercera función(Informe), tendremos que crear arrays unidimensionales de los nombres y los intentos fallidos de los agentes
 * con intentos fallidos, a partir de ahí los repartiremos en Normal(menos de 3 fallos),Sospechoso(3-5)y crítico(+5).
 *  Aparte realizaremos un total de los intentos fallidos y generaremos una media.
 *  
 * Cuarta función(Salida).
 * 
 */
public class EX1_LucasAdriánTimoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Empezamos con la contraseña
		final String contraseña = "D6a1M24";
		String contraseñaagente = "";
		int contadorFallos = 3;
		boolean acceso = true;
		// Crearemos un bucle while para la petición de la contraseña
		while (acceso) {
			System.out.println("Introduce la contraseña de acceso al Sistema de la ANC");
			System.out.println("Contraseña incorrecta.Intentos restantes:" + contadorFallos);

			contraseñaagente = sc.nextLine();
//En caso de la contraseña no sea igual vamos decreciendo el valor de nuestro contadorFallos
			if (!contraseña.equals(contraseñaagente)) {
				contadorFallos--;
//En caso de que contador llegue a 0 Sacamos por pantalla y salimos del bucle
				if (contadorFallos == 0) {
					System.out.println("Contraseña incorrecta.Intentos restantes:" + contadorFallos);
					System.out.println("Acceso bloqueado.Contacte con el administrador");
					acceso = false;
				}
			}
//Nos queda únicamente la opción correcta, salimos del bucle	
			else {
				acceso = false;
			}

		}

		// Crearemos este if ya que en caso de que el acceso estuviese bloqueado, se
		// tendría que saltar todo el Menú y salirse de todo
		if ((contadorFallos >= 1)) {
			// Ahora si podemos empezar creando el Menu
			boolean salidaMenu = true;
			int opcion = 0;
			while (salidaMenu) {
				System.out.println("Bienvenid@ al Sistema de la ANC");
				System.out.println(
						"Selecciona una opción(1 a 4):\n1. Cifrar un mensaje(Cifrado César)\n2. Generar una contraseña segura\n3. Informe de actividades sospechosas\n4. Salir");
				opcion = sc.nextInt();
				sc.nextLine();//Limpiar
				switch (opcion) {
				// Función Encriptar César
				case 1:
					String textoaencriptar="";
					char[]caracterespañol= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','P','Q','R','S','T','U','V','W','X','Y','Z' };
					System.out.println("Introduce el texto que vas a encriptar:");
					textoaencriptar=sc.nextLine();
					System.out.println("Introduce el desplazamiento");
					int desplazamiento=sc.nextInt();
					/*
					 * lo realizaremos con el ASCII, primero lo pasaremos todo a mayúsculas ya que la salida va a ser en
					 * mayúsculas. 
					 */
					char movimientodeletras=0;
					//Crearemos un array para almacenar los caracteres e ir transformandolos a nuestro gusto
					 char[]caracteres=new char[textoaencriptar.length()];
					 //Iniciamos con un bucle for para diferenciar los espacios y a continuación
					 //Realizar la indexación del caracter en el array
					 for(int i =0;i<textoaencriptar.length();i++) {
						 if(Character.isWhitespace(textoaencriptar.charAt(i))) {
							caracteres[i]=textoaencriptar.charAt(i); 
						 }else {
							 //Crearemos otro bucle donde le daremos la mayuscula, recordando que tiene que ser
							 // asi su salida y vamos agregando al array la frase a encriptar
							for(int j=0;j<=desplazamiento;j++) {
							
							 caracteres[i]=(char)textoaencriptar.toUpperCase().charAt(i);	
							 movimientodeletras=(char) (((char)caracteres[i])+j);
							 //Añado un if para que al pasarse la Z vuelva a la A
							 if(movimientodeletras>=91) {
								 movimientodeletras=caracterespañol[0];
							 }else {
								 caracteres[i]=caracterespañol[movimientodeletras-65];
							 }
							}
						 }
						 
						 
						 
					 }
					 String textoconvertido="";
					 //Creamos una manera para imprimir el array en una frase y lo sacamos por pantalla
					for(int q=0;q<caracteres.length;q++) {
						textoconvertido=textoconvertido+caracteres[q];
					}
					//Al realizarlo en ASCII tendremos que obviar la ñ 
					System.out.println("El mensaje cifrado en clave "+desplazamiento+" es:"+textoconvertido);
					

					break;

				case 2:
					// Vamos a crear una contraseña segura rando, está tendrá un seguimiento que
					// empieza por letramin,letramayus,numero,caracter..... en ese orden.
					// Crearemos la longitud de manera aleatoria entre 8 y 20
					int longitud = (int) ((Math.random() * 13) + 8);
					String contraseñasegura = "";
					boolean finalbucle = true;
					while (finalbucle) {
						// De esta manera crearemos un caracter especial aleatorio
						// Lo realizaremos con el método ASCII
						char randomcaracter = (char) ((Math.random() * 7) + 33);
						// En este caso en ASCI el 34 son " por lo que si sale, pasara a 33 que es !
						if (randomcaracter == 34) {
							randomcaracter = 33;
						}
						// Ocurre lo mismo con el 39 y 64, donde 39 es' y 64 la @
						else if (randomcaracter == 39) {
							randomcaracter = 64;

						}
						// Ahora crearemos un númeor random entre el 1 y el 9 y se añade
						int randomnumero = (int) ((Math.random() * 9) + 1);
						// Ahora lo haremos con una letra minúscula
						char randomletraminuscula = (char) ((Math.random() * 26 + 65));
						// Ahora con la letra mayúscula
						char randomletramayuscula = (char) ((Math.random() * 26 + 97));
						// Vamos añadiendo todas las opciones y nos aseguramos que va a tener mínimo 1
						// de cada
						contraseñasegura = (String) ((char) randomcaracter + contraseñasegura);
						contraseñasegura = (String) (randomnumero + contraseñasegura);
						contraseñasegura = (String) ((char) randomletraminuscula + contraseñasegura);
						contraseñasegura = (String) ((char) randomletramayuscula + contraseñasegura);

						// Cuando lleguen a la misma longitud el bucle se acabará y sacaremos por
						// pantalla la contraseña
						if (longitud < contraseñasegura.length()) {
							finalbucle = false;
							System.out.println("Contraseña generada:" + contraseñasegura);
						}

					}
					break;
				case 3:
					// función 3 del informe
					// Crearemos dos arrays directamente con los nombres de los agentes y sus
					// intentos fallidos.
					String Agentes[] = { "Hermione", "Harry", "Draco", "Ron", "Luna", "Sirus", "Dobby" };
					int IntentosFallido[] = { 2, 3, 6, 4, 3, 1, 3 };

					// Realizaremos primero el total de todos los fallos y de la media
					int totalfallos = 0;
					// Creo unos contadores para que más adelante podamos separar los agentes en
					// normal,sospechoso e critico.
					int contadornormal = 0, contadorsospechoso = 0, contadorcritico = 0;
					for (int i = 0; i < IntentosFallido.length; i++) {
						totalfallos = IntentosFallido[i] + totalfallos;
						// Aquí empiezo a crear unos contadores para mas adelante
						if (IntentosFallido[i] <= 3) {
							contadornormal++;
						} else if (IntentosFallido[i] <= 5) {
							contadorsospechoso++;
						} else {
							contadorcritico++;
						}
					}
					double media = totalfallos / IntentosFallido.length;
					// Sacamos por pantalla y realizamos media
					System.out.println("Se han realizado un total de " + totalfallos + " intentos fallidos.");
					System.out.println("La media es de " + media + " intentos fallidos por persona.");
					// Aquí terminamos la primera parte del Informe.
					// Ahora realizaremos la clasificación de los agentes.

					// Volveré atrás en el bucle for e utilizare una variable para guardar los que
					// están por encima y etc.

					// Ya he creado y tengo los contadores con las personas normales,sospechosas y
					// criticas. Ahora hay que plasmarlo en un bucle y enlazar el Array Agentes
					System.out.println(contadorcritico + " usuarios están por encima de esta media");
					// Realizamos un bucle para agentes normales

					// Reutilizaremos y machamos el bucle for ya que crearé otro array con ellos
					// independientes.
					// Creamos nuevos arrays con el tamaño idóneo para sacar únicamente los 3 tipos
					// que tenemos
					String agentesnormales[] = new String[contadornormal];
					String agentessospechosos[] = new String[contadorsospechoso];
					String[] agentescriticos = new String[contadorcritico];
					// int para tener la posición en el array correctamente
					int posnormal = 0, possospecho = 0, poscritic = 0;
					// Reutilizamos el bucle para agregar el array Agentes + el guión + el nº de
					// intentos
					for (int i = 0; i < IntentosFallido.length; i++) {

						if (IntentosFallido[i] <= 3) {
							agentesnormales[posnormal] = (Agentes[i] + "-" + (IntentosFallido[i]));
							posnormal++;
						} else if (IntentosFallido[i] <= 5) {
							agentessospechosos[possospecho] = (Agentes[i] + "-" + (IntentosFallido[i]));
							possospecho++;
						} else {
							agentescriticos[poscritic] = (Agentes[i] + "-" + (IntentosFallido[i]));
							poscritic++;
						}
					}
					// Ahora los sacamos por pantalla
					System.out.println("Intentos normales:" + Arrays.toString(agentesnormales));
					System.out.println("Intentos sospechosos:" + Arrays.toString(agentessospechosos));
					System.out.println("Intentos críticos:" + Arrays.toString(agentescriticos));

					break;
				// Hemos creado la función para que salga del bucle y salga por pantalla el
				// mensaje.
				case 4:
					salidaMenu = false;
					System.out.println("Se ha salido del sistema de manera segura.");
					break;

				// Es la primera que hemos creado, En caso de que no sea 1,2,3,4 que salga este
				// mensaje.
				default:
					System.out.println("Opción no válida.Inténtalo de nuevo.");
					break;
				}

			}

		}
		sc.close();
	}
}
