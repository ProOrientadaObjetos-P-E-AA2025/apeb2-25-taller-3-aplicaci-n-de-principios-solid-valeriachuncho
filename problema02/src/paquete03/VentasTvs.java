package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    private ArrayList<Televisor> televisores;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public double obtenerPrecioTotal() {
        double total = 0;
        for (Televisor t : televisores) {
            total += t.obtenerPrecio();
        }
        return total;
    }

    public Televisor obtenerTelevisorMasCaro() {
        Televisor masCaro = televisores.get(0);
        for (Televisor t : televisores) {
            if (t.obtenerPrecio() > masCaro.obtenerPrecio()) {
                masCaro = t;
            }
        }
        return masCaro;
    }

    public String obtenerMarcasVendidas() {
        String resultado = "";
        for (Televisor t : televisores) {
            resultado += t.obtenerMarca() + "\n";
        }
        return resultado;
    }

}
