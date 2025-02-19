package CuadernoSobreescritura;

public class Movil extends Terminal {
private Tarifa tarifa;
private double costePorMinuto;


	public Movil(String numeroDeTelefono,Tarifa tarifa) {
		super(numeroDeTelefono);
		this.tarifa=tarifa;
		
		
	}
	public void llama(Movil movilAlQueLlama,int segundossacobrar) {
		super.llama(movilAlQueLlama, segundossacobrar);
//Acordarse del += Ya que si pones = solo recoge el último dato, no se suma. 
		this.costePorMinuto += (double)((this.tarifa.getCoste() * segundossacobrar )/ 60)/100;
		
	}
	@Override
	public String toString() {
		return  super.toString() + "- tarificados "+costePorMinuto+" euros";
	}
	
}
