package Cuaderno_String2;
/*
 * 1. Partir una frase en dos. A continuación partir cada una de las dos mitades en
otras dos. Mostrar las cuatro partes. (Si en cualquier división el número es
impar la segunda mitad tendrá un carácter más). Probarlo con “Esta es la
frase que vamos a partir en cuatro”

 */
public class ejercicio1 {

	public static void main(String[] args) {
		String frase="Esta es la frase que vamos a partir en cuatro";
		String subfrase1="",subfrase2="",subfrase11="",subfrase22="",subfrase33="",subfrase44="";
		int fraselongitud=frase.length();
		subfrase1=frase.substring(0, fraselongitud/2);
		subfrase2=frase.substring(fraselongitud/2,fraselongitud);
		int subfraselongitud1=subfrase1.length();
		int subfraselongitud2=subfrase2.length();
		subfrase11=subfrase1.substring(0,subfraselongitud1/2);
		subfrase22=subfrase1.substring(subfraselongitud1/2,subfraselongitud1);
		subfrase33=subfrase2.substring(0,subfraselongitud2/2);
		subfrase44=subfrase2.substring(subfraselongitud2/2,subfraselongitud2);
		System.out.println("Primera parte:"+subfrase11+"\n Segunda parte:"+subfrase22+"\n Tercera parte:"+subfrase33+"\n Cuarta parte:"+subfrase44);
	
	}

}
