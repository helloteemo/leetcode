package other;

import common.TreeNode;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/4/1 2:40 下午
 */
public class PathSumTest {

    @Test
    public void hasPathSum() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.left = node1;
//        TreeNode node2 = new TreeNode(3);

        PathSum pathSum = new PathSum();
        assertFalse(pathSum.hasPathSum(root, 1));
    }
}