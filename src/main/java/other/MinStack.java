package other;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author Frank
 * @Date 2021/3/31 1:50 下午
 * <p>
 * 最小栈
 *
 * <a>https://leetcode-cn.com/problems/min-stack/</a>
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min = Integer.MIN_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || val < min) {
            min = val;
        }
        minStack.push(val);
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
