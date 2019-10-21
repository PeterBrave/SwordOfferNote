package XXX_MinInStack;

import java.util.Stack;

/**
 * @author kavin
 * @date 2019-10-21 10:40
 */
public class Solution {

    static Stack<Integer> minStack = new Stack<>();
    static Stack<Integer> supportStack = new Stack<>();
    public static void push(int node) {
        minStack.push(node);
        if (!supportStack.empty()) {
            int temp = supportStack.pop();
            supportStack.push(temp);
            if (temp>=node) {
                supportStack.push(node);
            } else {
                supportStack.push(temp);
            }
        } else {
            supportStack.push(node);
        }

    }

    public static void pop() {
        if (!minStack.empty()) {
            minStack.pop();
        } else {
            return;
        }
        if (!supportStack.empty()) {
            supportStack.pop();
        } else {
            return;
        }

    }

    public static int top() {
        if (!minStack.empty()) {
            int temp = minStack.pop();
            minStack.push(temp);
            return temp;
        } else {
            return 0;
        }

    }

    public static int min() {
        if (!supportStack.empty()) {
            int temp = supportStack.pop();
            supportStack.push(temp);
            return temp;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        push(3);
        System.out.println(min());
        push(4);
        System.out.println(min());
        push(2);
        System.out.println(min());
        push(3);
        System.out.println(min());
        System.out.println(minStack);
        System.out.println(supportStack);
        pop();
        System.out.println(min());
        pop();
        System.out.println(min());
        push(0);
        System.out.println(min());
    }
}
