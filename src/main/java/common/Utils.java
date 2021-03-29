package common;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Frank
 * @Date 2021/3/27 2:34 下午
 */
public class Utils {

    public static ListNode parseArrayNode(int[] arr) {
        ListNode head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            ListNode p = new ListNode(arr[i], head);
            head = p;
        }
        return head;
    }

    public static int[] parseArray(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean equalsList(ListNode head1, ListNode head2) {
        if (head1 == null && head2 != null) {
            return false;
        }
        if (head1 != null && head2 == null) {
            return false;
        }
        ListNode p = head1, q = head2;
        while (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return p == null && q == null;

    }
}
