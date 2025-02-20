package examen1EV;

public class contraseñasegura {

	public static void main(String[] args) {
		//Vamos a crear una contraseña segura random.
		//Crearemos la longitud de manera aleatoria entre 8 y 20
		int longitud =(int) ((Math.random()*13)+8);
		String contraseñasegura="";
		boolean finalbucle= true;
		while(finalbucle){
			//De esta manera crearemos un caracter especial aleatorio
			//Lo realizaremos con el método ASCII
			char randomcaracter=(char) ((Math.random()*7)+33);  
			//En este caso en ASCI el 34 son " por lo que si sale, pasara a 33 que es !
			if(randomcaracter==34) {
				randomcaracter=33;	
			}
			//Ocurre lo mismo con el 39 y 64, donde 39 es' y 64 la @
			else if (randomcaracter==39) {
				randomcaracter=64;

		}
			//Ahora crearemos un númeor random entre el 1 y el 9 y se añade
			int randomnumero=(int) ((Math.random()*9)+1);
			//Ahora lo haremos con una letra minúscula
			char randomletraminuscula=(char)((Math.random()*26+65));
			//Ahora con la letra mayúscula
			char randomletramayuscula=(char)((Math.random()*26+97));
//Vamos añadiendo todas las opciones y nos aseguramos que va a tener mínimo 1 de cada
			contraseñasegura=(String) ( (char)randomcaracter+contraseñasegura); 	
			contraseñasegura=(String)(randomnumero+contraseñasegura);
			contraseñasegura=(String)((char)randomletraminuscula+contraseñasegura);
			contraseñasegura=(String)((char)randomletramayuscula+contraseñasegura);


			//Cuando lleguen a la misma longitud el bucle se acabará y sacaremos por pantalla la contraseña
			if(longitud<contraseñasegura.length()) {
				finalbucle=false;
				System.out.println("Contraseña generada:"+contraseñasegura);
			}
			
		}
	}

}
