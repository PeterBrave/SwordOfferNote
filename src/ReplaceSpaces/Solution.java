package ReplaceSpaces;


/**
 * @author kavin
 * @date 2019-09-05 13:37
 * 替换空格
 * 用Java实现，比较简单，具体代码如下。
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer res = new StringBuffer();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

}
