package other;

import common.TreeNode;

/**
 * @Author Frank
 * @Date 2021/3/30 4:15 下午
 * <p>
 * 平衡二叉树
 *
 * <a>https://leetcode-cn.com/problems/balanced-binary-tree/</a>
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
