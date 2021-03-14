import linkedlist.*;

public class Stack {
    private final linkedList<K> linkedlist;

    public Stack() {
        linkedlist = new LinkedList<>();
    }

    public void push(Node<K> value) {
        linkedlist.add(value);
    }

    public void printStack() {
        linkedlist.printNodes();
    }
}
