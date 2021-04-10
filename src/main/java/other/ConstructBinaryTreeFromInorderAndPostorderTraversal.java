package other;

import common.TreeNode;

import java.util.Arrays;

/**
 * @Author Frank
 * @Date 2021/4/8 5:09 下午
 * <p>
 * 106. 从中序与后序遍历序列构造二叉树
 *
 * <a>https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal</a>
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 && postorder.length == 0) {
            return null;
        }
        if (inorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        int rootVal = postorder[postorder.length - 1];
        int rootIndex = firstIndex(inorder, rootVal);
        int[] inorderLeft = genArr(inorder, 0, rootIndex);
        int[] inorderRight = genArr(inorder, rootIndex + 1, inorder.length - rootIndex - 1);
        int[] postorderLeft = genArr(inorder, 0, inorderLeft.length);
        int[] postorderRight = genArr(inorder, inorderLeft.length, inorder.length - inorderLeft.length - 1);

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(inorderLeft, postorderLeft);
        root.right = buildTree(inorderRight, postorderRight);
        return root;
    }

    private static int[] genArr(int[] arr, int start, int len) {
        int[] tmp = new int[len];
        int index = start;
        for (int i = 0; i < len; i++) {
            tmp[i] = arr[index++];
        }
        return tmp;
    }

    private int firstIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
