package mx.uv.fiee.poo;

/**
 * Representa la lista enlazada personalizada que almacena valores
 * dentro de elementos definidos por la clase Node
 *
 * @param <T> tipo de dato de los valores almacenados
 */
public class ChainedList<T> {

    private Node<T> first; // campo privado que mantiene referencia del primer nodo de la cadena

    /**
     * Agrega el nuevo elemento creando un nuevo objeto Node que lo almacenará encadenándolo
     * a los nodos anteriores, si estos existen.
     *
     * @param value nuevo valor a ser almacenado
     */
    public void add (T value) {
        Node<T> link = new Node<> (value); // crea al nuevo nodo asignando el valor a ser almacenado
        if (first == null) { // si no existe el primer nodo
            first = link; // el nuevo nodo se asigna como tal
            return;
        }

        // para encadenar el nuevo nodo a los existentes la lista debe
        // ser recorrida desde el inicio hasta llegar al nodo final
        Node<T> tmp = first;
        while (tmp.getNext () != null) { // el último nodo no tendrá asignado el campo next
            tmp = tmp.getNext ();
        }

        // una vez encontrado el último nodo se asigna la referencia del nuevo nodo
        tmp.setNext (link); // en su campos next
    }

    /**
     * La remoción de un elemento de la lista requiere eliminar el nodo completo que lo hospeda,
     * eso implica pasar su referencia al siguiente nodo al campo correspondiente en el nodo anterior.
     *
     * @param value elemento a ser eliminado
     */
    public void remove (T value) {
        Node<T> node = first; // mantiene un apuntador al nodo actual
        Node<T> prev = null; // mantiene un apuntador al nodo siguiente

        while (node != null) {
            if (node.getValue () == value) {
                if (prev == null) { // si no existe un nodo previo
                    first = node.getNext (); // se cambia la referencia del primer nodo al siguiente en la cadena
                    node.setNext (null); // asignar null al campo next elimina su referencia
                    /*node = first;*/
                    /*continue*/
                    node = null; // para finalmente eliminar al nodo completo
                    break;
                } else { // si existe un nodo anterior
                    prev.setNext (node.getNext ()); // se asigna la referencia del siguiente nodo en su campo next
                    node.setNext (null);
                    /*node = first;*/
                    /*continue;*/
                    node = null;
                    break;
                }
            }

            // se intercambian los apuntadores
            prev = node;
            node = node.getNext ();
        }
    }

    /**
     * Recorre la lista mediante sus apuntadores al siguiente elemento
     * imprimiendo por pantalla el valor almacenado en cada nodo
     */
    public void show () {
        Node<T> node = first; // a partir del nodo inicial
        while (node != null) { // se recorre la lista mediante los apuntadores definidos en el campo next
            System.out.println (node.toString ());
            node = node.getNext ();
        }
    }

}
