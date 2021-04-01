package y2021.m04.d01;

import java.util.*;

/**
 * @Author Frank
 * @Date 2021/4/1 9:02 上午
 * <p>
 * 1006. 笨阶乘
 *
 * <a>https://leetcode-cn.com/problems/clumsy-factorial/</a>
 */
public class ClumsyFactorial {

    public int clumsy(int n) {
        // 操作树栈
        Deque<Integer> a = new LinkedList<>();
        a.push(n);
        int index = 0;
        for (int i = n - 1; i > 0; i--) {
            int j = (index++) % 4;
            if (j == 0) {
                // 乘
                a.push(i * a.pop());
            } else if (j == 1) {
                // 除
                a.push(a.pop() / i);
            } else if (j == 2) {
                // 加
                a.push(i);
            } else {
                // 减
                a.push(-i);
            }
        }
        int res = 0;
        while (!a.isEmpty()) {
            res += a.pop();
        }
        return res;
    }
}
