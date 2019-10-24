package XXXII_PrintTreesInLines;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author kavin
 * @date 2019-10-22 16:03
 */
public class Solution3 {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<Integer> subArray = new ArrayList();
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        if (pRoot == null) {
            return array;
        }

        Stack<TreeNode> stack0 = new Stack<>();
        Stack<TreeNode> stack1 = new Stack<>();

        int current = 0;

        stack0.push(pRoot);

        while (!stack0.empty() || !stack1.empty()) {

            TreeNode node;
            if (current == 0) {
                node = stack0.peek();
                stack0.pop();
            } else {
                node = stack1.peek();
                stack1.pop();
            }

            subArray.add(node.val);

            if (current == 0) {
                if (node.left!=null){
                    stack1.push(node.left);
                }
                if (node.right!=null){
                    stack1.push(node.right);
                }
            } else {
                if (node.right!=null){
                    stack0.push(node.right);
                }
                if (node.left!=null){
                    stack0.push(node.left);
                }
            }

            if (current == 0 && stack0.empty()) {
                array.add(subArray);
                subArray = new ArrayList<>();
                current = 1-current;
                continue;
            }

            if (current == 1 && stack1.empty()) {
                array.add(subArray);
                subArray = new ArrayList<>();
                current = 1-current;
                continue;
            }


        }
        return array;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);

        System.out.println(Print(root));
    }
}
