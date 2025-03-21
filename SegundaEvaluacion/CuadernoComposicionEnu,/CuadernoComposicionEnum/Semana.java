package CuadernoComposicionEnum;
public enum Semana {
    J1(1, Mes.JULIO, 7, Mes.JULIO, 125.25),
    J2(8, Mes.JULIO, 14, Mes.JULIO, 250),
    J3(15, Mes.JULIO, 21, Mes.JULIO, 150),
    J4(22, Mes.JULIO, 28, Mes.JULIO, 175.85),
    J5A1(29, Mes.JULIO, 4, Mes.AGOSTO, 200),
    A2(5, Mes.AGOSTO, 11, Mes.AGOSTO, 250),
    A3(12, Mes.AGOSTO, 18, Mes.AGOSTO, 250.05),
    A4(19, Mes.AGOSTO, 25, Mes.AGOSTO, 175.35),
    A5(26, Mes.AGOSTO, 1, Mes.SEPTIEMBRE, 125);

    private final int diaDesde;
    private final Mes mesDesde;
    private final int diaHasta;
    private final Mes mesHasta;
    private final double precioPorPersona;

    Semana(int diaDesde, Mes mesDesde, int diaHasta, Mes mesHasta, double precioPorPersona) {
        this.diaDesde = diaDesde;
        this.mesDesde = mesDesde;
        this.diaHasta = diaHasta;
        this.mesHasta = mesHasta;
        this.precioPorPersona = precioPorPersona;
    }

    public int getDiaDesde() {
        return diaDesde;
    }

    public Mes getMesDesde() {
        return mesDesde;
    }

    public int getDiaHasta() {
        return diaHasta;
    }

    public Mes getMesHasta() {
        return mesHasta;
    }

    public double getPrecioPorPersona() {
        return precioPorPersona;
    }
}
