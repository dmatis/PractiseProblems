package Queue;

public class Node<E> {
    protected E data;
    protected Node<E> next;

    public Node(E data) {
        this.data = data;
        next = null;
    }

    public E getData() {
        return this.data;
    }

    public Node<E> getNext() {
        return this.next;
    }
}
