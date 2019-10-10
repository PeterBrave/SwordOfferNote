package Fibonacci;

/**
 * @author kavin
 * @date 2019-09-24 14:44
 */
public class Test {
    static int addFrom1ToN(int n) {
        return n<=0?0:n+addFrom1ToN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(addFrom1ToN(10000));
    }
}
