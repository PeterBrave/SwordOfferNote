package NextNodeInBinaryTrees;

/**
 * @author kavin
 * @date 2019-09-09 16:26
 */
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        } else if (pNode.next != null && pNode.next.right == pNode) {
            while (pNode.next != null && pNode.next.left != pNode) {
                pNode = pNode.next;
            }
            return pNode.next;
        } else {
            return pNode.next;
        }
    }
}
