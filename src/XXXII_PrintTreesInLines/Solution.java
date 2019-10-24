package XXXII_PrintTreesInLines;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author kavin
 * @date 2019-10-22 14:25
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList result = new ArrayList();
        Deque deque = new LinkedList();
        if (root == null) {
            return result;
        }
        deque.addLast(root);
        while (deque.size() != 0) {
            TreeNode node = (TreeNode) deque.pollFirst();
            result.add(node.val);
            if (node.left!=null) {
                deque.addLast(node.left);
            }
            if (node.right!=null) {
                deque.addLast(node.right);
            }
        }
        return result;
    }
}
