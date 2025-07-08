package paquete004;

public abstract class Pago {
    protected double valorPago;

    public abstract void calcularPago();

    public double getValorPago() {
        return valorPago;
    }

    @Override
    public String toString() {
        return String.format("Valor del pago: %.2f", valorPago);
    }
}
