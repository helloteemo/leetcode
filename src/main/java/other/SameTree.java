package other;

import common.TreeNode;

import java.sql.PreparedStatement;

/**
 * @Author Frank
 * @Date 2021/4/8 9:18 上午
 * <p>
 * 100. 相同的树
 *
 * <a>https://leetcode-cn.com/problems/same-tree/</a>
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
