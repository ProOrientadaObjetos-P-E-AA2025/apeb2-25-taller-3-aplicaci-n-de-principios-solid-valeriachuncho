package paquete004;

public class PagoTelefonoConvencional extends Pago {
    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    @Override
    public void calcularPago() {
        valorPago = tarifa + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        return String.format("Pago Teléfono: %.2f", valorPago);
    }
}
