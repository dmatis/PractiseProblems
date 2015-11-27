package LinkedList;
public class MyLinkedList {
    Node root = null;

    public MyLinkedList() {
        this.root = new Node(1);
    }

    public Node getRoot() {
        return this.root;
    }

    public void deleteNode(Node node) {
        Node root = getRoot();
        while (root.next != null) {
            if (root.next.getValue() == node.getValue()) {
                root.next = node.next;
                break;
            }
            root = root.next;
        }
    }

    public Node getNode(int value) {
        Node root = getRoot();
        while (root.next != null) {
            if (root.getValue() == value) {
                return root;
            }
            root = root.next;
        }
        return root;
    }

    //Assume all insertions added on the end of the list
    public void insertNode(int value) {
        Node tail = new Node(value);
        getLastNode(root).next = tail;
    }

    public Node getLastNode(Node root) {
        if (root.next == null) {
            return root;
        } else return getLastNode(root.next);
    }

    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        System.out.print("MyLinkedList Created, root: ");
        myLL.getRoot().printNode();
        myLL.insertNode(5);
        Node lastNode = myLL.getLastNode(myLL.getRoot());
        System.out.print("inserted ");
        lastNode.printNode();
        myLL.insertNode(7);
        System.out.print("inserted ");
        myLL.getLastNode(myLL.getRoot()).printNode();

        myLL.deleteNode(myLL.getNode(7));
        System.out.println("Node with value 7 deleted ----");
        System.out.print("Last node is ");
        myLL.getLastNode(myLL.getRoot()).printNode();
        myLL.insertNode(9);
        System.out.print("inserted ");
        myLL.getLastNode(myLL.getRoot()).printNode();

        myLL.deleteNode(myLL.getNode(5));
        System.out.println("Node with value 5 deleted ----");
        System.out.print("Last node is ");
        myLL.getLastNode(myLL.getRoot()).printNode();
    }
}
