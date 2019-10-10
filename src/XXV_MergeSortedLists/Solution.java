package XXV_MergeSortedLists;

import com.sun.scenario.effect.Merge;

/**
 * @author kavin
 * @date 2019-10-07 16:24
 */
public class Solution {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode head;
        if (list1.val >= list2.val) {
            head = list2;
            list2 = list2.next;
            if (list2 == null) {
                head.next = list1;
                return head;
            }
        } else {
            head = list1;
            list1 = list1.next;
            if (list1 == null) {
                head.next = list2;
                return head;
            }
        }
        ListNode result = head;
        while (list1!=null || list2!=null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
                if (list1 == null) {
                    head.next = list2;
                    break;
                }
            } else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
                if (list2 == null) {
                    head.next = list1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);

        ListNode list2 = new ListNode(2);


        ListNode head = Merge(list1, list2);
        System.out.println(head.val);
    }
}
