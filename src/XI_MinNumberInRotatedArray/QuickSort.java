package XI_MinNumberInRotatedArray;

import java.util.Arrays;

/**
 * @author kavin
 * @date 2019-09-25 09:42
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        int i,j,temp,bm;
        if(low > high) {
            return;
        }

        i = low;
        j = high;
        bm = arr[low];

        while(i<j) {
            while(arr[j]>=bm&&i<j) {
                j--;
            }
            while(arr[i]<=bm&&i<j) {
                i++;
            }
            //此处做一个判断，当i<j的时候再换，如果不是i<j那么一定是i==j。换与不换的结果都是一样的。因此
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[i];
        arr[i] = bm;

        quickSort(arr, low, i-1);
        quickSort(arr, i+1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
