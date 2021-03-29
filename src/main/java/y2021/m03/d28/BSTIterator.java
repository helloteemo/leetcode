package y2021.m03.d28;

import common.TreeNode;
import sun.jvm.hotspot.debugger.linux.x86.LinuxX86CFrame;

import java.util.ArrayList;

/**
 * @Author Frank
 * @Date 2021/3/28 9:27 下午
 * 二叉搜索树迭代器
 * <a>https://leetcode-cn.com/problems/binary-search-tree-iterator/</a>
 */
public class BSTIterator {
    private ArrayList<Integer> arrayList;

    private int index;

    public BSTIterator(TreeNode root) {
        arrayList = new ArrayList<>();

        genArrayList(root);
    }

    private void genArrayList(TreeNode node) {
        if (node != null) {
            genArrayList(node.left);
            arrayList.add(node.val);
            genArrayList(node.right);
        }
    }

    public int next() {
        return arrayList.get(index++);
    }

    public boolean hasNext() {
        return index < arrayList.size();
    }
}
