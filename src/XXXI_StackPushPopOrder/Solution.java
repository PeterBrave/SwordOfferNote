package XXXI_StackPushPopOrder;

import java.util.Stack;

/**
 * @author kavin
 * @date 2019-10-21 13:29
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i=0, j=0;
        boolean flag = true;

        while (i<pushA.length || j<popA.length){
            if (i<popA.length) {
                stack.push(pushA[i]);
            } else {
                flag = false;
            }
            if (flag == false) {
                if (stack.peek() != popA[j])
                    return false;
            }
            if (stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
            i++;
        }
        return true;
    }


}
