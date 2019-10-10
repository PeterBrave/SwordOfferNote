package XVI_Power;

/**
 * @author kavin
 * @date 2019-10-02 19:38
 * 此处并未考虑优化问题
 */
public class Solution {
    public double Power(double base, int exponent) {
        double result = 0;
        //当底数为0的时候，计算0的整数次方就没有意义
        if (Double.toString(base).equals(Double.toString(0))) {
            return 0;
        }
        if (exponent < 0) {
            result = PowerExponent(base, -1*exponent);
            result = 1.0/result;
        }
        if (exponent > 0) {
            result = PowerExponent(base, exponent);
        }
        if (exponent == 0) {
            result = 1;
        }
        return result;
    }

    public double PowerExponent(double base, int exponent) {
        double result = 1.0;
        for (int i=1; i<=exponent; i++) {
            result *=base;
        }
        return result;
    }
}
