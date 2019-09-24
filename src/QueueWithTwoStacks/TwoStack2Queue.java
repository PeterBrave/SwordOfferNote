package QueueWithTwoStacks;

import java.util.Stack;

/**
 * @author kavin
 * @date 2019-09-23 21:46
 */
public class TwoStack2Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            if (!stack2.isEmpty()) {
                return stack2.pop();
            } else {
                return -1;
            }
        } else {
            return stack2.pop();
        }
    }

}
