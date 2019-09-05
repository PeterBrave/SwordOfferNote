package PrintListInReversedOrder;

/**
 * @author kavin
 * @date 2019-09-05 20:24
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int[] nums) {
        ListNode target = new ListNode(nums[0]);
        ListNode head = target;
        for (int i = 1; i < nums.length; i++) {
            target.next = new ListNode(nums[i]);
            target = target.next;
        }
        this.val = head.val;
        this.next = head.next;
    }
}
