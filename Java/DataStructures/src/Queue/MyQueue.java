package Queue;

public class MyQueue<E> {
    private Node<E> front;

    public MyQueue(E element) {
        front = new Node<E>(element);
    }

    public void enqueue(E element) {
        Node<E> newElem = new Node<E>(element);
        if (front == null) {
            front = newElem;
        } else {
            front.next = newElem;
        }
    }

    public E dequeue() {
        Node<E> temp = front;
        front = front.next;
        temp.next = null;
        return temp.data;
    }
}
