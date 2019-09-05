package TwoDimensionalArrayLlookup;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author kavin
 * @date 2019-09-05 10:01
 * 由于这是一个拍好顺序的二维数组，因此一定是有规律可循的
 * 排序规则：每一行从左到右递增，每一列从上到下递增
 * 因此我们可以从左下角或者右上角开始
 * 写循环，需要想清楚，循环开始条件，循环终止条件，循环时要改变的条件。这些问题想清楚，写起来也会好写很多
 */
public class Solution2 {
    public static boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = 0;
        while (row-1>=0 && col < array[0].length) {
            if (array[row-1][col] == target) {
                return true;
            } else {
                if (array[row-1][col] > target) {
                    row--;
                } else {
                    col++;
                }
            }
        }
        return false;
    }
}
