package y2021.m03.d26;

import common.ListNode;

import java.util.List;

/**
 * @Author Frank
 * @Date 2021/3/26 3:00 下午
 * <p>
 * 删除排序链表中的重复元素
 *
 * <a>https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/</a>
 */
public class RemoveDuplicatesFromSortedList {
    /**
     * @param head 链表，必须是有序的
     * @return 删除重复元素之后的链表，该链表不会互相影响
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head.next;
        ListNode ans = new ListNode(head.val, null);
        ListNode q = ans;
        int previous = head.val;

        while (p != null) {
            if (p.val != previous) {
                q.next = new ListNode(p.val);
                previous = p.val;
                q = q.next;
            }
            p = p.next;
        }
        return ans;
    }
}
