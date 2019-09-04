package DuplicateNumbersInTheArray;


/**
 * @author kavin
 * @date 2019-09-04 20:54
 * 题目描述: 不修改数组找出重复数字。
 * 在一个长度为n+1的数组里的所有数字都在1到n的范围内。
 * 所以数组中至少一个数字是重复的，请找出数组中任意一个重复的数字，但是不能修改数组。
 * 例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出的重复的数字为2或者3。
 * 此处使用了2分法，采用的是时间换空间的做法。
 */
public class SolutionWithOutModify {
    public static int getDuplicate(int numbers[],int length) {
        //边界条件的判断
        if (numbers == null || length <= 0) {
            return -1;
        }
        //正式的算法
        int start = 1;
        int end = length - 1;
        while (end >= start) {
            int middle = ((end - start) >> 1 ) + start;
            int count = countRange(start, middle, length, numbers);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count>(middle-start+1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    static int countRange(int start, int end, int length, int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i<length; i++) {
            if (numbers[i] >= start && numbers[i] <= end ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,3,2,6,7,2};
        System.out.println(getDuplicate(arr, arr.length));

    }
}


