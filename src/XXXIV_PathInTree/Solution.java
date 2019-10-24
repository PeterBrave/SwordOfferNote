package XXXIV_PathInTree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author kavin
 * @date 2019-10-24 15:57
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();

        if (root == null){
            return arrays;
        }

        Stack<Integer> path = new Stack<>();
        int currentSum = 0;
        FindPath(root, target, path, currentSum, arrays);
        return arrays;
    }

    private void FindPath(TreeNode root, int expectedSum, Stack<Integer> path, int currentSum, ArrayList<ArrayList<Integer>> arrays){
        currentSum += root.val;
        path.push(root.val);

        boolean isLeaf = root.left == null && root.right == null;
        if (currentSum == expectedSum && isLeaf){
            ArrayList<Integer> array = new ArrayList<>(path);
            arrays.add(array);
        }

        if (root.left!=null) {
            FindPath(root.left, expectedSum, path, currentSum, arrays);
        }
        if (root.right!=null){
            FindPath(root.right, expectedSum, path, currentSum, arrays);
        }
        path.pop();
    }
}
