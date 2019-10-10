package XXIV_ReverseList;

/**
 * @author kavin
 * @date 2019-10-07 14:56
 */
public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode mid = head.next;
        ListNode last = head.next.next;

        head.next = null;
        while (last != null) {
            mid.next = pre;
            pre = mid;
            mid = last;
            last = last.next;
        }
        mid.next = pre;
        return mid;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = ReverseList(head);
        System.out.println(result.val);
    }
}
