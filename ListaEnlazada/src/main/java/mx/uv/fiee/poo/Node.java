package mx.uv.fiee.poo;

/**
 * Representa al nodo de la lista enlazada
 *
 * @param <T> indica el tipo que será almacenado
 */
public class Node<T> {
    private Node<T> next; // apuntador al siguiente nodo
    private T value; // valor almacenado

    /**
     * Constructor
     * @param value valor a ser almacenado
     */
    public Node (T value) {
        this.value = value; // el valor recibido se almacena en el campo
        this.next = null;
    }

    /**
     * Establece la referencia al siguiente nodo
     * @param nextNode objeto Node siguiente
     */
    public void setNext (Node<T> nextNode) {
        next = nextNode;
    }

    /**
     * Recupera la referencia al sigiente nodo
     * @return objeto Node referente al siguiente nodo
     */
    public Node<T> getNext () {
        return next;
    }

    /**
     * Recupera el valor almanacenado en el nodo
     *
     * @return valor actual
     */
    public T getValue () {
        return value;
    }

    @Override
    public String toString() {
        return "Node {" +
                "value = " + value +
                '}';
    }
}
