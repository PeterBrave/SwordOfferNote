package XXI_ReorderArray;

import java.util.Arrays;

/**
 * @author kavin
 * @date 2019-10-05 15:58
 * 要求：调整数组中数的次序，使得奇数在前，偶数在后
 */
public class Solution {
    public static void reOrderArray(int [] array) {
        if (array == null) {
            return;
        }
        int pre = 0;
        int last = array.length-1;

        while (pre<last) {
            while((array[pre]&1)==1) {
                pre++;
            }
            while((array[last]&1)==0) {
                last--;
            }
            if ((array[pre]&1)==0&&(array[last]&1)==1) {
                int temp = array[last];
                array[last] = array[pre];
                array[pre] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
