package XXXII_PrintTreesInLines;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author kavin
 * @date 2019-10-22 15:16
 */
public class Solution2 {
    public void PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque deque = new LinkedList();
        int nextLevel = 0;
        int toBePrinted = 1;

        deque.addLast(root);
        while (deque.size() != 0) {
            TreeNode node = (TreeNode) deque.getFirst();
            System.out.println(node.val);
            if (node.left!=null) {
                deque.addLast(node.left);
                nextLevel++;
            }
            if (node.right!=null) {
                deque.addLast(node.right);
                nextLevel++;
            }
            deque.pollFirst();
            toBePrinted--;
            if (toBePrinted == 0) {
                System.out.println('\n');
                toBePrinted = nextLevel;
                nextLevel = 0;
            }
        }

    }
}