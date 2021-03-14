import org.junit.jupiter.api.Assertions;

import linkedlist.*;
import org.junit.jupiter.api.Test;

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
        Assert.assertTrue(result);
    }

    @Test
    public void whenPeekOperationInStack_ShouldReturnTopValueOfStack() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Stack<Integer> stack = new Stack<>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        Node<Integer> topNode = stack.peek();
        System.out.println("Top of stack: " + topNode.getValue());
        Assertions.assertEquals(thirdNode, topNode);
    }
