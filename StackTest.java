import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import linkedlist.*;


public class StackTest {

    @Test
    public void givenValues_WhenAddedToStack_ShouldAddedToTheTopOfStack() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Stack<Integer> stack = new Stack<>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        boolean result = thirdNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(firstNode);
        Assertions.assertTrue(result);
    }

}

}
