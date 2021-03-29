package common;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date 2021/3/27 2:37 下午
 */
public class UtilsTest {

    @Test
    public void equalsList() {
        // 测试空值情况
        assertTrue(Utils.equalsList(null, null));
        ListNode head1;
        ListNode head2;

        head1 = new ListNode(1);
        head2 = new ListNode(2);
        assertFalse(Utils.equalsList(head1, head2));

        head1 = new ListNode(1);
        head2 = new ListNode(1);
        assertTrue(Utils.equalsList(head1, head2));

        ListNode head11 = new ListNode(2);
        head1 = new ListNode(1, head11);
        head2 = new ListNode(1);
        assertFalse(Utils.equalsList(head1, head2));
    }

    @Test
    public void parseArrayNode() {
        int[] arr = new int[]{1, 2, 3, 4};
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        assertTrue(Utils.equalsList(head, Utils.parseArrayNode(arr)));
    }
}