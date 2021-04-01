package other;

/**
 * @Author Frank
 * @Date 2021/3/31 10:15 下午
 * <p>
 * 字符串转换整数 (atoi)
 *
 * <a></a>
 */
public class String2Integer {
    public int myAtoi(String s) {
        if ("".equals(s)) {
            return 0;
        }
        s = s.trim();
        char[] chars = s.toCharArray();
        boolean isNegative = false;
        int start = 0;
        if ('-' == chars[0] || chars[0] == '+') {
            if ('-' == chars[0]) {
                isNegative = true;
            }
            start = 1;
        }
        float num = 0;
        for (int i = start; i < chars.length; i++) {
            char c = chars[i];
            if (c >= '0' && c <= '9') {
                if (num * 10 + (c - '0') > Integer.MAX_VALUE) {
                    num = Integer.MAX_VALUE;
                    break;
                }
                num = (c - '0') + num * 10;
            } else {
                break;
            }
        }
        return isNegative ? (int) -num : (int) num;
    }
}
