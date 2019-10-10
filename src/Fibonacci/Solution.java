package Fibonacci;

/**
 * @author kavin
 * @date 2019-09-24 15:02
 * 本题采用递归的方式效率有点差，本质原因是因为重复计算的数值太多，严重影响效率
 */
public class Solution {
    public static int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return n;
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i<n+1; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}