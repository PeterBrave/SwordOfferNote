package TwoDimensionalArrayLlookup;

/**
 * @author kavin
 * @date 2019-09-05 09:44
 * 这是最简单的办法，暴力遍历整个数组，时间复杂度是O(n^2)
 */
public class Solution {
    public static boolean Find(int target, int [][] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2},{2,3},{3,4}};
        System.out.println(Find(5, a));
    }
}
