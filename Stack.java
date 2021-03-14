import linkedlist.*;

public class Stack<K> {
    private final LinkedList<K> linkedlist;

    public Stack() {
        linkedlist = new LinkedList<>();
    }

    public void push(Node<K> value) {
        linkedlist.add(value);
    }

    public Node<K> peek() {
        return linkedlist.head;
    }

    public Node<K> pop() {
        return linkedlist.pop();
    }

    public void printStack() {
        linkedlist.printNodes();
    }
}
