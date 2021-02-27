package mx.uv.fiee.iinf.poo;

public class ProfesorTitular extends Profesor {
    public ProfesorTitular (String n, String a, int e, String id) {}

    public ProfesorTitular () {
        System.out.println ("Creating ProfesorTitular");
    }

    @Override
    float importeNomina () {
        return 0;
    }

    @Override
    float impuest() {
        return 0;
    }
}
