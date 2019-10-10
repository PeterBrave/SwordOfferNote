package XIX_RegularExpressionsMatching;

/**
 * @author kavin
 * @date 2019-10-05 09:18
 */
public class Solution {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }

        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);
    }

    public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*' ) {
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
                    || (pattern[patternIndex] == '.' && strIndex != str.length)) {
                return matchCore(str, strIndex, pattern, patternIndex+2)
                        || matchCore(str, strIndex+1, pattern, patternIndex+2)
                        || matchCore(str, strIndex+1, pattern, patternIndex);
            } else {
                return matchCore(str, strIndex, pattern, patternIndex+2);
            }
        }

        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
                || (pattern[patternIndex] == '.' && strIndex != str.length)) {
            return matchCore(str, strIndex+1, pattern, patternIndex+1);
        }
        return false;
    }
}
