package other;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Frank
 * @Date 2021/4/1 1:43 下午
 * <p>
 * 102. 二叉树的层序遍历
 * </p>
 * <a>https://leetcode-cn.com/problems/binary-tree-level-order-traversal/</a>
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new LinkedList<>();
            int max = queue.size();
            for (int i = 0; i < max; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(tmp);
        }
        return list;
    }
}
