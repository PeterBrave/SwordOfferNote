package PrintListInReversedOrder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author kavin
 * @date 2019-09-05 20:26
 */
public class Solution {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null) {
            return new ArrayList<>();
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> array = new ArrayList<>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.empty()) {
            array.add(stack.pop());
        }
        return array;
    }


    public static void main(String[] args) {
        int[] arr = {};
        ListNode listNode = new ListNode(arr);
        System.out.println(printListFromTailToHead(listNode));
    }
}
