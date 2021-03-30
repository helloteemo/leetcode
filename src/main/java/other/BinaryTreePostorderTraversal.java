package other;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Frank
 * @Date 2021/3/30 3:30 下午
 * <p>
 * 二叉树的后序遍历
 * <a>https://leetcode-cn.com/problems/binary-tree-postorder-traversal/</a>
 */
public class BinaryTreePostorderTraversal {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTraversal0(root);
        return list;
    }

    public List<Integer> postorderTraversal0(TreeNode root) {
        if (root != null) {
            postorderTraversal0(root.left);
            postorderTraversal0(root.right);
            list.add(root.val);
        }
        return null;
    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                res.add(0, node.val);
                node = node.right;
            } else {
                node = stack.pop();
                node = node.left;
            }
        }
        return res;
    }

}
