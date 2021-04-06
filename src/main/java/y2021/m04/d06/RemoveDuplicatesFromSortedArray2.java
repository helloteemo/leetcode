package y2021.m04.d06;

import java.util.Arrays;

/**
 * @Author Frank
 * @Date 2021/4/6 1:40 下午
 * <p>
 * 删除有序数组中的重复项 II
 *
 * <a>https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/</a>
 */
public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 2, fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
