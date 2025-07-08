package p2;

import java.util.ArrayList;
import p1.Matricula;

public class TipoMatricula {
    private ArrayList<Matricula> matriculas = new ArrayList<>();
    private double promedioMatriculas;

    public void establecerMatriculas(ArrayList<Matricula> lista) {
        matriculas = lista;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (Matricula m : matriculas) {
            suma += m.obtenerTarifa();
        }
        promedioMatriculas = suma / matriculas.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------ Tarifas de Matrículas ------\n");
        for (Matricula m : matriculas) {
            sb.append(String.format("%-12s : $%,7.2f\n", m.obtenerNombre(), m.obtenerTarifa()));
        }
        sb.append("----------------------------------\n");
        sb.append(String.format("Promedio general : $%,7.2f\n", obtenerPromedioTarifas()));
        sb.append("----------------------------------\n");
        return sb.toString();
    }

}
