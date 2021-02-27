package mx.uv.fiee.iinf.poo;

public class EntryPoint {

    public static void main (String [] args) {
        ProfesorTitular titular = new ProfesorTitular ();

        Profesor p = new Profesor () {
            @Override
            float importeNomina() {
                return 0;
            }

            @Override
            float impuest() {
                return 0;
            }
        };
    }

}
