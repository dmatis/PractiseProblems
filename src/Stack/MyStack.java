package Stack;

public class MyStack {
    Node top;

    public Cat pop() {
        if (top != null) {
            Cat cat = top.data;
            top = top.next;
            return cat;
        }
        return null;
    }

    public void push(Cat obj) {
        Node t = new Node(obj);
        t.next = top;
        top = t;
    }

    public Cat getTopElement() {
        return top.data;
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        Cat persian = new Cat("betty", "Persian");
        Cat siam = new Cat("siam", "Siamese");
        Cat ginger = new Cat("ginger", "Maine Coone");
        stack.push(persian);

        System.out.println(stack.pop().getName());
    }


}
