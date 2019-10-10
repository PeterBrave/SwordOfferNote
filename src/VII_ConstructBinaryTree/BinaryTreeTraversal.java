package VII_ConstructBinaryTree;

/**
 * @author kavin
 * @date 2019-10-10 15:23
 * 在main函数里面，我们构建了一个
 * 1
 * 2 3
 * 4 5 6 7
 * 8 9 10 11 12 13 14 15
 * 的二叉树
 */
public class BinaryTreeTraversal {

    public static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void midOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        midOrder(node.left);
        System.out.println(node.val);
        midOrder(node.right);
    }

    public static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        System.out.println("前序遍历结果：");
        preOrder(root);
        System.out.println("中序遍历结果：");
        midOrder(root);
        System.out.println("后序遍历结果：");
        postOrder(root);

    }


}
