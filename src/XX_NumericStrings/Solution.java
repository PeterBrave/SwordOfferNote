package XX_NumericStrings;

/**
 * @author kavin
 * @date 2019-10-05 10:06
 */
public class Solution {

    //Solution1
    private int index = 0;
    public boolean isNumeric(char[] str) {
        if (str == null) {
            return false;
        }
        boolean flag = scanInteger(str);

        if (index<str.length && str[index] == '.') {
            index++;
            flag = scanUnsignedInteger(str) || flag;
        }

        if (index < str.length && (str[index] == 'E' || str[index] == 'e')) {
            index++;
            flag = flag && scanInteger(str);
        }

        return flag && index == str.length;
    }

    private boolean scanInteger(char[] str) {
        if (index<str.length && (str[index] == '+' || str[index] == '-')){
            index++;
        }
        return scanUnsignedInteger(str);
    }

    private boolean scanUnsignedInteger(char[] str) {
        int start = index;
        while(index<str.length && str[index]>='0' && str[index]<='9') {
            index++;
        }
        return start<index;
    }

    //Solution2 使用正则表达式
    public static boolean isNumbericRE(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }

    public static void main(String[] args) {
        String s = "0.0e3";
        char[] str;
        str = s.toCharArray();
        System.out.println(isNumbericRE(str));
    }
}
