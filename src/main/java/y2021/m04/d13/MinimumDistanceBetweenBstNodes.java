package y2021.m04.d13;

import common.TreeNode;

import java.util.Stack;

/**
 * @Author Frank
 * @Date 2021/4/13 9:04 上午
 * <p>
 * 783. 二叉搜索树节点最小距离
 *
 * <a>https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/</a>
 */
public class MinimumDistanceBetweenBstNodes {

    public int minDiffInBst(TreeNode root) {
        int min = Integer.MAX_VALUE, secondMinimum = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                if (min > node.val) {
                    min = node.val;
                } else if (secondMinimum > node.val) {
                    secondMinimum = node.val;
                }
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return secondMinimum - min;
    }
}
