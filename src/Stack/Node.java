package Stack;

public class Node {
    Cat data;
    Node next;

    public Node(Cat obj) {
        this.data = obj;
        next = null;
    }

    public Object getData() {
        return this.data;
    }
}
