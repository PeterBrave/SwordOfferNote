package XI_MinNumberInRotatedArray;

/**
 * @author kavin
 * @date 2019-10-01 10:29
 * 这是初级不完整的解法
 */
public class Solution1 {
    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length <= 0) {
            throw new IllegalArgumentException("参数错误");
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while (array[index1] >= array[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            if (array[index1] <= array[indexMid]) {
                index1 = indexMid;
            } else if (array[index2] >= array[indexMid]) {
                index2 = indexMid;
            }
        }
        return array[indexMid];

    }
}
