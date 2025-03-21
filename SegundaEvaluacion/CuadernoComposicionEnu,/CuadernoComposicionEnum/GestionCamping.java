package CuadernoComposicionEnum;
public class GestionCamping {

    public static void AnadirReserva(Reserva[] reservas, Semana[] semanas, int personas, String nombre, String apellidos, String DNI, String telefono, int porcentajeDescuento) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = new Reserva(semanas, personas, nombre, apellidos, DNI, telefono, porcentajeDescuento);
                break;
            }
        }
    }

    public static void obtenerReservas(Reserva[] reservas, Semana semana) {
        boolean hayReservas = false;
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                for (Semana s : reserva.getSemanas()) {
                    if (semana == null || s == semana) {
                        System.out.println(reserva);
                        hayReservas = true;
                    }
                }
            }
        }
        if (!hayReservas) {
            System.out.println("No hay reservas para la semana indicada.");
        }
    }

    public static boolean eliminarReserva(String codigo, Reserva[] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null && reservas[i].getCodigo().equals(codigo)) {
                reservas[i] = null;
                // Reorganizar el array
                for (int j = i; j < reservas.length - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }
                reservas[reservas.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Reserva[] reservas = new Reserva[50];

        // Prueba de añadir reservas
        AnadirReserva(reservas, new Semana[] {Semana.J1, Semana.J2}, 4, "Marcos", "Gil", "00000000T", "9112345678", 10);
        AnadirReserva(reservas, new Semana[] {Semana.J1}, 6, "Lucas", "Alameda", "11111111H", "636478569", 0);
        AnadirReserva(reservas, new Semana[] {Semana.J5A1, Semana.A2, Semana.A5}, 2, "Susana", "Perez", "33333333P", "9112345695", 7);
        AnadirReserva(reservas, new Semana[] {Semana.A2}, 2, "Luz", "Casanova", "22222222J", "657412036", 0);

        // Mostrar todas las reservas
        System.out.println("Todas las reservas:");
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                System.out.println(reserva);
            }
        }

        // Eliminar una reserva
        eliminarReserva("J1J2000T381", reservas);

        // Mostrar todas las reservas después de eliminar
        System.out.println("Después de eliminar la reserva:");
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                System.out.println(reserva);
            }
        }

        // Mostrar reservas de la semana A2
        System.out.println("Reservas de la Semana A2:");
        obtenerReservas(reservas, Semana.A2);
    }
}
