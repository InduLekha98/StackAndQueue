
import linkedlist.*;

public class Queue <K> {
    private final LinkedList<K> linkedlist;

    public Queue() {
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

    public void printQueue() {
        linkedlist.printNodes();
    }
}
