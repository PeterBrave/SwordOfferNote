package XV_NumberOf1InBinary;

/**
 * @author kavin
 * @date 2019-10-02 10:40
 */
public class Solution {

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n-1)&n;
        }
        return count;
    }}
