package other;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/3/31 1:57 下午
 */
public class MinStackTest {
    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();
        assertEquals(min, -3);
        minStack.pop();
        int top = minStack.top();
        assertEquals(top, 0);
        min = minStack.getMin();
        assertEquals(min, -2);
    }
}