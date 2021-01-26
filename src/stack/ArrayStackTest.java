package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {
    public ArrayStack arrayStack=new ArrayStack(5);

    @Test
    public void isFull() {

    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void push() {
        arrayStack.push(1);
        arrayStack.push(4);
        arrayStack.push(2);
        arrayStack.list();
    }

    @Test
    public void pop() {
        arrayStack.push(1);
        arrayStack.push(4);
        arrayStack.push(2);
        arrayStack.list();
        arrayStack.pop();
        arrayStack.list();

    }

    @Test
    public void list() {
    }
}