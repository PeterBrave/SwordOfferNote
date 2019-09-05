# 6. 从尾到头打印链表

刷题是常用的ListNode一般都是作如下实现
```java
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
```

#### `ListNode`中有两个成员变量
一个是int型的`value`，另一个是下一个`ListNode` `next`。
#### 两个构造函数
- 一个是传入一个`int`型数`x`。其值将成为该`ListNode`的值，该`ListNode`的`next`属性设置为`null`。

- 第二个构造函数传入一个数组，将数组的第一个元素设置为链表的头，剩下的数，接在这个头部的后面，实现一个链表。