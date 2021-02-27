public class Stack<E> {

    private final E [] store;
    private int index = 0;

    @SuppressWarnings("unchecked")
    public Stack (int capacity)  {
        store = (E[]) new Object [capacity];
    }

    public E pop () {
        return store [--index];
    }

    public void push (E val) {
        store [index] = val;
        index++;
    }

}
