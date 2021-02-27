package mx.uv.fiee.iinf.poo;

public abstract class Profesor extends Persona {
    private String idProfesor;

    public Profesor () {
        System.out.println ("Creating Profesor");
    }

    public Profesor (String n, String a, int e, String id) {}

    public String getIdProfesor () {
        return idProfesor;
    }

    public void setIdProfesor (String idProfesor) {
        this.idProfesor = idProfesor;
    }

    String mostrarDatos () {
        return "";
    }

    @Override
    public String toString () {
        return "Profesor{" +
                "idProfesor='" + idProfesor + '\'' +
                '}';
    }

    abstract float importeNomina ();

    abstract float impuest ();
}
