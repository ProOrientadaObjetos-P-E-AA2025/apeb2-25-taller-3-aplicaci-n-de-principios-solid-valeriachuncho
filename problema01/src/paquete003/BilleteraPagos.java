package paquete003;

import paquete004.Pago;
import java.util.ArrayList;

public class BilleteraPagos {
    private ArrayList<Pago> listaPagos = new ArrayList<>();
    private double gastoPagos;
    private String mes;

    public void agregarPago(Pago pago) {
        pago.calcularPago();
        listaPagos.add(pago);
        gastoPagos += pago.getValorPago();
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("REPORTE DE PAGOS\n");
        sb.append("Mes: ").append(mes != null ? mes : "No especificado").append("\n\n");

        for (Pago p : listaPagos) {
            sb.append(p.toString()).append("\n");
        }

        sb.append("\nGasto total: ").append(String.format("%.2f", gastoPagos));
        return sb.toString();
    }
}
