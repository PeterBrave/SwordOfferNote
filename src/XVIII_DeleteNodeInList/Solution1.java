package XVIII_DeleteNodeInList;

/**
 * @author kavin
 * @date 2019-10-03 15:49
 */
public class Solution1 {
    public void deleteNode(ListNode head, ListNode deListNode) {
        if (head == null || deListNode == null) {
            return;
        }

        //要删除的节点是头结点
        if (head == deListNode) {
            head = null;
        } else {
            //要删除的节点是尾节点
            if (deListNode.next == null) {
                ListNode pointListNode = head;
                while (pointListNode.next.next != null){
                    pointListNode = pointListNode.next;
                }
                pointListNode.next = null;
                //要删除的节点是中间的节点
            } else {
                deListNode.val = deListNode.next.val;
                deListNode.next = deListNode.next.next;
            }
        }
    }
}
