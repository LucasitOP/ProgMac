package CuadernoComposicionEnum;
import java.util.Arrays;
import java.util.Random;

public class Reserva {
    private String codigo;
    private Semana[] semanas;
    private int totalPersonas;
    private double importe;
    private Cliente cliente;
    private int porcentajeDescuento;

    public Reserva(Semana[] semanas, int totalPersonas, String nombre, String apellidos, String dni, String telefono, int porcentajeDescuento) {
        this.semanas = semanas;
        this.totalPersonas = totalPersonas;
        this.cliente = new Cliente(nombre, apellidos, dni, telefono);
        this.porcentajeDescuento = porcentajeDescuento;
        generarCodigo(dni);
        calcularImporte();
    }

    private void generarCodigo(String dni) {
        String dias = Arrays.toString(semanas).replaceAll("[\\[\\],]", "").replace(" ", "");
        String dniParte = dni.substring(dni.length() - 3, dni.length() - 1) + dni.charAt(dni.length() - 1);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 300;
        this.codigo = dias + dniParte + numeroAleatorio;
    }

    private void calcularImporte() {
        double total = 0;
        for (Semana semana : semanas) {
            total += semana.getPrecioPorPersona();
        }
        this.importe = total * totalPersonas;
        if (porcentajeDescuento > 0) {
            double descuento = (importe * porcentajeDescuento) / 100;
            this.importe -= descuento;
        }
    }

    @Override
    public String toString() {
        String result = "*************** Reserva " + codigo + " ***************\n";
        result += cliente + "\n";

        for (Semana semana : semanas) {
            result += "Semana del " + semana.getDiaDesde() + " de " + semana.getMesDesde()
                    + " al " + semana.getDiaHasta() + " de " + semana.getMesHasta() + "\n";
        }

        result += "Personas: " + totalPersonas + "\n";
        result += "----------------------------------------------------\n";
        result += "Importe: " + importe + " euros\n";

        if (porcentajeDescuento > 0) {
            double descuento = (importe * porcentajeDescuento) / 100;
            result += "Descuento(" + porcentajeDescuento + "%): -" + descuento + " euros\n";
            result += "Importe final: " + (importe - descuento) + " euros\n";
        } else {
            result += "*****************************************************\n";
        }
        return result;
    }

    public String getCodigo() {
        return codigo;
    }

	public Semana[] getSemanas() {
		return semanas;
	}


}
