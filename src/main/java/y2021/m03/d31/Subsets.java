package y2021.m03.d31;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Frank
 * @Date 2021/3/31 11:00 上午
 * <p>
 * 子集
 *
 * <a>https://leetcode-cn.com/problems/subsets/</a>
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();

        // 因为总共会有2^n-1个自己
        int max = 1 << nums.length;
        for (int i = 0; i < max; i++) {
            List<Integer> t = new LinkedList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    t.add(nums[j]);
                }
            }
            results.add(t);
        }
        return results;
    }
}
