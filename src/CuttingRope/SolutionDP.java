package CuttingRope;

import java.util.Arrays;

/**
 * @author kavin
 * @date 2019-09-06 09:59
 */
public class SolutionDP {
    public static int cutRope(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }

        int[] products = new int[target+1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;

        int max = 0;
        for (int i=4; i <= target; i++) {
            max = 0;
            for (int j=1; j<=i/2; j++) {
                int product = products[j] * products[i-j];
                if (max < product) {
                    max = product;
                }
                products[i] = max;
            }
        }
        max = products[target];
        return max;
    }

    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }
}