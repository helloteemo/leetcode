package y2021.m04.d12;

import java.util.Arrays;

/**
 * @Author Frank
 * @Date 2021/4/12 10:52 上午
 * <p>
 * <p>
 * 179. 最大数
 *
 * <a>https://leetcode-cn.com/problems/largest-number/</a>
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {

        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array, (a, b) -> {
            String sa = a + b, sb = b + a;
            return sb.compareTo(sa);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            sb.append(s);
        }
        String string = sb.toString();
        return string.charAt(0) == '0' ? "0" : string;
    }
}
