package paquete006;

import paquete003.BilleteraPagos;
import paquete004.*;

public class Principal {
    public static void main(String[] args) {
        BilleteraPagos billetera = new BilleteraPagos();
        billetera.setMes("Agosto");

        for (double[] datos : DatosAgua.datosComerciales()) {
            billetera.agregarPago(new PagoAguaPotable("comercial", datos[0], datos[1], datos[2]));
        }

        for (double[] datos : DatosAgua.datosCasas()) {
            billetera.agregarPago(new PagoAguaPotable("casa", datos[0], datos[1], datos[2]));
        }

        for (double[] datos : DatosLuz.datosLoja()) {
            billetera.agregarPago(new PagoLuzElectrica("Loja", datos[0], datos[1], datos[2]));
        }

        for (double[] datos : DatosLuz.datosGeneral()) {
            billetera.agregarPago(new PagoLuzElectrica("Quito", datos[0], datos[1], datos[2]));
        }

        for (double[] datos : DatosPropiedades.datos()) {
            billetera.agregarPago(new PagoPredial(datos[0], datos[1]));
        }

        for (double[] datos : DatosTelefono.datos()) {
            billetera.agregarPago(new PagoTelefonoConvencional(datos[0], datos[1], datos[2]));
        }

        System.out.println(billetera);
    }
}
