package XXI_ReorderArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author kavin
 * @date 2019-10-05 16:25
 */
public class Solution2 {
    public static void reOrderArray(int [] array) {
        if (array == null) {
            return;
        }
        int[] arrayEven = new int[array.length];
        int evenCount = 0;
        int oddCount = 0;
        for (int i=0; i<array.length; i++) {
            if ((array[i]&1)==0) {
                arrayEven[evenCount] = array[i];
                evenCount++;
            } else {
                array[oddCount] = array[i];
                oddCount++;
            }
        }

        for (int j=0; j<evenCount; j++) {
            array[oddCount+j] = arrayEven[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }



}
