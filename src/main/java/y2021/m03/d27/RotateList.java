package y2021.m03.d27;

import common.ListNode;


/**
 * @Author Frank
 * @Date 2021/3/27 1:59 下午
 *
 * <a>https://leetcode-cn.com/problems/rotate-list/</a>
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        // 定义未知情况
        if (head == null || k == 0 || head.next == null) {
            return head;
        }
        int listLength = getListLength(head);
        int lastNodeIndex = (listLength - 1) - (k % listLength);
        if ((k % listLength) == 0) {
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        int i = 0;
        while (i < lastNodeIndex) {
            p = p.next;
            q = q.next;
            i++;
        }
        ListNode headTmp = p.next;
        p.next = null;
        p = headTmp;
        while (p.next != null) {
            p = p.next;
        }
        p.next = head;
        return headTmp;
    }

    public int getListLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        ListNode p = head;
        int length = 0;
        while (p != null) {
            p = p.next;
            length++;
        }
        return length;
    }
}
