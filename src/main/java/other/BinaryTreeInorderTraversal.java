package other;

import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Frank
 * @Date 2021/3/31 10:42 下午
 * <p>
 * 94. 二叉树的中序遍历
 *
 * <a>https://leetcode-cn.com/problems/binary-tree-inorder-traversal/</a>
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        return inorderTraversal0(root, list);
    }

    private List<Integer> inorderTraversal0(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderTraversal0(root.left, list);
            list.add(root.val);
            inorderTraversal0(root.right, list);
        }
        return list;
    }

    private List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode tmp = stack.pop();
                res.add(tmp.val);
                root = tmp.right;
            }
        }
        return res;
    }

}
