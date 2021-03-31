package other;

import common.ListNode;

import java.util.List;

/**
 * @Author Frank
 * @Date 2021/3/31 11:36 上午
 * <p>
 * 反转链表
 *
 * <a>https://leetcode-cn.com/problems/reverse-linked-list/</a>
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode tmp = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = tmp;
            tmp = node;
            node = next;
        }
        return tmp;
    }
}
