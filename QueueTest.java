import linkedlist.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void givenValues_WhenAddedToQueue_ShouldAddedToTheTopOfQueue() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Queue<Integer> Queye = new Queue<>();
        Queye.push(firstNode);
        Queye.push(secondNode);
        Queye.push(thirdNode);
        Queye.printQueue();
        boolean result = thirdNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(firstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void whenPeekOperationInQueue_ShouldReturnTopValueOfQueue() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Queue<Integer> Queue = new Queue<>();
        Queue.push(firstNode);
        Queue.push(secondNode);
        Queue.push(thirdNode);
        Queue.printQueue();
        Node<Integer> topNode = Queue.peek();
        System.out.println("Top of Queue: " + topNode.getValue());
        Assertions.assertEquals(thirdNode, topNode);
    }

    @Test
    public void whenPopkOperationInQueue_ShouldRemoveValueFromTopOfQueue() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Queue<Integer> Queue = new Queue<>();
        Queue.push(firstNode);
        Queue.push(secondNode);
        Queue.push(thirdNode);
        Queue.printQueue();
        Node<Integer> topNode = Queue.pop();
        System.out.println("Removed Value: " + topNode.getValue());
        Queue.printQueue();
        Assertions.assertEquals(thirdNode, topNode);
    }
}
