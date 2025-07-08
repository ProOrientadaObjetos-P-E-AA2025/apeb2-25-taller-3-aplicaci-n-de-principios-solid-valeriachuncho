package paquete004;

public class PagoAguaPotable extends Pago {
    private String tipo;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    @Override
    public void calcularPago() {
        valorPago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        if (tipo.equalsIgnoreCase("comercial")) {
            valorPago += 15;
        }
    }

    @Override
    public String toString() {
        return String.format("Pago Agua (%s): %.2f", tipo, valorPago);
    }
}
