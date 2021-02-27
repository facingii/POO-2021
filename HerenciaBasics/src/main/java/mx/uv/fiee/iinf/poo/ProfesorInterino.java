package mx.uv.fiee.iinf.poo;

import java.util.Date;

public class ProfesorInterino extends Profesor {

    Date fechaInicioInterinato;

    public ProfesorInterino () {}

    public ProfesorInterino (Date fechaInicioInterinato) {
        this.fechaInicioInterinato = fechaInicioInterinato;
    }

    public ProfesorInterino (String n, String a, int e, int id, Date f) {}

    public Date getFechaInicioInterinato () {
        return fechaInicioInterinato;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" +
                "fechaInicioInterinato=" + fechaInicioInterinato +
                '}';
    }

    @Override
    float importeNomina() {
        return 0;
    }

    @Override
    float impuest() {
        return 0;
    }

}
