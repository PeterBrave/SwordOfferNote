package XXII_KthNodeFromEnd;

/**
 * @author kavin
 * @date 2019-10-05 18:55
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <1) {
            return null;
        }
        ListNode pre = head;
        ListNode last = head;
        int temp = 1;
        while (temp<k) {
            if (last.next!=null) {
                last = last.next;
                temp++;
            } else {
                return null;
            }
        }
        while (last.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return pre;
    }
}
