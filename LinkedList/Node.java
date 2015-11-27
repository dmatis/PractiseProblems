package LinkedList;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }

    public int getValue() {
        return this.value;
    }

    public void printNode() {
        System.out.println("Node: " + this.value);
    }
}
