package paquete005;

import paquete003.BilleteraPagos;
import paquete004.*;

public class Principal {
    public static void main(String[] args) {
        BilleteraPagos billetera = new BilleteraPagos();
        billetera.setMes("Julio");

        billetera.agregarPago(new PagoAguaPotable("casa", 2.20, 100.2, 0.2));
        billetera.agregarPago(new PagoAguaPotable("comercial", 2.20, 100.2, 0.2));
        billetera.agregarPago(new PagoLuzElectrica("Loja", 10.20, 80, 0.5));
        billetera.agregarPago(new PagoLuzElectrica("Quito", 10.20, 80, 0.5));
        billetera.agregarPago(new PagoPredial(56000, 10));
        billetera.agregarPago(new PagoPredial(40000, 20));
        billetera.agregarPago(new PagoTelefonoConvencional(6.20, 100, 0.2));
        billetera.agregarPago(new PagoTelefonoConvencional(6.20, 100, 0.2));

        System.out.println(billetera);
    }
}
