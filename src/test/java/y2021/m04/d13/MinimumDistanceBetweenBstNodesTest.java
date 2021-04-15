package y2021.m04.d13;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/13 9:05 上午
 */
public class MinimumDistanceBetweenBstNodesTest {

    @Test
    public void minDiffInBst() {
        MinimumDistanceBetweenBstNodes nodes = new MinimumDistanceBetweenBstNodes();
        TreeNode root1 = new TreeNode(1);
        TreeNode root3 = new TreeNode(3);
        TreeNode root2 = new TreeNode(2, root1, root3);
        TreeNode root6 = new TreeNode(6);
        TreeNode root = new TreeNode(4, root2, root6);


        int res = nodes.minDiffInBst(root);
        assertEquals(res, 1);
    }
}