package y2021.m04.d10;

/**
 * @Author Frank
 * @Date 2021/4/10 9:49 上午
 * <p>
 * 263. 丑数
 *
 * <a>https://leetcode-cn.com/problems/ugly-number/</a>
 */
public class UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            if (n % 5 == 0) {
                n = n / 5;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
