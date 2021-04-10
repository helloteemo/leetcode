package other;

import common.TreeNode;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/8 5:42 下午
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    public void buildTree() {
        ConstructBinaryTreeFromInorderAndPostorderTraversal tree = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode root = tree.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        System.out.println(root);

    }
}