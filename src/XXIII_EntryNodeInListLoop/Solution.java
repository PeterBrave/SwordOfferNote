package XXIII_EntryNodeInListLoop;

/**
 * @author kavin
 * @date 2019-10-06 09:25
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) {
            return null;
        }
        //step1:判断链表是否有环，没有环直接返回null，有环的话，计算出环的长度
        ListNode fastHead = pHead;
        ListNode slowHead = pHead;
        int loop = 1;

        while (fastHead != null) {
            fastHead = fastHead.next.next;
            slowHead = slowHead.next;
            if (fastHead == null) {
                return null;
            }
            //一旦快慢指针相遇，那么必然是在环中的某一个节点相遇的
            if (fastHead == slowHead) {
                while (fastHead.next != slowHead) {
                    loop++;
                    fastHead = fastHead.next;
                }
                break;
            }
        }

        //step2: 根据环的长度，找到环的入口节点
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        for (int i=0; i<loop; i++){
            p1 = p1.next;
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
