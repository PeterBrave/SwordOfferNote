package XVII_Print1ToMaxOfNDigits;

/**
 * @author kavin
 * @date 2019-10-03 14:43
 */
public class Solution {
    public static void Print1ToMaxOfDigits(int n) {
        if (n<=0){
            return;
        }
        char[] number = new char[n+1];
        for (char c : number) {
            c = '0';
        }
        while (!Increment(number)) {
            PrintNumber(number);
        }
    }

    public static boolean Increment(char[] number) {
        boolean isOverflow = false;
        int nTakeOver = 0;
        int nLength = number.length;
        for (int i=nLength-1; i>=0; i--) {
            int nSum = number[i]-'0'+nTakeOver;
            if (i == nLength - 1) {
                nSum++;
            }
            if (nSum>=10) {
                if (i == 0) {
                    isOverflow = true;
                } else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char)('0'+nSum);
                }
            } else {
                number[i] = (char)('0' + nSum);
                break;
            }
        }
        return isOverflow;
    }

    public static void PrintNumber(char[] number) {
        boolean isBegining0 = true;
        int nLength = number.length;
        for (int i=0; i<nLength; i++) {
            if (isBegining0 && number[i]!='0') {
                isBegining0 = false;
            }
            if (!isBegining0) {
                System.out.println(number[i]);
            }
        }
    }

    public static void main(String[] args) {
        Print1ToMaxOfDigits(1);
    }
}
