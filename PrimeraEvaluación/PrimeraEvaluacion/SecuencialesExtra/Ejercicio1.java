package SecuencialesExtra;

import java.util.Scanner;

public class Ejercicio1 {
	//Vas a capturar el nombre de una persona y el sueldo bruto que va a
	//cobrar. Debes calcular el sueldo neto de dicha persona. Se le descuenta
	//como IRPF un 12% y en concepto de Seguridad Social 5’20%. Mostrar un
	//mensaje : El sueldo neto de xxxxxxxxxx es xxxxxxx euros
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre="";
		double sueldobrut,sueldonet,SSSS=5.20,IRPF=12;
		
		System.out.println("Me podrías ingresar tu nombre:");
		nombre=sc.next();
		System.out.println("¿Cual es su sueldo bruto?");
		sueldobrut=sc.nextDouble();

		sueldonet=(sueldobrut-(sueldobrut*SSSS/100)-(sueldobrut*IRPF/100));
		
		System.out.print("El sueldo neto de "+nombre+" es "+sueldonet+" euros.");
		
		
		
		
		
		
	sc.close();}

}
