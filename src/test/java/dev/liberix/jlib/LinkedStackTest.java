package dev.liberix.jlib;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedStackTest {

    @Test
    public void evaluatePushAndPop() {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int peek = stack.peek();
        assertEquals(3,peek);
    }
}
