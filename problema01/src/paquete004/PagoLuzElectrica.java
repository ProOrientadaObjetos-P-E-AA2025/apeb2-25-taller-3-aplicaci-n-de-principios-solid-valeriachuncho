package paquete004;

public class PagoLuzElectrica extends Pago {
    private String ciudad;
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;

    public PagoLuzElectrica(String ciudad, double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        this.ciudad = ciudad;
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    @Override
    public void calcularPago() {
        if (ciudad.equalsIgnoreCase("Loja")) {
            valorPago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            valorPago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return String.format("Pago Luz (%s): %.2f", ciudad, valorPago);
    }
}
