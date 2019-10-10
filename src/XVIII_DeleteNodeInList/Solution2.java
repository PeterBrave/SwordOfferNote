package XVIII_DeleteNodeInList;

/**
 * @author kavin
 * @date 2019-10-03 16:12
 * 题目：删除链表中重复的数字
 */
public class Solution2 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode Head = new ListNode(0);
        Head.next = pHead;
        ListNode pre = Head;
        ListNode last = Head.next;
        while (last!=null) {
            if (last.next != null && last.val == last.next.val) {
                while (last.next !=null && last.val == last.next.val) {
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            } else {
                pre = pre.next;
                last = last.next;
            }
        }
        return Head.next;
    }
}
