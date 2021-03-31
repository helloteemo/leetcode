package y2021.m03.d31;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Frank
 * @Date 2021/3/31 8:54 上午
 * <p>
 * 子集 II
 *
 * <a>https://leetcode-cn.com/problems/subsets-ii/</a>
 */
public class Subsets2 {
    /**
     * @param nums 数组
     * @return 该数组所有可能的子集，不包含重复子集
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new LinkedList<>();
        // 因为总共会有2^n-1个自己
        int max = 1 << nums.length;
        for (int i = 0; i < max; i++) {
            List<Integer> t = new LinkedList<>();
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    if (j > 0 && (i >> (j - 1) & 1) == 0 && nums[j] == nums[j - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[j]);
                }
            }
            if (flag) {
                results.add(t);
            }
        }
        return results;
    }
}
