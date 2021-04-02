package other;

import common.TreeNode;

/**
 * @Author Frank
 * @Date 2021/4/1 2:40 下午
 * <p>
 * 112. 路径总和
 *
 * <a>https://leetcode-cn.com/problems/path-sum/</a>
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val)
                ||
                hasPathSum(root.right, targetSum - root.val);
    }

}
