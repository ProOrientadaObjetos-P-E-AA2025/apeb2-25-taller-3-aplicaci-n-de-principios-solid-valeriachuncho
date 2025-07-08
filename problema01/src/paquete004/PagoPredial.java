package paquete004;

public class PagoPredial extends Pago {
    private double valorPropiedad;
    private double porcentaje;

    public PagoPredial(double valorPropiedad, double porcentaje) {
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularPago() {
        valorPago = valorPropiedad - ((valorPropiedad * porcentaje) / 100);
    }

    @Override
    public String toString() {
        return String.format("Pago Predial (Propiedad %.2f): %.2f", valorPropiedad, valorPago);
    }
}
