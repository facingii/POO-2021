package mx.uv.fiee.poo;

public class Main {

    public static void main (String [] args) {
        ChainedList<Integer> list = new ChainedList<>(); // se crea una nueva instancia de la lista
        list.add (1); // asignándole valores
        list.add (2);
        list.add (3);
        list.add (4);
        list.add (5);

        System.out.println ("Contenido original de la lista");
        list.show (); // muestra los valores iniciales

        list.remove (3); // remueve un valor de la lista
        System.out.println ("\nDespués de remover al elemento 3");
        list.show (); // muestra los valores después de la eliminación
    }

}
