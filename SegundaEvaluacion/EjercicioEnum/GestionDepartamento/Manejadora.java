package GestionDepartamento;

public class Manejadora {

	public static void main(String[] args) {
		Departamento dpt=new Departamento("Informática",6);
		
		
		Profesor profe1=new Profesor("Marta","Catalá",new Modulo[] {Modulo.PROGRAMACION,Modulo.BASEDEDATOS});
		Profesor profe2=new Profesor("Ruth","Lospitao",new Modulo[] {Modulo.PROGRAMACION,Modulo.BASEDEDATOS,Modulo.ENTORNOS});
		 
		dpt.anyadirProfesor(profe1);
		dpt.anyadirProfesor(profe2);
		
		System.out.println(dpt.toString());
		}
	}


