/*
 * Copyright (c) 2021. helloteemo.com.cn All rights reserved.
 *
 * ProjectName: leetcode
 * FileName: XorOperationInAnArray.java
 * Date: 2021/5/7 下午3:42
 * Author: HelloTeemo
 *
 */

package y2021.m05.d07;

/**
 * @Author HelloTeemo
 * @Date 2021/5/7 3:36 下午
 *
 * <a>https://leetcode-cn.com/problems/xor-operation-in-an-array/</a>
 */
public class XorOperationInAnArray {
    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; i++) {
            ans ^= start + 2 * i;
        }
        return ans;
    }
}
