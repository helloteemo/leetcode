/*
 * Copyright (c) 2021. helloteemo.com.cn All rights reserved.
 *
 * ProjectName: leetcode
 * FileName: LeafSimilarTrees.java
 * Date: 2021/5/10 下午8:06
 * Author: HelloTeemo
 *
 */

package y2021.m05.d10;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HelloTeemo
 * @Date 2021/5/10 8:06 下午
 */
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfsLeaf(root1, list1);
        dfsLeaf(root2, list2);
        return list1.equals(list2);
    }

    private void dfsLeaf(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (isLeaf(root)) {
            list.add(root.val);
            return;
        }
        dfsLeaf(root.left, list);
        dfsLeaf(root.right, list);
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
