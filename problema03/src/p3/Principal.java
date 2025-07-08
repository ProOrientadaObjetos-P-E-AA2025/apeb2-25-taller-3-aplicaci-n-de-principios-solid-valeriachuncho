package p3;

import java.util.ArrayList;
import p1.*;
import p2.TipoMatricula;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> lista = new ArrayList<>();

        MatriculaCampamento m1 = new MatriculaCampamento();
        m1.establecerTarifa();

        MatriculaColegio m2 = new MatriculaColegio();
        m2.establecerTarifa();

        MatriculaEscuela m3 = new MatriculaEscuela();
        m3.establecerTarifa();

        MatriculaJardin m4 = new MatriculaJardin();
        m4.establecerTarifa();

        MatriculaMaternal m5 = new MatriculaMaternal();
        m5.establecerTarifa();

        lista.add(m1);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        lista.add(m5);

        TipoMatricula tipo = new TipoMatricula();
        tipo.establecerMatriculas(lista);
        tipo.establecerPromedioTarifas();

        System.out.println(tipo);
    }
}
