package ReplaceSpaces;

import java.util.Arrays;

/**
 * @author kavin
 * @date 2019-09-05 14:33
 * 相关题目
 * 两个排序的数组A1和A2，内存在A1的末尾有足够的空余空间容纳A2。请实现一个函数，把A2中的所有数字插入到A1中，并且所有的数字都是排序的。
 */
public class Solution2 {
    public static int[] combineArray(int[] arr1, int[] arr2) {
        int index1 = arr2.length - 1;
        int index2 = arr2.length - 1;
        int index = arr2.length * 2 - 1;
        while (index>0) {
            if (arr1[index1] >= arr2[index2]) {
                arr1[index] = arr1[index1];
                index1--;
                index--;
            } else {
                arr1[index] = arr2[index2];
                index2--;
                index--;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,9, 0, 0, 0, 0};
        int[] arr2 = {2,4,6,8};
        System.out.println(Arrays.toString(combineArray(arr1, arr2)));
    }

}
