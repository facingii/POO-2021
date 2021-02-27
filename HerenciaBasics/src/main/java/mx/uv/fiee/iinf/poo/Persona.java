package mx.uv.fiee.iinf.poo;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona () {
        System.out.println ("Creating Persona");
    }

    public Persona (String n, String a, int e) {}

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos () {
        return apellidos;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad () {
        return edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }
}
