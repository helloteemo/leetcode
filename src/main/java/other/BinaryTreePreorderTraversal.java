package other;

import apple.laf.JRSUIUtils;
import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Frank
 * @Date 2021/3/29 5:33 下午
 * <p>
 * 二叉树的前序遍历
 *
 * <a>https://leetcode-cn.com/problems/binary-tree-preorder-traversal/</a>
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return preorderTraversal0(root, list);
    }

    public List<Integer> preorderTraversal0(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal0(root.right, list);
        preorderTraversal0(root.left, list);
        return list;
    }

    public List<Integer> preorderTraversal01(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null && !stack.empty()) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
